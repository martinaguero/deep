package org.trimatek.deep.service;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.List;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.utils.ClassUtils;
import org.trimatek.deep.utils.JarUtils;

public class TargetService {

	public TargetProfile loadTargetProfile(String path,String mask)
			throws ClassNotFoundException, IOException {

		//ClassLoader cl = ClassUtils.loadJar(path);
		List<String> classes = JarUtils.listClasses(path);
		TargetProfile target = new TargetProfile(mask);
		
//		BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream("c:\\Temp\\out.txt") );
		for (String className : classes) {
			if (ClassUtils.isInsidePackage(className,
					target.NAMESPACE.split("\\."))) {
//				System.out.println(className);
				
			
				JavaClass jclass = new ClassParser(path,className.replace(".",
						"/") + ".class").parse();
				if (jclass.isPublic()) {
					ClassProfile cp = new ClassProfile(className);
					cp.setClassName(className);
//					out.write(clase.getName().getBytes());
					cp = ClassUtils.loaddAllPublicResources(jclass, cp);
					target.addClass(cp);
				}
			}
		}
//		out.close();
		return target;
	}

}
