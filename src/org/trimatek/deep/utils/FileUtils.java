package org.trimatek.deep.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;

public class FileUtils {

	public static List<File> loadFiles(File[] files, List<File> fList) {
		for (File file : files) {
			if (file.isDirectory()) {
				fList = loadFiles(file.listFiles(), fList);
			} else {
				fList.add(file);
			}
		}
		return fList;
	}

	public static MultiMap<File, ClassProfile> findRelations(List<File> files,
			TargetProfile target) throws FileNotFoundException {
		MultiMap<File, ClassProfile> map = new MultiValueMap<File, ClassProfile>();
		for (File file : files) {
			Scanner scanner = new Scanner(file, "UTF-8");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.contains("import")) {
					line = line.replace(";", "");
					line = line.replace("import ", "");
					line = line.replace("static ", "");
					boolean isCandidate = ClassUtils.isInsidePackage(line,
							target.NAMESPACE.split("\\."));
					if (isCandidate) {
						for (ClassProfile cp : target.getClasses()) {
							if (cp.getClassName().equals(line)) {
								map.put(file, cp);
							}
						}
					}
				}
			}
			scanner.close();
		}
		return map;
	}

	public static Map<ClassProfile, AccessibleObject> findReferences(
			MultiMap<File, ClassProfile> fileClassMap)
			throws FileNotFoundException {

		MultiMap<ClassProfile, AccessibleObject> map = new MultiValueMap<ClassProfile, AccessibleObject>();

		Set<File> keySet = fileClassMap.keySet();
		Iterator<File> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			File file = (File) keyIterator.next();
			List<ClassProfile> classes = (List<ClassProfile>) fileClassMap
					.get(file);
			Scanner scanner = new Scanner(file, "UTF-8");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();

			}
		}
		//TODO to be completed
		return null;
	}

}
