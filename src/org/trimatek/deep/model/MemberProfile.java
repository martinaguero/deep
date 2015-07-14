package org.trimatek.deep.model;

public class MemberProfile {

	private String memberName;
	private boolean method;
	private boolean field;

	public MemberProfile(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public boolean isMethod() {
		return method;
	}

	public void setMethod(boolean method) {
		this.method = method;
	}

	public boolean isField() {
		return field;
	}

	public void setField(boolean field) {
		this.field = field;
	}
	
	public String toString(){
		return memberName;
	}

}
