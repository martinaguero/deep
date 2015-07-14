package org.trimatek.deep.service;

import java.util.List;

import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.MemberProfile;
import org.trimatek.deep.model.Result;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.model.Type;
import org.trimatek.exception.ResultsException;

public class CalculatorService {

	private TargetProfile target;
	private Result results = new Result();

	public Result calcDepFactor(TargetProfile target, TreeNode<?> depTree)
			throws IllegalArgumentException, IllegalAccessException,
			ResultsException {
		resetCounters();
		this.target = target;
		for (TreeNode node : depTree) {
			evalNode(node);
		}
		if (!validResults(results, target)) {
			throw new ResultsException("Invalid results");
		}
		return results;
	}

	private void resetCounters() throws IllegalArgumentException,
			IllegalAccessException {
		results = new Result();
	}

	private void evalNode(TreeNode<?> node) {
		String nodeData = (String) node.data;
		if (target.containsClassProfile(nodeData)) {
			ClassProfile cp = target.removeClass(nodeData);
			results.classes++;
			if (cp.isClase())
				results.concrete++;
			if (cp.isAbstrac())
				results.abstracts++;
			if (cp.isInterfaz())
				results.interfaces++;
			target = loadMembers(cp, target);
		} else {
			if (node.parent != null) {
				String className = (String) node.parent.data;
				if (target.containsMemberProfile(className + "." + node.data)) {
					MemberProfile mp = target.removeMember(node.parent.data
							+ "." + nodeData);
					if (mp.isField())
						results.fields++;
					if (mp.isMethod())
						results.methods++;
				}
			}
		}
	}

	private TargetProfile loadMembers(ClassProfile classProfile,
			TargetProfile target) {
		List<String> fields = classProfile.getFields();
		for (String fieldName : fields) {
			MemberProfile mp = new MemberProfile(classProfile.getClassName()
					+ "." + fieldName + Type.field.getSymbol());
			mp.setField(true);
			this.target.addMember(mp);
		}
		List<String> methods = classProfile.getMethods();
		for (String methodName : methods) {
			MemberProfile mp = new MemberProfile(classProfile.getClassName()
					+ "." + methodName + Type.method.getSymbol());
			mp.setMethod(true);
			this.target.addMember(mp);
		}
		return target;
	}

	private boolean validResults(Result results, TargetProfile target) {
		if (this.results.classes > this.target.getClasses().size())
			return false;
		if (this.results.concrete > this.target.getClassCount())
			return false;
		if (this.results.abstracts > this.target.getAbstractCount())
			return false;
		if (this.results.interfaces > this.target.getInterfacesCount())
			return false;
		if (this.results.fields + this.results.methods > target
				.getTotalPublicMembers())
			return false;
		return true;
	}

}
