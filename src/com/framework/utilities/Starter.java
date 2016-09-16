package com.framework.utilities;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.components.pages.LibraryPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Starter {


	
	public static ThreadLocal<WebDriver> localThread = new ThreadLocal<WebDriver>();

	public static DesiredCapabilities cap;
//	static{			
	public static String strPlatformName, strPlatformVersion, strDeviceName, strAutoWebView, strUDID, strAppPath;
	public static String strHost, strPort ;	
	public static Boolean boolIsAppVal;
	AppiumDriver<WebElement> driver ;
	
	
	
	public void startup() {		
		
		try {		
			URL urlObj = new URL("http://"+ strHost + ":"+ strPort+ "/wd/hub");
			
			switch(strPlatformName){			
				case "android":
					driver = new AndroidDriver<WebElement>(urlObj, getAndroidCapabilities());
					localThread.set(driver);
					break;
				case "ios":
					driver = new IOSDriver<WebElement>(urlObj, getIOSCapabilities());	
					localThread.set(driver);
					break;
				case "desktop":
					driver = (AppiumDriver<WebElement>) new RemoteWebDriver(urlObj, getDesktopCapabilities());	
				default:
					System.out.println("Specify correct platformType in testType parameters in test.properties file");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
						
		localThread.set(driver);
	//	localThread.get().manage().window().maximize();
		System.out.print("local Thread"+ localThread.toString()+ "   ");
		System.out.println("driver"+ localThread.get().toString()); 
		
	}
	
	public static WebDriver getDriver(){
		//LibraryPage.setWebDriver(localThread.get());      // This line of code is used to send current thread instance to library page class
		return localThread.get();
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
		
		String strBrowser = TestProperties.getProperty("test.browser").toLowerCase();
		
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
		
		
		strHost = TestProperties.getProperty("selenium.host");
		strPort = TestProperties.getProperty("selenium.port");
		
		if(TestProperties.getProperty("testType")==null | TestProperties.getProperty("testType")=="null"){
			strPlatformName = "";			
		}else{
			strPlatformName = TestProperties.getProperty("testType").toLowerCase();}		
		
		if(TestProperties.getProperty("platformVersion")==null | TestProperties.getProperty("platformVersion")=="null"){
			strPlatformVersion = "";			
		}else{
			strPlatformVersion = TestProperties.getProperty("platformVersion");		}
		
		if(TestProperties.getProperty("deviceName")==null | TestProperties.getProperty("deviceName")=="null"){
			strDeviceName = "";
			}else{
			strDeviceName = TestProperties.getProperty("deviceName");		}
		
		if(TestProperties.getProperty("autoWebView")==null | TestProperties.getProperty("autoWebView")=="null"){
			strAutoWebView = "";			
		}else{
			strAutoWebView = TestProperties.getProperty("autoWebView");		}
		
		if(TestProperties.getProperty("udid")==null | TestProperties.getProperty("udid")=="null"){
			strUDID = "";			
		}else{
			strUDID = TestProperties.getProperty("udid");		}
		
		if(TestProperties.getProperty("appPath")==null | TestProperties.getProperty("appPath")=="null"){
			strAppPath = "";	
		}else{
			strAppPath = TestProperties.getProperty("appPath");		}
		
		if(TestProperties.getProperty("isApp")==null | TestProperties.getProperty("isApp")=="null"){
			boolIsAppVal = false;	
		}else{
			boolIsAppVal = Boolean.parseBoolean(TestProperties.getProperty("isApp"));		
			}
				
	}


}
