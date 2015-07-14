package org.trimatek.deep.model;

import java.util.ArrayList;
import java.util.List;

public class ClassProfile {

	private String className;
	private boolean interfaz;
	private boolean abstrac;
	private boolean clase;

	public ClassProfile(String className) {
		this.className = className;
	}

	public boolean isInterfaz() {
		return interfaz;
	}

	public void setInterfaz(boolean interfaz) {
		this.interfaz = interfaz;
	}

	public boolean isAbstrac() {
		return abstrac;
	}

	public void setAbstrac(boolean abstrac) {
		this.abstrac = abstrac;
	}

	public boolean isClase() {
		return clase;
	}

	public void setClase(boolean clase) {
		this.clase = clase;
	}

	public Integer getTotalPublicMembers() {
		return fields.size() + methods.size() - 1;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	private List<String> fields = new ArrayList<String>();
	private List<String> methods = new ArrayList<String>();

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

	public boolean isClassResource(String string) {
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

	public String toString() {
		return getClassName();
	}

	public List<String> getMembers() {
		List<String> membersList = getMethods();
		membersList.addAll(getFields());
		return membersList;
	}

	public String getSymbol() {
		if (clase)
			return Type.clas.getSymbol();
		if (abstrac)
			return Type.abs.getSymbol();
		if (interfaz)
			return Type.inter.getSymbol();
		return "";
	}

}
