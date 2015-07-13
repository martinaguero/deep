package org.trimatek.deep.utils;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.trimatek.deep.lexer.JavaLexer;

public class LexerUtils {

	public static List<String> toTokens(String sourceCode) {
		Lexer lexer = new JavaLexer(new ANTLRInputStream(sourceCode));
		//CommonTokenStream tokens = new CommonTokenStream(lexer);
		List<String> tokensList = new ArrayList<String>();
		for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer
				.nextToken()) {
			tokensList.add(token.getText());
		}
		return tokensList;
	}

}
