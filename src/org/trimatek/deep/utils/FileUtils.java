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
import org.trimatek.deep.service.ClassVisitorService;

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

	public static MultiMap<String, ClassProfile> findRelations(
			String sourceJarPath, TargetProfile target) throws Exception {
		MultiMap<String, ClassProfile> map = new MultiValueMap<String, ClassProfile>();
		List<String> classes = JarUtils.listClasses(sourceJarPath);
		ClassVisitorService cv = new ClassVisitorService();
		for (String className : classes) {
			List<String> refList = cv.listReferences(sourceJarPath, className);
			for (ClassProfile cp : target.getClasses()) {
				for (String ref : refList) {
					if (cp.getClassName().equals(ref.replace("/", "."))) {
						map.put(className, cp);
					}
				}
			}
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
			Scanner scanner = new Scanner(file, "UTF-8");
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
			}
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
