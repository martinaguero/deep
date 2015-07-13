package org.trimatek.deep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.trimatek.deep.service.ParserService;

public class TestParser {

	public static void main(String[] args) throws IOException {

		String sourceCode = new String(
				Files.readAllBytes(Paths
						.get("F:\\Docs\\Martín\\Dropbox\\Tesis\\workspace\\source\\src\\source\\source.java")));
		ParserService ps = new ParserService();
		List<String> statements = ps.parseStatementsExpressions(sourceCode);

		for (String string : statements) {
			System.out.println(string);
		}
	}

}
