package org.trimatek.deep;

import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.Result;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.service.CalculatorService;
import org.trimatek.deep.utils.Utils;

public class FindReferences {

	public static void main(String[] args) throws Exception {

		/* Source */
		String sourceJarPath = "f:\\Temp\\lib\\";
		sourceJarPath = sourceJarPath + "spring.jar";

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile();

		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceJarPath, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);
		System.out
				.println("Total de clases(concretas,abstractas,interfaces) referenciadas: "
						+ uniques.size() + "\n");
		TreeNode<?> depTree = Utils.buildDepTree(depMap, sourceJarPath);

		System.out.println("\n");
		for (TreeNode treeNode : depTree) {
			String indent = createIndent(treeNode.getLevel());
			System.out.println(indent + treeNode.data);
		}

		CalculatorService cs = new CalculatorService();
		Result r = cs.calcDepFactor(target,depTree);
		System.out.println("total de clases referenciadas: " + r.classes);
		System.out.println("total de clases concretas referenciadas: " + r.concrete);
		System.out.println("total de clases abstractas referenciadas: " + r.abstracts);
		System.out.println("total de interfaces referenciadas: " + r.interfaces);
		System.out.println("total de campos referenciados: " + r.fields);
		System.out.println("total de metodos referenciados: " + r.methods);
		
		System.out.println("terminó");
	}

	private static String createIndent(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("  ");
		}
		return sb.toString();
	}

}
