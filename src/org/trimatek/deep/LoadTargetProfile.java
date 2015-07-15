package org.trimatek.deep;

import java.io.IOException;

import org.ini4j.Wini;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.service.TargetService;

public class LoadTargetProfile {

	public static TargetProfile loadTargetProfile(Wini setup) throws IOException,
			ClassNotFoundException {

		String path = setup.get("library", "path") + "\\";;
		path = path + setup.get("library", "filename");
		String mask = setup.get("library", "namespace");

		TargetService targetService = new TargetService();
		TargetProfile target = targetService.loadTargetProfile(path, mask);

		return target;
	}

}
