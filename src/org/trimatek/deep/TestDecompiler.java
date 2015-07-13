package org.trimatek.deep;

import org.trimatek.deep.service.DecompilerService;
import org.trimatek.deep.utils.ClassUtils;

public class TestDecompiler {

	public static void main(String[] args) throws Exception {
		DecompilerService ds = new DecompilerService();
		String sourceJarPath = "f:\\Temp\\";
		sourceJarPath = sourceJarPath + "source.jar";
		
		ClassUtils.loadJar(sourceJarPath);
		String r = ds.decompile(sourceJarPath,"source.Source");
		
		System.out.println(r);
	}

}
