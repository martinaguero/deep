package org.trimatek.deep.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.strobel.decompiler.Decompiler;
import com.strobel.decompiler.DecompilerDriver;
import com.strobel.decompiler.DecompilerSettings;
import com.strobel.decompiler.PlainTextOutput;

public class DecompilerService {

	private final DecompilerSettings settings = DecompilerSettings
			.javaDefaults();
	private ByteArrayOutputStream out = new ByteArrayOutputStream();

	public void decompile(String jarPath, String outputPath) {
		String[] arguments = { "-jar", jarPath, "-o", outputPath };
		DecompilerDriver.main(arguments);
	}

	public String decompile(String className) throws Exception {
		out.flush();
		try (final OutputStreamWriter writer = new OutputStreamWriter(out);) {
			Decompiler.decompile(className, new PlainTextOutput(writer),
					settings);
		} catch (final IOException e) {
			throw new Exception(e.getMessage());
		}
		return out.toString();
	}

}
