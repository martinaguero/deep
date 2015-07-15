package org.trimatek.deep;

import java.io.IOException;

import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.TargetService;

public class LoadTargetProfile {

	public static TargetProfile loadTargetProfile() throws IOException,
			ClassNotFoundException {

		String path = "f:\\Temp\\";
		path = path + "target.jar";
		String mask = "org.trimatek";

		TargetService targetService = new TargetService();
		TargetProfile target = targetService.loadTargetProfile(path, mask);

		return target;
	}

}
