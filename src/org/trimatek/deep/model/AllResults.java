package org.trimatek.deep.model;

import org.primefaces.model.TreeNode;

public class AllResults {

	private int targetClassFiles;
	private int targetConcrete;
	private int targetAbstract;
	private int targetInterfaces;
	private int targetMembers;
	private int referencedClasses;
	private TreeNode dependencyTree;
	private Result result;
	private String formattedResults;

	public int getTargetClassFiles() {
		return targetClassFiles;
	}

	public void setTargetClassFiles(int targetClassFiles) {
		this.targetClassFiles = targetClassFiles;
	}

	public int getTargetConcrete() {
		return targetConcrete;
	}

	public void setTargetConcrete(int targetConcrete) {
		this.targetConcrete = targetConcrete;
	}

	public int getTargetAbstract() {
		return targetAbstract;
	}

	public void setTargetAbstract(int targetAbstract) {
		this.targetAbstract = targetAbstract;
	}

	public int getTargetInterfaces() {
		return targetInterfaces;
	}

	public void setTargetInterfaces(int targetInterfaces) {
		this.targetInterfaces = targetInterfaces;
	}

	public int getTargetMembers() {
		return targetMembers;
	}

	public void setTargetMembers(int targetMembers) {
		this.targetMembers = targetMembers;
	}

	public int getReferencedClasses() {
		return referencedClasses;
	}

	public void setReferencedClasses(int referencedClasses) {
		this.referencedClasses = referencedClasses;
	}

	public TreeNode getDependencyTree() {
		return dependencyTree;
	}

	public void setDependencyTree(TreeNode dependencyTree) {
		this.dependencyTree = dependencyTree;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getFormattedResults() {
		return formattedResults;
	}

	public void setFormattedResults(String formattedResults) {
		this.formattedResults = formattedResults;
	}

}
