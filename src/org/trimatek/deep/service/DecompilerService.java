package org.trimatek.deep.service;

import com.strobel.decompiler.DecompilerDriver;

public class DecompilerService {

	public void decompile(String jarPath, String outputPath) {
		String[] arguments = {"-jar", jarPath, "-o", outputPath};
		DecompilerDriver.main(arguments);
	}

}
