package org.trimatek.deep;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.utils.FileUtils;

public class FindReferences {

	public static void main(String[] args) throws Exception {

		/* Source */
		String sourceJarPath = "c:\\Temp\\";
		sourceJarPath = sourceJarPath + "drools-core-6.2.0.Final.jar";

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile();

//		MultiMap<String, ClassProfile> fileClassMap = FileUtils.findRelations(
//				sourceJarPath, target);
//		 Set<ClassProfile> uniques =
//		 Utils.toUniquesClassProfiles(fileClassMap);
//		System.out.println("Total de clases referenciadas: " + uniques.size());
		System.out.println("terminó");
	}

}
