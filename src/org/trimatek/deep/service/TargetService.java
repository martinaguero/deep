package org.trimatek.deep.service;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.List;

import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.utils.ClassUtils;
import org.trimatek.deep.utils.JarUtils;

public class TargetService {

	public TargetProfile loadTargetProfile(String path,String mask)
			throws ClassNotFoundException, IOException {

		ClassLoader cl = ClassUtils.loadJar(path);
		List<String> classes = JarUtils.listClasses(path);
		TargetProfile target = new TargetProfile(mask);
		for (String className : classes) {
			if (ClassUtils.isInsidePackage(className,
					target.NAMESPACE.split("\\."))) {
				Class clase = cl.loadClass(className);
				int mod = clase.getModifiers();
				if (Modifier.isPublic(mod)) {
					ClassProfile cp = new ClassProfile(className);
					cp.setClassName(className);
					cp = ClassUtils.loaddAllPublicResources(clase, cp);
					target.addClass(cp);
				}
			}
		}
		return target;
	}

}
