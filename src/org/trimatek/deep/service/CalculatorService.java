package org.trimatek.deep.service;

import java.lang.reflect.Field;

import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;

public class CalculatorService {

	private TargetProfile target;
	private int classes;
	private int concrete;
	private int abstracts;
	private int interfaces;
	private int methods;
	private int fields;

	public void calcDepFactor(TargetProfile target, TreeNode<?> depTree)
			throws IllegalArgumentException, IllegalAccessException {
		resetCounters();
		this.target = target;
		for (TreeNode node : depTree) {
			evalNode(node);
		}
	}

	private void resetCounters() throws IllegalArgumentException,
			IllegalAccessException {
		for (Field field : this.getClass().getFields()) {
			if (field.getType().isPrimitive()) {
				field.setInt(this, 0);
			}
		}
	}

	private void evalNode(TreeNode<?> node) {
		String nodeData = (String) node.data;
		if (target.contains(nodeData)) {
			ClassProfile cp = target.remove(nodeData);
			classes++;
			if (cp.isClase())
				concrete++;
			if (cp.isAbstrac())
				abstracts++;
			if (cp.isInterfaz())
				interfaces++;
		}
	}

	public int getClasses() {
		return classes;
	}

	public int getConcrete() {
		return concrete;
	}

	public int getAbstracts() {
		return abstracts;
	}

	public int getInterfaces() {
		return interfaces;
	}

}
