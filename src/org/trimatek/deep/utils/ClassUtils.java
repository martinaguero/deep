package org.trimatek.deep.utils;

import java.io.File;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.apache.bcel.classfile.Field;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.trimatek.deep.model.ClassProfile;

public class ClassUtils {

	public static ClassLoader loadJar(String path) throws MalformedURLException {
		URL url = new File(path).toURI().toURL();
		URL[] urls = new URL[] { url };
		return new URLClassLoader(urls);
	}

	public static ClassProfile loaddAllPublicResources(JavaClass clase,
			ClassProfile cp) {
		cp = loadAllPublicMethods(clase, cp);
		cp = loadAllPublicFields(clase, cp);
		if (clase.isClass() && !clase.isAbstract() && !clase.isInterface()) {
			cp.setClase(clase.isClass());
		} else if (clase.isAbstract() && !clase.isInterface()) {
			cp.setAbstrac(clase.isAbstract());
		} else if (clase.isInterface()) {
			cp.setInterfaz(clase.isInterface());
		}
		return cp;
	}

	private static ClassProfile loadAllPublicMethods(JavaClass jc,
			ClassProfile cp) {
		for (Method m : jc.getMethods()) {
			if (m.isPublic()) {
				cp.addMethod(m.getName());
			}
		}
		return cp;
	}

	private static ClassProfile loadAllPublicFields(JavaClass jc,
			ClassProfile cp) {
		for (Field f : jc.getFields()) {
			if (f.isPublic()) {
				cp.addField(f.getName());
			}
		}
		return cp;
	}

	public static boolean isInsidePackage(String className, String[] pcks) {
		String[] fqn = className.split("\\.");
		int i = 0;
		for (String pck : pcks) {
			if (pck.equals(fqn[i])) {
				i++;
			} else {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}

}
