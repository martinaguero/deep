package org.trimatek.deep.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.jar.JarFile;

import com.strobel.assembler.metadata.CompositeTypeLoader;
import com.strobel.assembler.metadata.JarTypeLoader;
import com.strobel.decompiler.Decompiler;
import com.strobel.decompiler.DecompilerSettings;
import com.strobel.decompiler.PlainTextOutput;

public class DecompilerService {

	private DecompilerSettings settings = DecompilerSettings
			.javaDefaults();
	private ByteArrayOutputStream out;

	public String decompile(String className, String jarPath) throws Exception {
		out = new ByteArrayOutputStream();
		JarFile jarFile = new JarFile(new File(jarPath));
		CompositeTypeLoader c = new CompositeTypeLoader(new JarTypeLoader(
				jarFile));
		settings.setTypeLoader(c);
		try (final OutputStreamWriter writer = new OutputStreamWriter(out);) {
			Decompiler.decompile(className.replace(".", "/"),
					new PlainTextOutput(writer), settings);
		} catch (final IOException e) {
			throw new Exception(e.getMessage());
		}
		return out.toString();
	}

}
