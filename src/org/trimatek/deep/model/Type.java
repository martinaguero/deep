package org.trimatek.deep.model;

public enum Type {
	field("[F]"), method("[M]"), clas("[C]"), abs("A"), inter(
			"[I]");

	private String symbol;

	Type(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}
}
