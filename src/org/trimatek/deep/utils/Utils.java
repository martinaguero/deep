package org.trimatek.deep.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.model.Type;
import org.trimatek.deep.service.ClassVisitorService;
import org.trimatek.deep.service.DecompilerService;
import org.trimatek.deep.service.ParserService;

public class Utils {

	private static DecompilerService dc = new DecompilerService();
	private static ParserService ps = new ParserService();

	public static Set<ClassProfile> toUniquesClassProfiles(
			MultiMap<String, ClassProfile> fileClassMap) {
		Set<ClassProfile> uniques = new HashSet<ClassProfile>();
		Set<String> keySet = fileClassMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String className = (String) keyIterator.next();
			List<ClassProfile> classes = (List<ClassProfile>) fileClassMap
					.get(className);
			uniques.addAll(toUniques(classes));
		}
		return uniques;
	}

	private static Set<ClassProfile> toUniques(List<ClassProfile> classes) {
		Set<ClassProfile> uniques = new HashSet<ClassProfile>();
		for (ClassProfile cp : classes) {
			uniques.add(cp);
		}
		return uniques;
	}

	public static MultiMap<String, ClassProfile> findRelations(
			String sourceJarPath, TargetProfile target) throws Exception {
		MultiMap<String, ClassProfile> map = new MultiValueMap<String, ClassProfile>();
		List<String> classes = JarUtils.listClasses(sourceJarPath);
		ClassVisitorService cv = new ClassVisitorService();
		for (String className : classes) {
			List<String> refList = cv.listReferences(sourceJarPath, className);
			for (String ref : refList) {
				for (ClassProfile cp : target.getClasses()) {
					if (ref.replace("/", ".").contains(cp.getClassName())) {
						map.put(className, cp);
					}
				}
			}
		}
		return map;
	}

	public static TreeNode<?> buildDepTree(
			MultiMap<String, ClassProfile> sourceTargetmap, String targetJarPath)
			throws Exception {
		TreeNode root = new TreeNode(JarUtils.getJarName(targetJarPath)
				+ ".jar");
		TreeNode classNode;
		String sourceCode;
		List<String> statements;
		Set<String> keySet = sourceTargetmap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String className = (String) keyIterator.next();
			classNode = root.addChild(className);
			List<ClassProfile> classes = (List<ClassProfile>) sourceTargetmap
					.get(className);
			sourceCode = dc.decompile(className, targetJarPath);
			statements = ps.parseStatementsExpressions(sourceCode);
			getNodes(classes, statements, classNode);
		}
		return root;
	}

	private static TreeNode<?> getNodes(List<ClassProfile> classes,
			List<String> statements, TreeNode root) {
		TreeNode classNode;
		TreeNode memberNode;
		for (ClassProfile cp : toUniques(classes)) {
			classNode = root.addChild(cp.getClassName());
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
			if (classNode.findTreeNode(field + type.getSymbol()) == null) {
				classNode.addChild(field + type.getSymbol());
			}
		}
		return classNode;
	}

	public static String getSlash() {
		return System.getProperty("os.name").startsWith("W") ? "\\" : "/";
	}

}
