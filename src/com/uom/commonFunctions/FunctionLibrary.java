package com.uom.commonFunctions;

import com.framework.configuration.*;;

public class FunctionLibrary {

	public static void consolePrint(String str){
		if(ConfigFile.getProperty("ConsolePrint").equalsIgnoreCase("ON"))
			System.out.println(str);		
	}
	
}
