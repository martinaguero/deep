package org.trimatek.deep.model;

import java.text.DecimalFormat;

public class Result {
	
	public int classes, concrete, abstracts, interfaces, methods, fields;
	public int tarClasses, tarConcrete, tarAbstract, tarIntefaces, tarMembers;
	private float totRate, conRate, absRate, intRate, memRate, depRate;
	private DecimalFormat f = new DecimalFormat("#.####");
	
	public Result(TargetProfile target){
		tarClasses = target.getClasses().size();
		tarConcrete = target.getClassCount();
		tarAbstract = target.getAbstractCount();
		tarIntefaces = target.getInterfacesCount();
		tarMembers = target.getTotalPublicMembers();
	}
	
	private void updateResults(){
		totRate = classes/(float)tarClasses;
		conRate = concrete/(float)tarConcrete;
		absRate = abstracts/(float)tarAbstract;
		intRate = interfaces/(float)tarIntefaces;
		memRate = (fields+methods)/(float)tarMembers;
		depRate = (conRate + absRate + intRate + memRate)/4;
	}
	
	public String toString(){
		updateResults();
		StringBuffer sb = new StringBuffer();
		sb.append("Tree symmary:" + "\n");
		sb.append("Total of referenced classes: " + classes + "\n");
		sb.append("Concrete: " + concrete + "\n");
		sb.append("Abstract: " + abstracts + "\n");
		sb.append("Interfaces: " + interfaces + "\n");
		sb.append("Referenced fields: " + fields + "\n");
		sb.append("Referenced methods: " + methods + "\n");
		sb.append("\n**Results**" + "\n");
		sb.append("Total classes ratio: " + f.format(totRate) + "\n");
		sb.append(">>Concrete ratio: " + f.format(conRate) + "\n");
		sb.append(">>Abstract ratio: " + f.format(absRate) + "\n");
		sb.append(">>Interfaces ratio: " + f.format(intRate) + "\n");
		sb.append(">>Members ratio: " + f.format(memRate) + "\n");
		sb.append("\n");
		sb.append(">>>> Dependency ratio: " + f.format(depRate));
		sb.append("\n");
		return sb.toString();
	}
	
}
