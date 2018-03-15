package edu.fdu.se.astdiff.miningoperationbean;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.tree.Tree;
import edu.fdu.se.astdiff.linkpool.LinkBean;
import org.eclipse.jdt.core.dom.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by huangkaifeng on 2018/3/10.
 */
public class MiningOperationBeanUtil {

    public static Set<String> getNames(List<BodyDeclaration> nodeList){
        Set<String> result = new HashSet<>();
        for(int i =0;i<nodeList.size();i++){
            BodyDeclaration n = nodeList.get(i);
            if(n instanceof MethodDeclaration){
                MethodDeclaration md = (MethodDeclaration) n;
                result.add(md.getName().toString());
            }
            if(n instanceof FieldDeclaration){
                FieldDeclaration fd = (FieldDeclaration) n;
                List<VariableDeclarationFragment> mmList = fd.fragments();
                for(VariableDeclarationFragment vd:mmList){
                    result.add(vd.getName().toString());
                }
            }
            if(n instanceof TypeDeclaration){
                TypeDeclaration cod = (TypeDeclaration) n;
                Set<String> result2 = getNames(cod.bodyDeclarations());
                result.addAll(result2);
            }
        }
        return result;
    }

    public void parseActionsGetNames(List<Action> actionList, LinkBean linkBean){
        for(Action a:actionList){
            Tree tree = (Tree) a.getNode();
            int type = tree.getAstNode().getNodeType();
            switch(type){
                case ASTNode.METHOD_INVOCATION:

            }
        }

    }
}