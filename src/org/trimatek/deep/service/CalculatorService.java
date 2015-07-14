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
	private Result results;

	public Result calcDepFactor(TargetProfile target, TreeNode<?> depTree, int ctrl)
			throws IllegalArgumentException, IllegalAccessException,
			ResultsException {
		results = new Result(target);
		this.target = target;
		for (TreeNode node : depTree) {
			evalNode(node);
		}
		if (!validResults(results, target, ctrl)) {
			throw new ResultsException("Invalid results");
		}
		return results;
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

	private boolean validResults(Result results, TargetProfile target, int ctrl) {
		if (this.results.classes > ctrl)
			return false;
		return true;
	}

}
