package com.components.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.framework.utilities.FrameworkReporter;

public class LibraryPage  {
	

	public static final String XPATH = "xpath";
	public static final String ID = "id";
	public static final String CLASSNAME = "className";
	public static final String CSSLOCATORS = "cssSelector";
	public static final String LINKTEXT = "linkText";
	public static final String PARTIALLINKTEXT = "partialLinkText";
	public static final String NAME = "name";
	public static final String TAGNAME = "tagName";
	
	
	private static WebDriver driver;
	
	public static void setWebDriver(WebDriver driver1) {
		driver = driver1;
	}
	
	
	
	/**
	 * @author Periyasamy_Nainar
	 * @description Click on UI Elements
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public Boolean clickElement(String[] stringVal){
		WebElement element ; 
		try{
			element = driver.findElement(getLocatorsType(stringVal));
			if(element!=null){
				element.click();
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not present");
			}
		}catch (Exception e) {
			FrameworkReporter.info("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		return true;		
		
	}
	
	/**
	 * @author Periyasamy_Nainar
	 * @description Check whether an element is present or not, return true if an element present else return false. 
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public Boolean isElementPresent(String[] stringVal){
		
		Boolean boolVal =false ;
		
		try{
			if(driver.findElement(getLocatorsType(stringVal)).isDisplayed()){
				FrameworkReporter.pass("Element with "+ stringVal[0]+ "is displayed");
				boolVal = true;
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not displayed");
				boolVal = false;
			}
		}catch (Exception e) {
			Reporter.log("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return boolVal;
	}
	
	
	/**
	 * @author Periyasamy_Nainar
	 * @description Check whether an element is present or not after waiting for specify amount of time, return true if an element present else return false. 
	 * @param stringVal - Locators value
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
			}catch (Exception e) {
				Reporter.log("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
				e.printStackTrace();				
			}
			
		}
		
		return boolVal;
	}
	
	
	/**
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
			Reporter.log("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return boolVal;
	}
	
	
	/**
	 * @author Periyasamy_Nainar
	 * @description Check whether an element is clickable or not after waiting for specify amount of time, return true if an element present else return false. 
	 * @param stringVal - Locators value
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
				Reporter.log("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
				e.printStackTrace();				
			}
			
		}
		
		return boolVal;
	}
	
	
	/**
	 * @author Periyasamy_Nainar
	 * @description get the text value or content form an element 
	 * @param stringVal - Locators value
	 * @date 15-09-2016
	 */
	
	public String getText(String[] stringVal){
		
		String strText="";
		
		try{
			WebElement element = driver.findElement(getLocatorsType(stringVal));
			if(element.isDisplayed()){
				strText = element.getText();
				//FrameworkReporter.info("Element with "+ stringVal[0]+ "is displayed and the text");				
			}else{
				FrameworkReporter.fail("Element with "+ stringVal[0]+ "is not displayed");				
			}
		}catch (Exception e) {
			Reporter.log("Element with "+ stringVal[0]+ "and type "+ stringVal[1] + "is not present");
			e.printStackTrace();
		}
		
		return strText;
	}
	

	/**
	 * @author Periyasamy_Nainar
	 * @description get Locators type before identifying an element
	 * @param stringVal - Locators value as array of strings with locators type
	 * @date 15-09-2016
	 */
	public By getLocatorsType(String[] str){
		
		String strVal = str[1];
		By byValue;
		
		switch(strVal){
		
		case "xpath":
			byValue = By.xpath(str[1]);
			break;
		case "id":
			byValue = By.id(str[1]);
			break;
		case "className":
			byValue = By.className(str[1]);
			break;
		case "cssSelector":
			byValue = By.cssSelector(str[1]);
			break;
		case "linkText":
			byValue = By.linkText(str[1]);
			break;
		case "partialLinkText":
			byValue = By.partialLinkText(str[1]);
			break;
		case "name":
			byValue = By.name(str[1]);
			break;
		case "tagName":
			byValue = By.tagName(str[1]);
			break;
		default:
			Reporter.log("Enter the correct locators type");
		
		}
		
			return By.xpath(str[1]);
	}
	

	
	
	
	
}
