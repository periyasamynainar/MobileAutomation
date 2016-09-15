package com.framework.utilities;

import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import org.testng.Reporter;



public class FrameworkReporter {
	
	
	public static void pass(String str){
		
		Reporter.log("LOG_PASS:  "+ str);
		Assert.assertTrue(true);
	}
	
	public static void fail(String str){
		
		Reporter.log("LOG_FAIL:  "+ str);
		Assert.assertTrue(false);
	}
	

	public static void warning(String str){
	
	Reporter.log("LOG_WARNING:  "+ str);
	//Assert.assertTrue(false);
	}


	public static void info(String str){
	
	Reporter.log("LOG_INFO:  "+ str);
	//Assert.assertTrue(false);
}

	
	

}
