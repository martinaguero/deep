package org.trimatek.deep.service;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.trimatek.deep.lexer.JavaLexer;
import org.trimatek.deep.lexer.JavaListenerImpl;
import org.trimatek.deep.lexer.JavaParser;

public class ParserService {

	private JavaListenerImpl listener = new JavaListenerImpl();
	private JavaParser parser;
	private CommonTokenStream tokens;
	private Lexer lexer;

	public List<String> parseStatementsExpressions(String sourceCode) {
		lexer = new JavaLexer(new ANTLRInputStream(sourceCode));
		tokens = new CommonTokenStream(lexer);
		parser = new JavaParser(tokens);
		ParseTreeWalker.DEFAULT.walk(listener, parser.compilationUnit());
		return listener.getStatements();
	}

}
