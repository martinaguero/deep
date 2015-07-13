package org.trimatek.deep;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.utils.Utils;

public class FindReferences {

	public static void main(String[] args) throws Exception {

		/* Source */
		String sourceJarPath = "f:\\Temp\\";
		sourceJarPath = sourceJarPath + "source2.jar";

		/* Target */
		TargetProfile target = LoadTargetProfile.loadTargetProfile();

		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				sourceJarPath, target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);
		System.out
				.println("Total de clases(concretas,abstractas,interfaces) referenciadas: "
						+ uniques.size() + "\n");
		TreeNode<?> tree = Utils.buildDepTree(depMap, sourceJarPath);

		System.out.println("\n");
		for (TreeNode treeNode : tree) {
			String indent = createIndent(treeNode.getLevel());
			System.out.println(indent + treeNode.data);
		}


		System.out.println("terminó");
	}

	private static String createIndent(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append(' ');
		}
		return sb.toString();
	}

}
