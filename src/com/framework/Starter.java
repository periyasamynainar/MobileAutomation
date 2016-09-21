package com.framework;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.framework.configuration.ConfigFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Starter {
	

	public static DesiredCapabilities cap;
//	static{			
	public static String strPlatformName, strPlatformVersion, strDeviceName, strAutoWebView, strUDID, strAppPath;
	public static String strHost, strPort ;	
	public static Boolean boolIsAppVal;
	public static WebDriver driver ;	
	public void startup() {				
		try {		
			URL urlObj = new URL("http://"+ strHost + ":"+ strPort+ "/wd/hub");
			switch(strPlatformName){			
				case "android":
					driver = new AndroidDriver<WebElement>(urlObj, getAndroidCapabilities());
					break;
				case "ios":
					driver = new IOSDriver<WebElement>(urlObj, getIOSCapabilities());	
					break;
				case "desktop":
					driver =new RemoteWebDriver(urlObj, getDesktopCapabilities());	
					break;
				default:
					System.out.println("Specify correct platformType in testType parameters in test.properties file");
			}
		}catch(Exception e){
			e.printStackTrace();
		}		
		
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	
	public DesiredCapabilities getAndroidCapabilities(){
		
		cap.setCapability("platfromName", strPlatformName);
		cap.setCapability("platfromVersion", strPlatformVersion);
		cap.setCapability("deviceName", strDeviceName);
		cap.setCapability("autoWebView", strAutoWebView);
		
		if(boolIsAppVal){
			cap.setCapability("appPath", strAppPath);
		}
		
		return cap;
	}
	
	public DesiredCapabilities getIOSCapabilities(){
		
		cap.setCapability("platfromName", strPlatformName);
		cap.setCapability("platfromVersion", strPlatformVersion);
		cap.setCapability("deviceName", strDeviceName);		
		cap.setCapability("udid", strUDID);
		
		if(boolIsAppVal){
			cap.setCapability("app", strAppPath);
		}
		
		return cap;
	}
	
	
	public DesiredCapabilities getDesktopCapabilities(){
		
		String strBrowser = ConfigFile.getProperty("test.browser").toLowerCase();
		
		switch(strBrowser){
			
		case "*chrome":
			cap = DesiredCapabilities.chrome();		
		case "*firefox":
			cap = DesiredCapabilities.firefox();
		case "*iexplorer":
			cap = DesiredCapabilities.internetExplorer();
		default:
			System.out.println("Please provide correct browser type in test.browser parameter");
		}
		
		return cap;
	}
	
	
	static{
		
		
		strHost = ConfigFile.getProperty("selenium.host");
		strPort = ConfigFile.getProperty("selenium.port");
		
		if(ConfigFile.getProperty("testType")==null | ConfigFile.getProperty("testType").trim().isEmpty()){
			strPlatformName = "";			
		}else{
			strPlatformName = ConfigFile.getProperty("testType").toLowerCase();}		
		
		if(ConfigFile.getProperty("platformVersion")==null | ConfigFile.getProperty("platformVersion")=="null"){
			strPlatformVersion = "";			
		}else{
			strPlatformVersion = ConfigFile.getProperty("platformVersion");		}
		
		if(ConfigFile.getProperty("deviceName")==null | ConfigFile.getProperty("deviceName")=="null"){
			strDeviceName = "";
			}else{
			strDeviceName = ConfigFile.getProperty("deviceName");		}
		
		if(ConfigFile.getProperty("autoWebView")==null | ConfigFile.getProperty("autoWebView")=="null"){
			strAutoWebView = "";			
		}else{
			strAutoWebView = ConfigFile.getProperty("autoWebView");		}
		
		if(ConfigFile.getProperty("udid")==null | ConfigFile.getProperty("udid")=="null"){
			strUDID = "";			
		}else{
			strUDID = ConfigFile.getProperty("udid");		}
		
		if(ConfigFile.getProperty("appPath")==null | ConfigFile.getProperty("appPath")=="null"){
			strAppPath = "";	
		}else{
			strAppPath = ConfigFile.getProperty("appPath");		}
		
		if(ConfigFile.getProperty("isApp")==null | ConfigFile.getProperty("isApp")=="null"){
			boolIsAppVal = false;	
		}else{
			boolIsAppVal = Boolean.parseBoolean(ConfigFile.getProperty("isApp"));		
			}
				
	}


}
