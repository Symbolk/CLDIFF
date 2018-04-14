package edu.fdu.se.astdiff.webapi;

import com.github.gumtreediff.actions.model.*;
import com.github.gumtreediff.tree.Tree;
import edu.fdu.se.astdiff.associating.Association;
import edu.fdu.se.astdiff.miningactions.bean.MiningActionData;
import edu.fdu.se.astdiff.miningchangeentity.ChangeEntityData;
import edu.fdu.se.astdiff.miningchangeentity.ClusteredActionBean;
import edu.fdu.se.astdiff.miningchangeentity.base.ChangeEntity;
import edu.fdu.se.astdiff.miningchangeentity.base.ChangeEntityDesc;
import edu.fdu.se.astdiff.miningchangeentity.base.StageIIIBean;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IfStatement;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huangkaifeng on 2018/4/11.
 */
public class GenerateChangeEntityJson {

    private static void setChangeEntityOpt(MiningActionData miningActionData) {
        List<ChangeEntity> changeEntityList = miningActionData.getChangeEntityList();
        for (int i = 0; i < changeEntityList.size(); i++) {
            ChangeEntity changeEntity = changeEntityList.get(i);
            changeEntity.stageIIIBean.setChangeEntityId(changeEntity.changeEntityId);
            if (changeEntity.stageIIBean.getEntityCreationStage().equals(ChangeEntityDesc.StageIIGenStage.ENTITY_GENERATION_STAGE_PRE_DIFF)) {
                changeEntity.stageIIIBean.setKey("preprocess");
            } else {
                changeEntity.stageIIIBean.setKey("gumtree");
            }
            Tree srcNode;
            switch (changeEntity.stageIIBean.getOpt()) {
                case ChangeEntityDesc.StageIIOpt.OPT_INSERT:
                    changeEntity.stageIIIBean.setFile("dst");
                    changeEntity.stageIIIBean.setRange(changeEntity.stageIIBean.getLineRange());
                    break;
                case ChangeEntityDesc.StageIIOpt.OPT_DELETE:
                    changeEntity.stageIIIBean.setFile("src");
                    changeEntity.stageIIIBean.setRange(changeEntity.stageIIBean.getLineRange());
                    break;
                case ChangeEntityDesc.StageIIOpt.OPT_MOVE:
                    changeEntity.stageIIIBean.setFile("src-dst");
                    if (changeEntity.clusteredActionBean.fafather.getTreeSrcOrDst() == ChangeEntityDesc.StageITreeType.SRC_TREE_NODE) {
                        Tree dstNode = (Tree) miningActionData.getMappedDstOfSrcNode(changeEntity.clusteredActionBean.fafather);
                        srcNode = changeEntity.clusteredActionBean.fafather;
                        String rangeStr = srcNode.getRangeString() + "-" + dstNode.getRangeString();
                        changeEntity.stageIIIBean.setRange(rangeStr);
                    }
                    break;
                case ChangeEntityDesc.StageIIOpt.OPT_CHANGE_MOVE:
                    changeEntity.stageIIIBean.setFile("src-dst");
                    srcNode = (Tree) changeEntity.clusteredActionBean.curAction.getNode();
                    if (srcNode.getTreeSrcOrDst() == ChangeEntityDesc.StageITreeType.SRC_TREE_NODE) {
                        Tree dstNode = (Tree) miningActionData.getMappedDstOfSrcNode(srcNode);
                        String rangeStr = srcNode.getRangeString() + "-" + dstNode.getRangeString();
                        changeEntity.stageIIIBean.setRange(rangeStr);
                    }
                    break;
                case ChangeEntityDesc.StageIIOpt.OPT_CHANGE:
                    changeEntity.stageIIIBean.setFile("src-dst");
                    //todo 可能还会变 仅仅获取其change的那几行
                    String rangeStr = null;
                    if (changeEntity.clusteredActionBean.fafather.getTreeSrcOrDst() == ChangeEntityDesc.StageITreeType.SRC_TREE_NODE) {
                        Tree dstNode = (Tree) miningActionData.getMappedDstOfSrcNode(changeEntity.clusteredActionBean.fafather);
                        rangeStr = changeEntity.clusteredActionBean.fafather.getRangeString() + "-" + dstNode.getRangeString();
                    } else {
                        srcNode = (Tree) miningActionData.getMappedSrcOfDstNode(changeEntity.clusteredActionBean.fafather);
                        rangeStr = srcNode.getRangeString() + "-" + changeEntity.clusteredActionBean.fafather.getRangeString();
                    }

                    changeEntity.stageIIIBean.setRange(rangeStr);
                    break;
            }
            changeEntity.stageIIIBean.setDisplayDesc(changeEntity.stageIIBean.toString2());

        }
    }


    public static void setStageIIIBean(ChangeEntityData changeEntityData) {
        setChangeEntityOpt(changeEntityData.mad);
        setChangeEntitySubRange(changeEntityData.mad);

    }

    public static void setChangeEntitySubRange(MiningActionData mad) {
        List<ChangeEntity> mList = mad.getChangeEntityList();
        for (ChangeEntity tmp : mList) {
            if (tmp.stageIIBean.getOpt().equals(ChangeEntityDesc.StageIIOpt.OPT_CHANGE)) {
                // 设置sub 同时设置 大range
                setStageIIIBeanSubRangeDetail(tmp.stageIIIBean, tmp.clusteredActionBean.actions, mad);
            } else if (tmp.stageIIBean.getOpt().equals(ChangeEntityDesc.StageIIOpt.OPT_CHANGE_MOVE)) {
                // 设置move
                setStageIIIBeanSubRangeDetailMove(tmp.stageIIIBean, tmp.clusteredActionBean, mad);
            }
        }
    }

    public static void setStageIIIBeanSubRangeDetailMove(StageIIIBean stageIIIBean, ClusteredActionBean bean, MiningActionData mad) {
        Action a = bean.curAction;
        if (!(a instanceof Move)) {
            return;
        }
        CompilationUnit src = mad.preprocessedData.srcCu;
        CompilationUnit dst = mad.preprocessedData.dstCu;
        Move mv = (Move) a;
        Tree stmtNode = bean.fafather;
        Tree mappedStmtNode = (Tree) mv.getParent();

        stageIIIBean.setRange(stmtNode.getRangeString() + "-" + mappedStmtNode.getRangeString());
        Tree originParent = (Tree) mv.getNode().getParent();
        Tree movedDstNode = (Tree) mad.getMappedDstOfSrcNode(mv.getNode());
        Tree moveNode = (Tree)mv.getNode();
        Integer[] m = {moveNode.getPos(),moveNode.getPos()+moveNode.getLength()};
        Integer[] n = {movedDstNode.getPos(),movedDstNode.getPos()+movedDstNode.getLength()};
        stageIIIBean.addMoveListSrc(m, src);
        stageIIIBean.addMoveListDst(n, dst);
    }

    public static void setStageIIIBeanSubRangeDetail(StageIIIBean stageIIIBean, List<Action> actions, MiningActionData mad) {
        CompilationUnit src = mad.preprocessedData.srcCu;
        CompilationUnit dst = mad.preprocessedData.dstCu;
        List<Integer[]> rangeList = new ArrayList<>();
        MergeIntervals mi = new MergeIntervals();
        actions.forEach(a -> {
            if (a instanceof Insert) {
                Tree temp = (Tree)a.getNode();
                Integer[] tempArr = {temp.getPos(),temp.getPos()+temp.getLength()};
                rangeList.add(tempArr);
            }
        });
        List<Integer[]> insertResult = mi.merge(rangeList);
//        int[] insertRange = maxminLineNumber(insertResult, dst);
        if(insertResult != null && insertResult.size()!=0)
            stageIIIBean.addInsertList(insertResult, dst);
//        String dstRangeStr = "(" + insertRange[0] + "," + insertRange[1] + ")";
        rangeList.clear();
        actions.forEach(a -> {
            if (a instanceof Delete) {
                Tree temp = (Tree)a.getNode();
                Integer[] tempArr = {temp.getPos(),temp.getPos()+temp.getLength()};
                rangeList.add(tempArr);
            }

        });
        List<Integer[]> deleteResult = mi.merge(rangeList);
        if(deleteResult != null && deleteResult.size()!=0)
            stageIIIBean.addDeleteList(deleteResult, src);
//        int[] deleteRange = maxminLineNumber(deleteResult, src);
        rangeList.clear();
        actions.forEach(a -> {
            if (a instanceof Update) {
                Tree temp = (Tree)a.getNode();
                Integer[] tempArr = {temp.getPos(),temp.getPos()+temp.getLength()};
                rangeList.add(tempArr);
            }
        });
        List<Integer[]> updateResult = mi.merge(rangeList);
        if(updateResult != null && updateResult.size()!=0)
            stageIIIBean.addUpdateList(updateResult, src);
//        int[] updateRange = maxminLineNumber(updateResult, src);
//        int max, min;
//        if (deleteRange[0] < updateRange[0]) {
//            min = deleteRange[0];
//        } else {
//            min = updateRange[0];
//        }
//        if (deleteRange[1] > updateRange[1]) {
//            max = deleteRange[1];
//        } else {
//            max = updateRange[1];
//        }
//        String srcRangeStr = "(" + min + "," + max + ")";
//        stageIIIBean.setRange(srcRangeStr + "-" + dstRangeStr);

    }

    public static int[] maxminLineNumber(List<Integer[]> mList, CompilationUnit cu) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer[] tmp : mList) {
            if (tmp[0] < min) {
                min = tmp[0];
            }
            if (tmp[1] > max) {
                max = tmp[1];
            }
        }
        int a = cu.getLineNumber(min);
        int b = cu.getLineNumber(max);
        int[] res = {a, b};
        return res;
    }


    public static String generateEntityJson(MiningActionData miningActionData) {
        List<ChangeEntity> changeEntityList = miningActionData.getChangeEntityList();
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < changeEntityList.size(); i++) {
            ChangeEntity changeEntity = changeEntityList.get(i);
            JSONObject jsonObject = changeEntity.stageIIIBean.genJSonObject();
            jsonArray.put(jsonObject);
        }
        return jsonArray.toString();
    }


    public static String generateAssociationJson(List<Association> associationList) {
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < associationList.size(); i++) {
            Association association = associationList.get(i);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", i);
            jsonObject.put("a", association.getChangeEntity1().getChangeEntityId());
            jsonObject.put("b", association.getChangeEntity2().getChangeEntityId());
            jsonObject.put("type", association.getType());
            jsonArray.put(jsonObject);
        }
        return jsonArray.toString();
    }
}
