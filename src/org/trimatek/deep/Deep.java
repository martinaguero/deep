package org.trimatek.deep;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.Result;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.service.CalculatorService;
import org.trimatek.deep.utils.Constants;
import org.trimatek.deep.utils.TreeUtils;
import org.trimatek.deep.utils.Utils;

public class Deep {

	private static Wini setup;
	private static Result result;

	public static void main(String[] args) {

		try {
			setup = loadSetup();
			System.out.println(Constants.name + " " + Constants.version);
			if (setup == null) {
				System.out.println("[Setup not found] Please fill "
						+ Constants.setup_file
						+ " file created at current directory and retry");
			} else {
				System.out.println("Start " + Constants.df.format(new Date()));
				result = start();
				System.out.println(result.toString());
				System.out.println("End " + Constants.df.format(new Date()));
			}
		} catch (Exception e) {
			System.out.println("[Error] " + e.getMessage());
		}

	}

	private static Result start() throws Exception {
		/* Source */
		String sourceJarPath = setup.get("source", "path") + Utils.getSlash();
		String jar = setup.get("source", "filename");
		sourceJarPath = sourceJarPath + jar;

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile(setup);
		System.out.println(target.toString());

		/* Source -> Target */
		System.out.println("\nStart of [" + jar + " -> " + target.getJarName()
				+ "] analysis");
		System.out.println("Please wait");
		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceJarPath, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);

		System.out.println("\n**Quick survey result:**");
		System.out
				.println("Total of referenced classes(concrete,abstract,interfaces) by "
						+ jar + ": " + uniques.size() + "\n");
		
		/* Tree build */
		System.out.println("Building dependencies tree\nPlease wait");
		TreeNode<?> depTree = Utils.buildDepTree(depMap, sourceJarPath);
		System.out.println("\n\n**Deep survey:**");
		System.out.println(Utils.printTree(depTree));

		/* Calculate result */
		CalculatorService cs = new CalculatorService();
		return cs.calcDepFactor(target, depTree, uniques.size());
	}

	private static Wini loadSetup() throws InvalidFileFormatException,
			IOException {
		File file = new File(Constants.setup_file);
		Wini ini = null;
		if (!file.exists()) {
			PrintWriter writer = new PrintWriter(Constants.setup_file, "UTF-8");
			writer.println(Constants.name + " " + Constants.version);
			writer.println("\n");
			writer.println("# Windows path example: c:\\Temp");
			writer.println("# Linux path example: /tmp");
			writer.println("# source filename example: hibernate-core-4.3.10.Final.jar");
			writer.println("# library filename example: dom4j-1.6.1.jar");
			writer.println("# namespace example: org.dom4j");
			writer.println("");
			writer.println("[source]");
			writer.println("path = ");
			writer.println("filename = ");
			writer.println("");
			writer.println("[library]");
			writer.println("path = ");
			writer.println("filename = ");
			writer.println("namespace = ");
			writer.close();
		} else {
			ini = new Wini(file);
		}
		return ini;
	}

}
