package org.trimatek.deep;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

public class FindReferences {
	
	private static DateFormat df = new SimpleDateFormat("HH:mm:ss");
	private static Date start, end;
	private static Wini setup;
	
	public static void main(String[] args) throws Exception {

		setup = loadSetup();
		System.out.println(Constants.name + " " + Constants.version);
		if(setup==null){
			System.out.println("[setup not found] Please fill setup.ini file created at current directory and retry");
		} else {
		start = new Date();
		System.out.println("Start " + df.format(start));
		/* Source */
		String sourceJarPath = setup.get("source", "path") + "\\";
		String jar = setup.get("source", "filename");
		sourceJarPath = sourceJarPath + jar;

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile(setup);
		System.out.println(target.toString());

		/* Source -> Target */
		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceJarPath, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);

		System.out.println("\nStart of [" + jar + " -> " + target.getJarName() + "] analysis");
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

	private static Wini loadSetup() throws InvalidFileFormatException, IOException{
		File file = new File(Constants.setup_file);
		Wini ini = null;
		if(!file.exists()){
			PrintWriter writer = new PrintWriter(Constants.setup_file, "UTF-8");
			writer.println(Constants.name + " " + Constants.version);
			writer.println("\n");
			writer.println("# Windows path example: c:\\Temp");
			writer.println("# Windows filename example: spring.jar");
			writer.println("[source]");
			writer.println("path = ");
			writer.println("filename = ");
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
