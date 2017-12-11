package edu.fdu.se.astdiff.miningactions;

import java.util.List;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.actions.model.Insert;
import com.github.gumtreediff.tree.ITree;
import com.github.gumtreediff.tree.Tree;
import com.github.gumtreediff.tree.TreeContext;

public class AstRelations {

	public static boolean isFatherIfStatement(Action a, TreeContext treeContext) {
		Tree t = (Tree) a.getNode();
		String type = treeContext.getTypeLabel(t.getParent());
		if (type.equals(StatementConstants.IFSTATEMENT)) {
			return true;
		}
		return false;
	}

	public static boolean ifFatherNodeTypeSameAs(Action a, TreeContext treeContext, String statementConstants) {
		Tree t = (Tree) a.getNode();
		String type = treeContext.getTypeLabel(t.getParent());

		if (type.equals(statementConstants)) {
			return true;
		}
		return false;
	}
	public static String fatherStatement(Action a,TreeContext con){
		Tree t = (Tree) a.getNode();
		String type = con.getTypeLabel(t.getParent());
		return type;
	}

//	public static boolean isAllChildrenNew(List<ITree> list) {
//		boolean allNewChildren = true;
//		for (ITree a : list) {
//			Tree t = (Tree) a;
//			if (t.getDoAction() == null) {
//				System.err.println("Unexpected Condition XXX");
//			} else if (t.getDoAction() instanceof Insert) {
//
//			} else {
//				// update 或者move 操作 说明if语句内部有原语句
//				allNewChildren = false;
//			}
//		}
//		return allNewChildren;
//	}

	public static boolean isClassCreation(List<Action> list, TreeContext treeContext) {
		for (Action a : list) {
			String str = treeContext.getTypeLabel(a.getNode());
			if (StatementConstants.CLASSINSTANCECREATION.equals(str)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isNullCheck(ITree ifStatementNode, TreeContext treeContext) {
		if (ifStatementNode.getChildren().size() == 2) {
			Tree c1 = (Tree) ifStatementNode.getChild(0);
			Tree c2 = (Tree) ifStatementNode.getChild(1);
			String type = treeContext.getTypeLabel(c2);
			if (StatementConstants.BLOCK.equals(type)) {
				for (ITree tmp : c1.postOrder()) {
					if (StatementConstants.NULLLITERAL.equals(treeContext.getTypeLabel(tmp))) {
						return true;
					}
				}
				return false;
			} else {
				System.err.println("Not a block Error if");
			}
		}
		return false;
	}

	/**
	 * simplename 或者是literal 往前推属于哪个statement
	 * XXXStatement MethodDelclaration
	 * @param node
	 * @param treeContext
	 * @return 返回fafafather
	 */
	public static ITree findFafafatherNode(ITree node, TreeContext treeContext) {
		// if statement
		String type = null;
		ITree curNode = node;
		String returnType = null;
		while (true) {
			type = treeContext.getTypeLabel(curNode);
			if(type.endsWith("Statement")){
				returnType = type;
				break;
			}else if(StatementConstants.METHODDECLARATION.equals(type)){
				returnType = type;
				break;
			}else{
				curNode = curNode.getParent();
			}
		}
		
		return curNode;
	}

}
