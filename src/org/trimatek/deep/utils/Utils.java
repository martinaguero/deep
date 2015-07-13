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
			for (ClassProfile cp : classes) {
				uniques.add(cp);
			}
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
			for (ClassProfile cp : target.getClasses()) {
				for (String ref : refList) {
					if (cp.getClassName().contains(ref.replace("/", "."))) {
						map.put(className, cp);
					}
				}
			}
		}
		return map;
	}

	public static TreeNode<?> buildDepTree(MultiMap<String, ClassProfile> map,
			String targetJarPath) throws Exception {
		TreeNode root = new TreeNode(JarUtils.getJarName(targetJarPath));
		TreeNode classNode;
		String sourceCode;
		List<String> statements;
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String className = (String) keyIterator.next();
			classNode = new TreeNode(className);
			List<ClassProfile> classes = (List<ClassProfile>) map
					.get(className);
			sourceCode = dc.decompile(className, targetJarPath);
			statements = ps.parseStatementsExpressions(sourceCode);
			root = getNodes(classes, statements, classNode);
		}
		return root;
	}

	private static TreeNode<?> getNodes(List<ClassProfile> classes,
			List<String> statements, TreeNode node) {
		TreeNode classNode;
		TreeNode memberNode;
		for (ClassProfile classProfile : classes) {
			classNode = node.addChild(classProfile.getClassName());
			for (String member : classProfile.getMembers()) {
				for (String statement : statements) {
					if (statement.contains(member)) {
						classNode.addChild(member);
					}
				}
			}
			
		}
		return node;
	}

}
