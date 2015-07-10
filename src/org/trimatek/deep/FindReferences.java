package org.trimatek.deep;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.utils.FileUtils;
import org.trimatek.deep.utils.Utils;

public class FindReferences {

	public static void main(String[] args) throws ClassNotFoundException,
			IOException {
		TargetProfile target = LoadTargetProfile.loadTargetProfile();
		String sourcePath = "F:\\Temp\\drools";
		File[] files = new File(sourcePath).listFiles();

		List<File> fList = new ArrayList<File>();
		fList = FileUtils.loadFiles(files, fList);

		MultiMap<File, ClassProfile> fileClassMap = FileUtils.findRelations(
				fList, target);

		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(fileClassMap);

		for (ClassProfile cp : uniques) {
			System.out.println(cp.getClassName());
		}
		
		System.out.println("terminó");
	}

}
