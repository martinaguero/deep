package org.trimatek.deep.model;

import java.text.DecimalFormat;

public class Result {

	public int classes, concrete, abstracts, interfaces, methods, fields;
	public int tarClasses, tarConcrete, tarAbstract, tarIntefaces, tarMembers;
	private float totRate, conRate, absRate, intRate, memRate, depRate;
	private DecimalFormat f = new DecimalFormat("#.####");

	public Result(TargetProfile target) {
		tarClasses = target.getClasses().size();
		tarConcrete = target.getClassCount();
		tarAbstract = target.getAbstractCount();
		tarIntefaces = target.getInterfacesCount();
		tarMembers = target.getTotalPublicMembers();
	}

	private void updateResults() {
		if (tarClasses != 0)
			totRate = classes / (float) tarClasses;
		if (tarConcrete != 0)
			conRate = concrete / (float) tarConcrete;
		if (tarAbstract != 0)
			absRate = abstracts / (float) tarAbstract;
		if (tarIntefaces != 0)
			intRate = interfaces / (float) tarIntefaces;
		if (tarMembers != 0)
			memRate = (fields + methods) / (float) tarMembers;
		depRate = (conRate + absRate + intRate + memRate) / 4;
	}

	public String toString() {
		updateResults();
		StringBuffer sb = new StringBuffer();
		sb.append("Tree summary:" + "\n");
		sb.append("Total of referenced classes: " + classes + "\n");
		sb.append("Concrete: " + concrete + "\n");
		sb.append("Abstract: " + abstracts + "\n");
		sb.append("Interfaces: " + interfaces + "\n");
		sb.append("Referenced fields: " + fields + "\n");
		sb.append("Referenced methods: " + methods + "\n");
		sb.append("\n**Results**" + "\n");
		sb.append("Total classes ratio: " + getTotRate() + "\n");
		sb.append(">>Concrete ratio: " + getConRate() + "\n");
		sb.append(">>Abstract ratio: " + getAbsRate() + "\n");
		sb.append(">>Interfaces ratio: " + getIntRate() + "\n");
		sb.append(">>Members ratio: " + getMemRate() + "\n");
		sb.append("\n");
		sb.append(">>>> Dependency ratio: " + getDepRate());
		sb.append("\n");
		return sb.toString();
	}

	public String getClasses() {
		return classes + "";
	}

	public String getConcrete() {
		return concrete + "";
	}

	public String getAbstracts() {
		return abstracts + "";
	}

	public String getInterfaces() {
		return interfaces + "";
	}

	public String getMethods() {
		return methods + "";
	}

	public String getFields() {
		return fields + "";
	}

	public String getTotRate() {
		return f.format(totRate);
	}

	public String getConRate() {
		return f.format(conRate);
	}

	public String getAbsRate() {
		return f.format(absRate);
	}

	public String getIntRate() {
		return f.format(intRate);
	}

	public String getMemRate() {
		return f.format(memRate);
	}

	public String getDepRate() {
		return f.format(depRate);
	}

}
