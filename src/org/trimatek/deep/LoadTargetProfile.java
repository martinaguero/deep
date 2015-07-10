package org.trimatek.deep;

import java.io.IOException;

import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.TargetService;

public class LoadTargetProfile {

	public static TargetProfile loadTargetProfile() throws IOException,
			ClassNotFoundException {

		String path = "F:\\Docs\\Martín\\Dropbox\\Tesis\\workspace.tests\\drools-expert\\lib\\";
		path = path + "slf4j-api-1.7.2.jar";
		String mask = "org.slf4j";

		TargetService targetService = new TargetService();
		TargetProfile target = targetService.loadTargetProfile(path, mask);

		System.out.println("**Library profile**");
		System.out.println("Total of public classes/interfaces: " + target.getClasses().size());
		System.out.println("Public attributes (fields/methods/constructors): "
				+ target.getTotalPublicAttributes());
		return target;
	}

}
