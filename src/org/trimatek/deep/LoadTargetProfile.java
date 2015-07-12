package org.trimatek.deep;

import java.io.IOException;

import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.TargetService;

public class LoadTargetProfile {

	public static TargetProfile loadTargetProfile() throws IOException,
			ClassNotFoundException {

		String path = "c:\\Temp\\drools\\lib\\";
		path = path + "protobuf-java-2.5.0.jar";
		String mask = "com.google.protobuf";

		TargetService targetService = new TargetService();
		TargetProfile target = targetService.loadTargetProfile(path, mask);

		System.out.println("**Library profile**");
		System.out.println("Total of public classes/interfaces: " + target.getClasses().size());
		System.out.println("Public attributes (fields/methods/constructors): "
				+ target.getTotalPublicAttributes());
		return target;
	}

}
