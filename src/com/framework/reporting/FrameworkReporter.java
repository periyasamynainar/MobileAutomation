package com.framework.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import org.testng.Reporter;



public class FrameworkReporter {
	
	
	
	public static void pass(String str){
		
		Reporter.log(getTime()+ "   LOG_PASS:  " + str);
		Assert.assertTrue(true);
	
	}
	
	public static void fail(String str){
		
		Reporter.log(getTime()+ "   LOG_FAIL:  "+ str);
		Assert.assertTrue(false);
	}
	

	public static void warning(String str){
	
	Reporter.log(getTime()+ "   LOG_WARNING:  "+ str);
	//Assert.assertTrue(false);
	}


	public static void info(String str){
	
	Reporter.log(getTime()+ "   LOG_INFO:  "+ str);
	//Assert.assertTrue(false);
}

	public static String getTime(){
		Calendar cal = Calendar.getInstance();	
		DateFormat df = new SimpleDateFormat("HH:mm:SS");
		return df.format(cal.getTime());
	}
	

}
