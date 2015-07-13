package org.trimatek.deep;

import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.utils.FileUtils;
import org.trimatek.deep.utils.Utils;

public class FindReferences {

	public static void main(String[] args) throws Exception {

		/* Source */
		String sourceJarPath = "c:\\Temp\\";
		sourceJarPath = sourceJarPath + "source.jar";

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile();

		MultiMap<String, ClassProfile> fileClassMap = Utils.findRelations(
				sourceJarPath, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(fileClassMap);
		System.out.println("Total de clases(concretas,abstractas,interfaces) referenciadas: "
						+ uniques.size());
		System.out.println("terminó");
	}

}
