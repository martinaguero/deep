package org.trimatek.deep.lexer;

import java.util.ArrayList;
import java.util.List;

import org.trimatek.deep.lexer.JavaParser.StatementExpressionContext;

public class JavaListenerImpl extends JavaBaseListener {

	private List<String> statements;

	public JavaListenerImpl() {
		statements = new ArrayList<String>();
	}

	public List<String> getStatements() {
		List<String> buf = new ArrayList<String>(statements);
		statements.clear();
		return buf;
	}

	public void enterStatementExpression(StatementExpressionContext ctx) {
		statements.add(ctx.getText());
	}

}
