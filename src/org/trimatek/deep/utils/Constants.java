package org.trimatek.deep.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Constants {

	public final static String name = "Deep: dependencies analyzer";
	public final static float version = 1.1f;
	public final static String setup_file = "deep.ini";
	public final static DateFormat df = new SimpleDateFormat("HH:mm:ss");
	public final static int file_max_size = 5000000;
	public final static String[] file_extensions = {"jar","zip"};
	public final static String temp_dir = "/tmp";
	//public final static String temp_dir = "f:\\Temp";
	
}
