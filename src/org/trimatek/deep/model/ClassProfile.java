package org.trimatek.deep.model;

import java.util.ArrayList;
import java.util.List;

public class ClassProfile {

	private String className;

	public ClassProfile(String className) {
		this.className = className;
	}

	public Integer getTotalPublicAttributes() {
		return fields.size() + methods.size() + constructors.size();
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	private List<String> fields = new ArrayList<String>();
	private List<String> methods = new ArrayList<String>();
	private List<String> constructors = new ArrayList<String>();

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public void addField(String fieldName) {
		fields.add(fieldName);
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

	public void addMethod(String methodName) {
		methods.add(methodName);
	}

	public List<String> getConstructors() {
		return constructors;
	}

	public void setConstructors(List<String> constructors) {
		this.constructors = constructors;
	}

	public void addConstructor(String constructorName) {
		constructors.add(constructorName);
	}

	public boolean isClassResource(String string) {
		for (String c : constructors) {
			if (string.equals(c))
				return Boolean.TRUE;
		}
		for (String m : methods) {
			if (string.equals(m))
				return Boolean.TRUE;
		}
		for (String f : fields) {
			if (string.equals(f))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public String toString(){
		return getClassName();
	}

}
