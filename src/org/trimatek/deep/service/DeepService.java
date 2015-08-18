package org.trimatek.deep.service;

import java.io.File;
import java.util.Set;
import java.util.logging.Logger;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.AllResults;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.Result;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.utils.TreeUtils;
import org.trimatek.deep.utils.Utils;

public class DeepService {

	private TargetProfile targetProfile;
	private final static Logger log = Logger.getLogger(DeepService.class.getName()); 

	public TargetProfile getTargetProfile() {
		return targetProfile;
	}

	public void setTargetProfile(TargetProfile targetProfile) {
		this.targetProfile = targetProfile;
	}

	public AllResults start(File sourceFile, File targetFile, String threshold) throws Exception {
		StringBuffer sb = new StringBuffer();
		String msg;
		log.info("Start of analysis");
		/* Target */
		TargetService targetService = new TargetService();
		AllResults allResults = new AllResults();
		log.info("Loading target profile with threshold: " + threshold);
		targetProfile = targetService.loadTargetProfile(
				targetFile.getAbsolutePath(), threshold);
		allResults = targetProfile.loadResults(allResults);
		sb.append(targetProfile.toString());
		/* Source -> Target */
		msg = "\nStart of [" + sourceFile.getName() + " -> "
				+ targetProfile.getJarName() + "] analysis";
		log.info(msg);
		sb.append(msg);
		sb.append("\nPlease wait");
		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceFile.getAbsolutePath(), targetProfile);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);
		allResults.setReferencedClasses(uniques.size());
		msg = "\n**Quick survey result:**\n";
		msg = msg + "Total of referenced classes(concrete,abstract,interfaces) by "
				+ sourceFile.getName() + ": " + uniques.size() + "\n";
		msg = msg + "Building dependencies tree\nPlease wait";
		log.info(msg);
		sb.append(msg);
		/* Tree build */
		TreeNode<?> depTree = Utils.buildDepTree(depMap,
				sourceFile.getAbsolutePath());
		org.primefaces.model.TreeNode primeTree = TreeUtils.buildDepTree(depMap,
				sourceFile.getAbsolutePath());
		allResults.setDependencyTree(primeTree);
		sb.append("\n\n**Deep survey:**");
		sb.append(Utils.printTree(depTree));
		/* Calculate result */
		log.info("Calculating results");
		CalculatorService cs = new CalculatorService();
		Result result = cs.calcDepFactor(targetProfile, depTree, uniques.size()); 
		sb.append(result.toString());
		allResults.setResult(result);
		allResults.setFormattedResults(sb.toString());
		log.info("Analysis completed");
		return allResults;
	}

}
