package org.trimatek.deep.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;

public class Utils {

	public static Set<ClassProfile> toUniquesClassProfiles(
			MultiMap<File, ClassProfile> fileClassMap) {

		Set<ClassProfile> uniques = new HashSet<ClassProfile>();
		Set<File> keySet = fileClassMap.keySet();
		Iterator<File> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			File file = (File) keyIterator.next();
			List<ClassProfile> classes = (List<ClassProfile>) fileClassMap
					.get(file);
			for (ClassProfile cp : classes) {
				uniques.add(cp);
			}
		}
		return uniques;
	}
}
