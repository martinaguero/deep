package org.trimatek.deep;

import java.io.File;
import java.io.IOException;

import org.primefaces.model.TreeNode;
import org.trimatek.deep.utils.TreeUtils;

public class TestTree {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Temp\\dom.jar");
		TreeNode node = TreeUtils.buildTree(f);
		System.out.println(node.toString());
	}

}
