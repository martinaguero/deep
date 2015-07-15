package org.trimatek.deep.service;

import java.io.IOException;
import java.util.List;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.utils.ClassUtils;
import org.trimatek.deep.utils.JarUtils;

public class TargetService {

	public TargetProfile loadTargetProfile(String path, String mask)
			throws ClassNotFoundException, IOException {
		List<String> classes = JarUtils.listClasses(path);
		TargetProfile target = new TargetProfile(path,mask);
		for (String className : classes) {
			if (ClassUtils.isInsidePackage(className,
					target.NAMESPACE.split("\\."))) {
				JavaClass jclass = new ClassParser(path, className.replace(".",
						"/") + ".class").parse();
				if (jclass.isPublic()) {
					ClassProfile cp = new ClassProfile(className);
					cp.setClassName(className);
					cp = ClassUtils.loaddAllPublicResources(jclass, cp);
					target.addClass(cp);
				}
			}
		}
		return target;
	}

}
