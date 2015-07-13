package org.trimatek.deep.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.ClassVisitorService;

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

	public static MultiMap<String, ClassProfile> findRelations(
			String sourceJarPath, TargetProfile target) throws Exception {
		MultiMap<String, ClassProfile> map = new MultiValueMap<String, ClassProfile>();
		List<String> classes = JarUtils.listClasses(sourceJarPath);
		ClassVisitorService cv = new ClassVisitorService();
		for (String className : classes) {
			List<String> refList = cv.listReferences(sourceJarPath, className);
			for (ClassProfile cp : target.getClasses()) {
				for (String ref : refList) {
					if (cp.getClassName().contains(ref.replace("/", "."))) {
						map.put(className, cp);
					}
				}
			}
		}
		return map;
	}
}
