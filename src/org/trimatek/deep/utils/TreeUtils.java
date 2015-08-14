package org.trimatek.deep.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.Type;
import org.trimatek.deep.service.DecompilerService;
import org.trimatek.deep.service.ParserService;

public class TreeUtils {

	private static DecompilerService dc = new DecompilerService();
	private static ParserService ps = new ParserService();

	public static TreeNode buildDepTree(
			MultiMap<String, ClassProfile> sourceTargetmap, String targetJarPath)
			throws Exception {

		TreeNode root = new DefaultTreeNode(JarUtils.getJarName(targetJarPath)
				+ ".jar", null);
		TreeNode classNode;
		String sourceCode;
		List<String> statements;
		Set<String> keySet = sourceTargetmap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String className = (String) keyIterator.next();
			classNode = new DefaultTreeNode(className, root);
			List<ClassProfile> classes = (List<ClassProfile>) sourceTargetmap
					.get(className);
			sourceCode = dc.decompile(className, targetJarPath);
			statements = ps.parseStatementsExpressions(sourceCode);
			getNodes(classes, statements, classNode);
		}

		return root;
	}

	private static TreeNode getNodes(List<ClassProfile> classes,
			List<String> statements, TreeNode root) {
		TreeNode classNode;
		for (ClassProfile cp : Utils.toUniques(classes)) {
			classNode = new DefaultTreeNode(cp.getClassName(), root);
			for (String statement : statements) {
				for (String field : cp.getFields()) {
					addMember(statement, field, Type.field, classNode);
				}
				for (String method : cp.getMethods()) {
					addMember(statement, method, Type.method, classNode);
				}
			}
		}
		return root;
	}

	private static TreeNode addMember(String statement, String field,
			Type type, TreeNode classNode) {
		if (statement.contains(field)) {
			if (findNode(classNode, field + type.getSymbol()) == null) {
				TreeNode node = new DefaultTreeNode(field + type.getSymbol(),
						classNode);
			}
		}
		return classNode;
	}

	private static TreeNode findNode(TreeNode node, String data) {
		List<TreeNode> subChild = node.getChildren();
		for (TreeNode treeNode : subChild) {
			if (treeNode.getData().equals(data)) {
				return treeNode;
			}
		}
		return null;
	}

}
