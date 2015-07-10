package org.trimatek.deep;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.DecompilerService;
import org.trimatek.deep.utils.FileUtils;
import org.trimatek.deep.utils.Utils;

public class FindReferences {

	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		
		/* Source */
		String path = "F:\\Temp\\";
		path = path + "drools-core-6.2.0.Final.jar";
		String sourcePath = "F:\\Temp\\drools-core";
		DecompilerService decoService = new DecompilerService();
		decoService.decompile(path, sourcePath);
		
		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile();
		
		File[] files = new File(sourcePath).listFiles();
		List<File> fList = new ArrayList<File>();
		fList = FileUtils.loadFiles(files, fList);
		MultiMap<File, ClassProfile> fileClassMap = FileUtils.findRelations(
				fList, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(fileClassMap);
		System.out.println("Total de clases referenciadas: " + uniques.size());
		System.out.println("terminó");
	}

}
