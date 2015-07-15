package org.trimatek.deep;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.Result;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.service.CalculatorService;
import org.trimatek.deep.utils.Constants;
import org.trimatek.deep.utils.TreeUtils;
import org.trimatek.deep.utils.Utils;

public class FindReferences {
	
	private static DateFormat df = new SimpleDateFormat("HH:mm:ss");
	private static Date start, end;
	
	public static void main(String[] args) throws Exception {

		System.out.println(Constants.name + " " + Constants.version);
		start = new Date();
		System.out.println("Start " + df.format(start));
		/* Source */
		String sourceJarPath = "f:\\Temp\\";
		String jar = "source2.jar";
		sourceJarPath = sourceJarPath + jar;

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile();
		System.out.println(target.toString());

		/* Source -> Target */
		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceJarPath, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);

		System.out.println("\nStart of [" + jar + " -> " + target.NAMESPACE + "] analysis");
		System.out.println("\n**Quick survey:**");
		System.out
				.println("Total of referenced classes(concrete,abstract,interfaces) by "
						+ jar + ": " + uniques.size() + "\n");
		TreeNode<?> depTree = Utils.buildDepTree(depMap, sourceJarPath);

		System.out.println("\n**Deep survey:**");
		System.out.println(TreeUtils.printTree(depTree));

		CalculatorService cs = new CalculatorService();
		Result r = cs.calcDepFactor(target, depTree, uniques.size());

		System.out.println(r.toString());

		end = new Date();
		System.out.println("End " + df.format(end));
	}



}
