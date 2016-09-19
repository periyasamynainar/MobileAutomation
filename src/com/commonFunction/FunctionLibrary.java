package com.commonFunction;

import com.framework.utilities.ConfigFile;

public class FunctionLibrary {

	public static void consolePrint(String str){
		if(ConfigFile.getProperty("ConsolePrint").equalsIgnoreCase("ON"))
			System.out.println(str);		
	}
	
}
