package org.trimatek.deep.utils;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.trimatek.deep.model.ClassProfile;

public class ClassUtils {

	public static ClassLoader loadJar(String path) throws MalformedURLException {
		URL url = new File(path).toURI().toURL();
		URL[] urls = new URL[] { url };
		return new URLClassLoader(urls);
	}

	public static ClassProfile loaddAllPublicResources(Class clase,
			ClassProfile cp) {
		cp = loadAllPublicMethods(clase, cp);
		cp = loadAllPublicFields(clase, cp);
		cp = loadAllPublicConstructors(clase, cp);
		return cp;
	}

	private static ClassProfile loadAllPublicMethods(Class clazz,
			ClassProfile cp) {
		for (Method m : clazz.getDeclaredMethods()) {
			if (m.getModifiers() == 1) {
				cp.addMethod(m.getName());
			}
		}
		return cp;
	}

	private static ClassProfile loadAllPublicFields(Class clazz, ClassProfile cp) {
		for (Field f : clazz.getDeclaredFields()) {
			if (f.getModifiers() == 1) {
				cp.addField(f.getName());
			}
		}
		return cp;
	}

	private static ClassProfile loadAllPublicConstructors(Class clazz,
			ClassProfile cp) {
		for (Constructor c : clazz.getDeclaredConstructors()) {
			if (c.getModifiers() == 1) {
				cp.addConstructor(c.getName());
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
