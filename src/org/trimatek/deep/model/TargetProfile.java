package org.trimatek.deep.model;

import java.util.ArrayList;
import java.util.List;

public class TargetProfile {

	public final String NAMESPACE;

	private List<ClassProfile> classes = new ArrayList<ClassProfile>();
	private List<MemberProfile> members = new ArrayList<MemberProfile>();

	public TargetProfile(String NAMESPACE) {
		this.NAMESPACE = NAMESPACE;
	}

	public Integer getTotalPublicMembers() {
		int c = 0;
		for (ClassProfile cp : classes) {
			c = c + cp.getTotalPublicMembers();
		}
		return c;
	}

	public List<ClassProfile> getClasses() {
		return classes;
	}

	public void setClasses(List<ClassProfile> classes) {
		this.classes = classes;
	}

	public int getInterfacesCount() {
		int c = 0;
		for (ClassProfile classProfile : classes) {
			if (classProfile.isInterfaz())
				c++;
		}
		return c;
	}

	public int getAbstractCount() {
		int c = 0;
		for (ClassProfile classProfile : classes) {
			if (classProfile.isAbstrac())
				c++;
		}
		return c;
	}

	public int getClassCount() {
		int c = 0;
		for (ClassProfile classProfile : classes) {
			if (classProfile.isClase())
				c++;
		}
		return c;
	}

	public void addClass(ClassProfile classProfile) {
		classes.add(classProfile);
	}

	public void addMember(MemberProfile memberProfile) {
		members.add(memberProfile);
	}

	public boolean isTargetClassName(String className) {
		for (ClassProfile classProfile : classes) {
			if (classProfile.getClassName().equals(className))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public boolean containsClassProfile(String className) {
		for (ClassProfile classProfile : classes) {
			if (classProfile.getClassName().equals(className))
				return true;
		}
		return false;
	}

	public boolean containsMemberProfile(String memberName) {
		for (MemberProfile memberProfile : members) {
			if (memberProfile.getMemberName().equals(memberName))
				return true;
		}
		return false;
	}

	public ClassProfile removeClass(String className) {
		for (ClassProfile classProfile : classes) {
			if (classProfile.getClassName().equals(className)) {
				classes.remove(classProfile);
				return classProfile;
			}
		}
		return null;
	}

	public MemberProfile removeMember(String memberName) {
		for (MemberProfile memberProfile : members) {
			if (memberProfile.getMemberName().equals(memberName)) {
				members.remove(memberProfile);
				return memberProfile;
			}
		}
		return null;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n**Library profile**");
		sb.append("\n" + NAMESPACE + "\n");
		sb.append("Total of public class files: " + getClasses().size() + "\n");
		sb.append("Total of public concrete classes: " + getClassCount() + "\n");
		sb.append("Total of public abstract classes: " + getAbstractCount()
				+ "\n");
		sb.append("Total of public interfaces: " + getInterfacesCount() + "\n");
		sb.append("Public fields and methods: " + getTotalPublicMembers());
		return sb.toString();
	}

}
