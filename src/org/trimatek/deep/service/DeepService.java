package org.trimatek.deep.service;

import java.io.File;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.utils.TreeUtils;
import org.trimatek.deep.utils.Utils;

public class DeepService {

	private TargetProfile targetProfile;

	public TargetProfile getTargetProfile() {
		return targetProfile;
	}

	public void setTargetProfile(TargetProfile targetProfile) {
		this.targetProfile = targetProfile;
	}

	public String start(File sourceFile, File targetFile) throws Exception {
		StringBuffer sb = new StringBuffer();
		/* Target */
		TargetService targetService = new TargetService();
		targetProfile = targetService.loadTargetProfile(
				targetFile.getAbsolutePath(), "org.trimatek");
		sb.append(targetProfile.toString());
		/* Source -> Target */
		sb.append("\nStart of [" + sourceFile.getName() + " -> "
				+ targetProfile.getJarName() + "] analysis");
		sb.append("\nPlease wait");
		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceFile.getAbsolutePath(), targetProfile);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);
		sb.append("\n**Quick survey result:**");
		sb.append("Total of referenced classes(concrete,abstract,interfaces) by "
				+ sourceFile.getName() + ": " + uniques.size() + "\n");
		/* Tree build */
		sb.append("Building dependencies tree\nPlease wait");
		TreeNode<?> depTree = Utils.buildDepTree(depMap,
				sourceFile.getAbsolutePath());
		sb.append("\n\n**Deep survey:**");
		sb.append(TreeUtils.printTree(depTree));
		/* Calculate result */
		CalculatorService cs = new CalculatorService();
		sb.append(cs.calcDepFactor(targetProfile, depTree, uniques.size())
				.toString());
		return sb.toString();

	}

}
