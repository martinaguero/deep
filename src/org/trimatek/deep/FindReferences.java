package org.trimatek.deep;

import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.Result;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.service.CalculatorService;
import org.trimatek.deep.utils.TreeUtils;
import org.trimatek.deep.utils.Utils;

public class FindReferences {

	public static void main(String[] args) throws Exception {

		/* Source */
		String sourceJarPath = "f:\\Temp\\lib\\";
		String jar = "spring.jar";
		sourceJarPath = sourceJarPath + jar;

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile();
		System.out.println(target.toString());

		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceJarPath, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);

		System.out
				.println("Total of referenced classes(concrete,abstract,interfaces) by "
						+ jar + ": " + uniques.size() + "\n");
		TreeNode<?> depTree = Utils.buildDepTree(depMap, sourceJarPath);

		System.out.println("\n\n**References Tree**\n");
		System.out.println(TreeUtils.printTree(depTree));

		CalculatorService cs = new CalculatorService();
		Result r = cs.calcDepFactor(target, depTree, uniques.size());

		System.out.println(r.toString());

		System.out.println("terminó");
	}



}
