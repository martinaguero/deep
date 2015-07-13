package org.trimatek.deep.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.ConstantUtf8;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;

public class ClassVisitorService {

	public List<String> listReferences(String jarPath, String className)
			throws Exception {

		ClassParser parser = new ClassParser(jarPath, className.replace(".",
				"/") + ".class");
		JavaClass javaClass = parser.parse();
		Visitor visitor = new Visitor(javaClass);
		DescendingVisitor classWalker = new DescendingVisitor(javaClass,
				visitor);
		classWalker.visit();
		return visitor.getClasses();
	}
}

class Visitor extends EmptyVisitor {

	private JavaClass javaClass;
	private List<String> classes = new ArrayList<String>();

	public List<String> getClasses() {
		return classes;
	}

	public Visitor(JavaClass javaClass) {
		this.javaClass = javaClass;
	}

	public void visitConstantUtf8(ConstantUtf8 obj) {
		ConstantPool cp = javaClass.getConstantPool();
		String s = obj.getBytes();
		classes.add(s);
	}

}