package org.trimatek.deep.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;
import org.trimatek.deep.lexer.JavaLexer;
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

	public static Map<ClassProfile, AccessibleObject> countReferences(
			MultiMap<File, ClassProfile> fileClassMap)
			throws FileNotFoundException {

		MultiMap<ClassProfile, AccessibleObject> map = new MultiValueMap<ClassProfile, AccessibleObject>();

		Set<File> keySet = fileClassMap.keySet();
		Iterator<File> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			File file = (File) keyIterator.next();
			List<ClassProfile> classes = (List<ClassProfile>) fileClassMap
					.get(file);
		}
		// TODO to be completed
		return null;
	}

	private static List<AccessibleObject> findAttributes(String line,
			ClassProfile classProfile) {
		// TODO to be completed
		List<AccessibleObject> attributes = new ArrayList<AccessibleObject>();

		return null;
	}

	private static CommonTokenStream toTokens(File file,
			List<ClassProfile> classes) throws IOException {
		Lexer lexer = new JavaLexer(new ANTLRFileStream(file.getName()));
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer
				.nextToken()) {
			// TODO to be completed
			System.out.println(token.getText());
		}

		return null;
	}

}
