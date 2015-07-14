package org.trimatek.deep.model;

import java.text.DecimalFormat;

public class Result {
	
	public int classes, concrete, abstracts, interfaces, methods, fields;
	public int tarClasses, tarConcrete, tarAbstract, tarIntefaces, tarMembers;
	private DecimalFormat f = new DecimalFormat("#.####");

	public Result(TargetProfile target){
		tarClasses = target.getClasses().size();
		tarConcrete = target.getClassCount();
		tarAbstract = target.getAbstractCount();
		tarIntefaces = target.getInterfacesCount();
		tarMembers = target.getTotalPublicMembers();
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("\n**Results**" + "\n");
		sb.append("Total of referenced classes: " + classes + "\n");
		sb.append("Concrete: " + concrete + "\n");
		sb.append("Abstract: " + abstracts + "\n");
		sb.append("Interfaces: " + interfaces + "\n");
		sb.append("Referenced fields: " + fields + "\n");
		sb.append("Referenced methods: " + methods + "\n");
		sb.append("\n");
		sb.append(">>Referenced/Total classes rate: " + f.format(classes/tarClasses));
		sb.append("\n");
		return sb.toString();
	}
	
}
