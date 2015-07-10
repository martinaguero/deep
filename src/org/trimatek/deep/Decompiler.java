package org.trimatek.deep;

import org.trimatek.deep.service.DecompilerService;

public class Decompiler {

	public static void main(String[] args) {

		String path = "F:\\Docs\\Martín\\Dropbox\\Tesis\\workspace.tests\\drools-expert\\lib\\";
		path = path + "slf4j-api-1.7.2.jar";

		String outputPath = "F:\\Temp\\slf4j";

		DecompilerService decoService = new DecompilerService();
		decoService.decompile(path, outputPath);

	}

}
