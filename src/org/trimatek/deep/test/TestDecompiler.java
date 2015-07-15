package org.trimatek.deep.test;

import org.trimatek.deep.service.DecompilerService;

public class TestDecompiler {

	public static void main(String[] args) throws Exception {
		DecompilerService ds = new DecompilerService();
		String sourceJarPath = "f:\\Temp\\";
		sourceJarPath = sourceJarPath + "source.jar";

		String r = ds.decompile("source.Source",sourceJarPath);
		System.out.println(r);
	}

}
