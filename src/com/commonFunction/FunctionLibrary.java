package com.commonFunction;

import com.framework.utilities.TestProperties;

public class FunctionLibrary {

	public static void consolePrint(String str){
		if(TestProperties.getProperty("ConsolePrint").equalsIgnoreCase("ON"))
			System.out.println(str);		
	}
	
}
