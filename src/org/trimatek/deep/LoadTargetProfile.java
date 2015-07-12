package org.trimatek.deep;

import java.io.IOException;

import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.TargetService;

public class LoadTargetProfile {

	public static TargetProfile loadTargetProfile() throws IOException,
			ClassNotFoundException {

		String path = "c:\\Temp\\drools\\lib\\";
		path = path + "kie-api-6.2.0.Final.jar";
		String mask = "org.kie.api";

		TargetService targetService = new TargetService();
		TargetProfile target = targetService.loadTargetProfile(path, mask);

		System.out.println("**Library profile**");
		System.out.println("Total of public class files: " + target.getClasses().size());
		System.out.println("Total of public classes: " + target.getClassCount());
		System.out.println("Total of public abstract classes: " + target.getAbstractCount());
		System.out.println("Total of public interfaces: " + target.getInterfacesCount());
		System.out.println("Public fields and methods: "
				+ target.getTotalPublicAttributes());
		return target;
	}

}
