package org.trimatek.deep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.trimatek.deep.utils.LexerUtils;

public class TestLexer {

	public static void main(String[] args) throws IOException {

		String sourceCode = new String(Files.readAllBytes(Paths
				.get("C:\\Users\\Martín\\workspace\\source\\src\\source\\source.java")));
		List<String> t = LexerUtils.toTokens(sourceCode);

		for (String string : t) {
			System.out.println(string);
		}

	}

}
