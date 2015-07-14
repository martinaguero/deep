package org.trimatek.deep;

import java.io.IOException;

import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.TargetService;

public class LoadTargetProfile {

	public static TargetProfile loadTargetProfile() throws IOException,
			ClassNotFoundException {

		String path = "f:\\Temp\\lib\\";
		path = path + "log4j-1.2.14.jar";
		String mask = "org.apache.log4j";

		TargetService targetService = new TargetService();
		TargetProfile target = targetService.loadTargetProfile(path, mask);

		return target;
	}

}
