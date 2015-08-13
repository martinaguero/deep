package org.trimatek.deep.utils;

import org.trimatek.deep.model.TreeNode;

public class TreeUtils {

	public static String printTree(TreeNode<?> depTree){
		StringBuffer sb = new StringBuffer();
		for (TreeNode treeNode : depTree) {
			String indent = createIndent(treeNode.getLevel());
			System.out.println(indent + treeNode.data);
			sb.append(indent + treeNode.data + "\r");
		}
		return sb.toString();
	}
	
	private static String createIndent(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("  ");
		}
		return sb.toString();
	}
	
}
