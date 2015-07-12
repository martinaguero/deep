package org.trimatek.deep.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;

public class Utils {

	public static Set<ClassProfile> toUniquesClassProfiles(
			MultiMap<String, ClassProfile> fileClassMap) {

		Set<ClassProfile> uniques = new HashSet<ClassProfile>();
		Set<String> keySet = fileClassMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String className = (String) keyIterator.next();
			List<ClassProfile> classes = (List<ClassProfile>) fileClassMap
					.get(className);
			for (ClassProfile cp : classes) {
				uniques.add(cp);
			}
		}
		return uniques;
	}
}
