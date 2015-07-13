package org.trimatek.deep.model;

public enum MemberType {
	field("[F]"), method("[M]");

	private String symbol;

	MemberType(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol(){
		return symbol;
	}
}
