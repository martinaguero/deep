package org.trimatek.deep.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
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

}
