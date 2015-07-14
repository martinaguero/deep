package org.trimatek.deep.model;

import java.util.ArrayList;
import java.util.List;

public class TargetProfile {

	public final String NAMESPACE;

	private List<ClassProfile> classes = new ArrayList<ClassProfile>();

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

	public boolean isTargetClassName(String className) {
		for (ClassProfile classProfile : classes) {
			if (classProfile.getClassName().equals(className))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public boolean contains(String className) {
		for (ClassProfile classProfile : classes) {
			if (classProfile.getClassName().equals(className))
				return true;
		}
		return false;
	}

	public ClassProfile remove(String className) {
		for (ClassProfile classProfile : classes) {
			if (classProfile.getClassName().equals(className)) {
				classes.remove(classProfile);
				return classProfile;
			}
		}
		return null;
	}

}
