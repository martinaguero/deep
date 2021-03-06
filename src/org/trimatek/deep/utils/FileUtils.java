package org.trimatek.deep.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.primefaces.model.UploadedFile;
import org.trimatek.deep.lexer.JavaLexer;
import org.trimatek.deep.model.ClassProfile;

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

	public static boolean hasExtension(UploadedFile file, String[] extensions) {
		String fileExt = file.getFileName().substring(
				file.getFileName().lastIndexOf(".") + 1);
		for (String ext : extensions) {
			if (fileExt.equals(ext))
				return true;
		}
		return false;
	}

	public static List<String> loadDirs(File file) throws IOException {
		List<String> dList = new ArrayList<String>();
		Enumeration<JarEntry> entries = new JarFile(file).entries();
		while (entries.hasMoreElements()) {
			JarEntry je = entries.nextElement();
			if (je.isDirectory()) {
				dList.add(je.getName());
			}
		}
		return dList;
	}

}
