package com.components.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Reporter;

import com.framework.utilities.FrameworkReporter;
import com.framework.utilities.Starter;
import com.framework.utilities.TestProperties;
import com.gargoylesoftware.htmlunit.javascript.host.Element;

import io.appium.java_client.AppiumDriver;

public class LibraryPage  {
	

	public static final String XPATH = "xpath";
	public static final String ID = "id";
	public static final String CLASSNAME = "className";
	public static final String CSSLOCATORS = "cssSelector";
	public static final String LINKTEXT = "linkText";
	public static final String PARTIALLINKTEXT = "partialLinkText";
	public static final String NAME = "name";
	public static final String TAGNAME = "tagName";
	
	public static final Integer TIMEOUT = 60;
	
	
	private static AppiumDriver<WebElement> driver;
	
	LibraryPage(){
		driver = (AppiumDriver<WebElement>) Starter.getDriver();
	}
	
	
	/*
	public static void setWebDriver(WebDriver driver1) {
		driver = driver1;
	}*/
	
	
	
	/**
	 * @function clickElement
	 * @author Periyasamy_Nainar
	 * @description Click on UI Elements
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public Boolean clickElement(String[] stringVal){
		
		try{
			waitForElementToBeClickable(stringVal);
			driver.findElement(getLocatorsType(stringVal)).click();
			FrameworkReporter.info("Clicked on Element");
			
		}catch (Exception e) {
			FrameworkReporter.fail("Element"+ stringVal[0] + "is not clickable");
			e.printStackTrace(); 
		}
		return true;		
		
	}
	
	
	/**
	 * @function clear
	 * @author Periyasamy_Nainar
	 * @description Clear text from web element
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public Boolean clear(String[] stringVal){
		
		try{
			waitForElementToBeClickable(stringVal);
			driver.findElement(getLocatorsType(stringVal)).clear();
			FrameworkReporter.info("Cleared text from web Element "+ stringVal[0] );
		}catch (Exception e) {
			FrameworkReporter.fail("Issue while clearning text from an element "+ stringVal[0]);
			e.printStackTrace();
		}
		return true;		
		
	}
	
	/**
	 * @function waitFor
	 * @author Periyasamy_Nainar
	 * @description Wait for some time - for synchronization
	 * @param  iSecValue- Number of seconds to wait
	 * @date 15-09-2016
	 */
	
	public void waitFor(int iSecValue){		
		try{
			Thread.sleep(iSecValue);			
		}catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * @function waitForElementPresent
	 * @author Periyasamy_Nainar
	 * @description Wait for an element to be present - until maximum timeout unit  
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public WebElement waitForElementPresent(String[] stringVal){		
		Boolean boolVal =false ;	
		WebElement element=null;
		
		try{
			
			for(int i= 1 ; i<=TIMEOUT; i++){
				Thread.sleep(1000);
				if(driver.findElements(getLocatorsType(stringVal)).size()!=0){
					boolVal = true;
					break;
				}		
				
			}
			if(boolVal){
				element = driver.findElement(getLocatorsType(stringVal));
				if(element.isDisplayed()){
					FrameworkReporter.info("Element"+ stringVal[0]+ "is present");
				}else{
					FrameworkReporter.fail("Element"+ stringVal[0]+ "is not present");
				}				
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			}
			
			
		}catch (Exception e) {
			FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return element;
	}
	
	
	/**
	 * @function waitForElementToBeClickable
	 * @author Periyasamy_Nainar
	 * @description Wait for an element to be clickable - until maximum timeout unit  
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public WebElement waitForElementToBeClickable(String[] stringVal){		
		Boolean boolVal =false ;	
		WebElement element =null;
		
		try{
			
			for(int i= 1 ; i<=TIMEOUT; i++){
				Thread.sleep(1000);
				if(driver.findElements(getLocatorsType(stringVal)).size()!=0){
					boolVal = true;
					break;
				}		
				
			}
			if(boolVal){				
				element = driver.findElement(getLocatorsType(stringVal));
					if(element.isDisplayed() && element.isEnabled()){
						FrameworkReporter.info("Element"+ stringVal[0]+ "is clickable");
					}else{
						FrameworkReporter.fail("Element"+ stringVal[0]+ "is not clickable");
					}				
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			}
			
			
		}catch (Exception e) {
			FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return element;
	}
	
	/**
	 * @function waitForElementPresent
	 * @author Periyasamy_Nainar
	 * @description Wait for an element to present - until specified amount of timeUnit 
	 * @param stringVal - Locators value, iTimeUnit - Number of seconds to wait
	 * @date 15-09-2016
	 */
	
	public WebElement waitForElementPresent(String[] stringVal, int iTimeUnit){		
		Boolean boolVal =false ;	
		WebElement element=null;
		
		try{
			
			for(int i= 1 ; i<=iTimeUnit; i++){
				Thread.sleep(1000);
				if(driver.findElements(getLocatorsType(stringVal)).size()!=0){
					element = driver.findElement(getLocatorsType(stringVal));
					boolVal = true;
					break;
				}		
				
			}
			if(boolVal){
					if(element.isDisplayed()){
						FrameworkReporter.pass("Element"+ stringVal[0]+ "is present");
					}else{
						FrameworkReporter.fail("Element"+ stringVal[0]+ "is not present");
					}					
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			}
			
			
		}catch (Exception e) {
			FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return element;
	}
	
	/**
	 * @function waitForElementToBeClickable
	 * @author Periyasamy_Nainar
	 * @description Wait for an element to be clickable - Specify amount of time 
	 * @param stringVal - Locators value, iTimeUnit - Number of seconds to wait
	 * @date 15-09-2016
	 */
	
	public WebElement waitForElementToBeClickable(String[] stringVal, int iTimeUnit){		
		Boolean boolVal =false ;	
		WebElement element =null ;
		
		try{
			
			for(int i= 1 ; i<=iTimeUnit; i++){
				Thread.sleep(1000);
				if(driver.findElements(getLocatorsType(stringVal)).size()!=0){
					boolVal = true;
					break;
				}		
				
			}
			if(boolVal){
				FrameworkReporter.pass("Element"+ stringVal[0]+ "Present");
				element = driver.findElement(getLocatorsType(stringVal));
					if(element.isDisplayed() && element.isEnabled()){
						FrameworkReporter.pass("Element"+ stringVal[0]+ "is clickable");
					}else{
						FrameworkReporter.fail("Element"+ stringVal[0]+ "is not clickable");
					}				
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			}
			
			
		}catch (Exception e) {
			FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
	return element;
	}
	
	/**
	 * @function isElementPresent
	 * @author Periyasamy_Nainar
	 * @description Check whether an element is present or not, return true if an element present else return false. 
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public Boolean isElementPresent(String[] stringVal){
		
		Boolean boolVal =false ;
		
		try{
		if(driver.findElements(getLocatorsType(stringVal)).size()!=0){
			if(driver.findElement(getLocatorsType(stringVal)).isDisplayed()){
				FrameworkReporter.pass("Element with "+ stringVal[0]+ "is displayed");
				boolVal = true;
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not displayed");
				boolVal = false;
				}
			}
		else{
			FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not Present");
		}
		}catch (Exception e) {
			FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return boolVal;
	}
	
	
	/**
	 * @function isElementPresentAfterWait
	 * @author Periyasamy_Nainar
	 * @description Check whether an element is present or not after waiting for specify amount of time, return true if an element present else return false. 
	 * @param stringVal - Locators value, iSec - Time unit for specified amount of time
	 * @date 15-09-2016
	 */
	
	public Boolean isElementPresentAfterWait(String[] stringVal, int iSec){
		
		Boolean boolVal =false ;
		
		for(int i=1; i<=iSec*10; i++){
			
			try {
				Thread.sleep(100);
				if(driver.findElements(getLocatorsType(stringVal)).size()!=0){
					if(driver.findElement(getLocatorsType(stringVal)).isDisplayed()){
						FrameworkReporter.pass("Element with "+ stringVal[0]+ "is displayed");
						boolVal = true;
					}else{
						FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not displayed");
						boolVal = false;
					}
					break;
				}
				else{
					FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not Present");
				}
			}catch (Exception e) {
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
				e.printStackTrace();				
			}
			
		}
		
		return boolVal;
	}
	
	
	/**
	 * @function isElementClickable
	 * @author Periyasamy_Nainar
	 * @description Check whether an element is clickable or not, return true if an element present else return false. 
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public Boolean isElementClickable(String[] stringVal){
		
		Boolean boolVal =false ;
		WebElement element;
		
		try{
			element = driver.findElement(getLocatorsType(stringVal));
			if(element.isDisplayed() && element.isEnabled()){
				FrameworkReporter.pass("Element with "+ stringVal[0]+ "is clickable");
				boolVal = true;
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not clickable");
				boolVal = false;
			}
		}catch (Exception e) {
			FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return boolVal;
	}
	
	
	/**
	 * @function isElementClickableAfterWait
	 * @author Periyasamy_Nainar
	 * @description Check whether an element is clickable or not after waiting for specify amount of time, return true if an element present else return false. 
	 * @param stringVal - Locators value, iSec - Number of seconds to wait
	 * @date 15-09-2016
	 */
	
	public Boolean isElementClickableAfterWait(String[] stringVal, int iSec){
		
		Boolean boolVal =false ;
		WebElement element;
		
		for(int i=1; i<=iSec*10; i++){
			
			try {
				Thread.sleep(100);
				if(driver.findElements(getLocatorsType(stringVal)).size()!=0){
					element = driver.findElement(getLocatorsType(stringVal));
					if(element.isDisplayed() && element.isEnabled()){
						FrameworkReporter.pass("Element with "+ stringVal[0]+ "is clickable");
						boolVal = true;
					}else{
						FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not clickable");
						boolVal = false;
					}
					break;
				}
			}catch (Exception e) {
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
				e.printStackTrace();				
			}
			
		}
		
		return boolVal;
	}
	
	
	/**
	 * @function getElementText
	 * @author Periyasamy_Nainar
	 * @description get the text value or content form an element 
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */

	public String getElementText(String[] stringVal){	
		return waitForElementPresent(stringVal).getText();	
		
	}
	
	

	/**
	 * @function getLocatorsType
	 * @author Periyasamy_Nainar
	 * @description get Locators type before identifying an element
	 * @param stringVal - Locators value as array of strings with locators type
	 * @date 15-09-2016
	 */
	public By getLocatorsType(String[] str){
		
		String strVal = str[1];
		By byValue = null;
		
		switch(strVal){
		
		case "xpath":
			byValue = By.xpath(strVal);
			break;
		case "id":
			byValue = By.id(strVal);
			break;
		case "className":
			byValue = By.className(strVal);
			break;
		case "cssSelector":
			byValue = By.cssSelector(strVal);
			break;
		case "linkText":
			byValue = By.linkText(strVal);
			break;
		case "partialLinkText":
			byValue = By.partialLinkText(strVal);
			break;
		case "name":
			byValue = By.name(strVal);
			break;
		case "tagName":
			byValue = By.tagName(strVal);
			break;
		default:
			Reporter.log("Enter the correct locators type");
		
		}	
			return byValue;
	}
	
	/**
	 * @function switchToWebContext
	 * @author Periyasamy_Nainar
	 * @description switch to web context before perform any action on webview elements 
	 * @date 15-09-2016
	 */
	 public  LibraryPage switchToWebContext(){
			Set<String> contextNames1 = driver.getContextHandles();
			
			System.out.println(driver.getContext());
			if(driver.getContext().contains("WEBVIEW_")){
					// Dont do anything if the current context is webview
			}else{
				for (String contextName : contextNames1){
				System.out.println("inside loop "+contextNames1);
					if(contextName.contains("WEBVIEW_")){
							driver.context(contextName);
						//	Appium
						break;
					}
				}
			}
			return this;
		}
	 
	 /**
	 * @function switchToNativeContext
	 * @author Periyasamy_Nainar
	 * @description switch to native context before perform any action on native elements 
	 * @date 15-09-2016
	 */
	public  LibraryPage switchToNativeContext(){
	if(!(driver.getContext().contains("NATIVE_APP"))){
		driver.context("NATIVE_APP");
	}
	return this;
	}
	

	
	
	
}
