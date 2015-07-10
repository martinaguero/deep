package org.trimatek.deep.model;

import java.util.ArrayList;
import java.util.List;

public class TargetProfile {

	public final String NAMESPACE;

	private List<ClassProfile> classes = new ArrayList<ClassProfile>();
	private Integer totalPublicAttributes;

	public TargetProfile(String NAMESPACE) {
		this.NAMESPACE = NAMESPACE;
	}

	public Integer getTotalPublicAttributes() {
		if (totalPublicAttributes == null) {
			totalPublicAttributes = 0;
			for (ClassProfile cp : classes) {
				totalPublicAttributes = totalPublicAttributes
						+ cp.getTotalPublicAttributes();
			}
		}
		return totalPublicAttributes;
	}

	public List<ClassProfile> getClasses() {
		return classes;
	}

	public void setClasses(List<ClassProfile> classes) {
		this.classes = classes;
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

}
