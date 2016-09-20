package com.uom.pages.common;
		
		/**
		 ********************************************************************************************************************************************
		 ********************************************************************************************************************************************
		 *																																		   	*
		 * 2016-2017 Infosys Limited, Banglore, India. All Rights Reserved																			*
		 * Version: 1.0																																*
		 * 																																			*
		 * Except for any free or open source software components embedded in this Infosys proprietary software program ("Program"),				*
		 * this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India, *
		 * the United States and other countries. Except as expressly permitted, any unautorized reproduction, storage, transmission 				*
		 * in any form or by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), 		*
		 * or any distribution of this Program, or any portion of it, may result in severe civil and criminal penalties, 							*
		 * and will be prosecuted to the maximum extent possible under the law 																		*
		 *																																			*
		 ********************************************************************************************************************************************
		 ********************************************************************************************************************************************
		 **/

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.Reporter;

import com.framework.frameworkFunctions.*;
import com.uom.pages.androidPhone.AndroidAccountsPage;
import com.framework.configuration.*;


public class AccountsPage extends LibraryPage{
	
	private static final Logger LOGGER= Logger.getLogger(AccountsPage.class.getCanonicalName());
	
	

	
	//new objects
	public static final String[] lnk_MenuAccount ={"//*[@id='accounts']",XPATH};		
	public static final String[] lbl_AccountsPage = {"//*[@class='navbar-brand']//*[contains(text(),'Accounts')]",XPATH};
	public static final String[] lbl_InvTools_Accountinfo = {"//*[@id='mount']/div/div/div[2]/nav/div/div/span/h4/a",XPATH};	
	public static final String[] btn_HamburgerMenu ={"//*[@id='hamburger-nav']",XPATH};
	public static final String[] lbl_InvToolsPage = {"//*[@class='navbar-brand']//*[contains(text(),'Inventory Tools')]",XPATH};
	public static final String[] lnk_SelectAccount = {"//*[@class='navbar-brand']//*[contains(text(),'Please select an account')]",XPATH};
	public static final String[] lbl_AccountNone = {"//*[@class='navbar-brand']//*[contains(text(),'Please select an account')]",XPATH};	
	
	
	//old objects - Needs to be removed after updating correct locators
	public static final String Menu_Account ="//*[@id='accounts']";
	public static final String Accounts_Page = "//*[@class='navbar-brand']//*[contains(text(),'Accounts')]";
	public static final String[] InventoryToolsPage_Accountinfo = {"//*[@id='mount']/div/div/div[2]/nav/div/div/span/h4/a",XPATH};	
	public static final String[] HamburgerMenu ={"//*[@id='hamburger-nav']",XPATH};
	public static final String[] InvToolsPage = {"//*[@class='navbar-brand']//*[contains(text(),'Inventory Tools')]",XPATH};
	public static final String[] selectAcc = {"//*[@class='navbar-brand']//*[contains(text(),'Please select an account')]",XPATH};
	public static final String[] account_None = {"//*[@class='navbar-brand']//*[contains(text(),'Please select an account')]",XPATH};	
	
	
	//new 
	public static  String[] lst_Accounts = {"//*[@id='list-item'][{dynamic1}]",XPATH};	
	
	
	//old objects - Needs to be removed after updating correct locators
	public static final String[] Accounts_1Account = {"//*[@id='list-item'][1]",XPATH};	
	public static final String[] Accounts_2Account =  {"//*[@id='list-item'][2]",XPATH};	
	public static final String[] Accounts_3Account = {"//*[@id='list-item'][3]",XPATH};	
	public static final String[] Accounts_4Account ={  "//*[@id='list-item'][4]",XPATH};		
	public static final String[] Accounts_5Account ={ "//*[@id='list-item'][5]",XPATH};		
	public static final String[] Accounts_6Account ={"//*[@id='list-item'][6]",XPATH};	
	public String strAccountInfo;
	
	
	
	
	
	//Below elements should move to Native element page - Common page
	public static final String[] FirstAccounts ={ "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[2]",XPATH};
	public static final String[] SecondAccounts ={ "//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[3]",XPATH};
	public static final String[] accountID = {"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[5]",XPATH};
	
	public String firstAccount, secondAccount,T_AccountInfo, F_AccountInfo, FfAccountInfo, SxAccountInfo,	SecondAccountInfo, FirstAccountInfo;
	
	Field[] accountPageObj = new AndroidAccountsPage().getClass().getDeclaredFields();
	
	public AccountsPage(){
		String strBrand = ConfigFile.getProperty("Brand").toString().toLowerCase();
		
		
		switch(strBrand){
			
		case "android":
			accountPageObj = new AndroidAccountsPage().getClass().getDeclaredFields();
			break;
		case "iphone":
			//accountPageObj = new IOSAccountsPage();
			break;
		case "iostablet":
		//	accountPageObj = new IOSTabletPage();	
			break;
		}
		
	}
	
	


	
	/* Functions on the Page are defined below */


	/**
	 * @Function clickOnMenuAccount
	 * @author Periyasamy_Nainar
	 * @description Click on Account link from home page 
	 * @date 15-09-2016
	 */
	
	public AccountsPage clickOnMenuAccount() {			
			clickElement(lnk_MenuAccount);	
	
			
		return this;
	}
	
	
	/**
	 * @Function clickElementAccount
	 * @author Periyasamy_Nainar
	 * @description Click on Account link from home page
	 * @date 15-09-2016
	 */
	public AccountsPage clickOnSelectAccount() {	
			clickElement(lnk_SelectAccount);	
			return this;
		}
	
	
	/**
	 * @Function clickElementAccount
	 * @author Periyasamy_Nainar
	 * @description Click on Account link from home page
	 * @date 15-09-2016
	 */	
	public AccountsPage selectAccount(String str1,int iAccount){				
		if ((str1.equalsIgnoreCase("uomsa001")) || (str1.equalsIgnoreCase("uomsa002"))) {
			//	waitForElementToBeClickable(Accounts_3Account).click();				
			if(lst_Accounts[0].contains("{dynamic1}")){
				lst_Accounts[0] = lst_Accounts[0].replace("{dynamic1}", Integer.toString(iAccount));
				clickElement(lst_Accounts);
				
			}
			
			if (isElementPresentAfterWait(lbl_InvTools_Accountinfo, 20)) {
				strAccountInfo = getElementText(lbl_InvTools_Accountinfo);
			}
		}
	return this;

}
	
	
//We can remove the below functions - Above functions are created instead of below functions
/**
 * 
 * 
 * 	
 * 
 * 
 * 
 * 
 * 
 */
	
	public AccountsPage Third_AccountSelection(String str1, String string){
	
		
			if ((str1.equalsIgnoreCase("uomsa001")) || (str1.equalsIgnoreCase("uomsa002"))) {
				//	waitForElementToBeClickable(Accounts_3Account).click();				
				if(lst_Accounts[0].contains("{dynamic1}")){
					lst_Accounts[0] = lst_Accounts[0].replace("{dynamic1}", Integer.toString(3));
				}
				
				if (isElementPresentAfterWait(InventoryToolsPage_Accountinfo, 20)) {
					T_AccountInfo = getElementText(InventoryToolsPage_Accountinfo);
				}
			}
		
		
			
			Assert.assertTrue(false);

	
		return this;

	}
	
	@SuppressWarnings("rawtypes")
	public AccountsPage Fourth_AccountSelection(String str1, String string) throws InterruptedException, IOException {

		
			if ((str1.equalsIgnoreCase("uomsa001")) || (str1.equalsIgnoreCase("uomsa002"))) {
				waitForElementToBeClickable(Accounts_4Account);
				clickElement(Accounts_4Account);
				waitFor(5);
				if (isElementPresentAfterWait(InventoryToolsPage_Accountinfo, 20)) {
					F_AccountInfo = getElementText(InventoryToolsPage_Accountinfo);
				}
				Reporter.log("Got 4th account information :Pass");
			}
		
			
			
		return this;
	}

	@SuppressWarnings("rawtypes")
	public AccountsPage Fifth_AccountSelection(String str1, String string) throws InterruptedException, IOException {
		
			if ((str1.equalsIgnoreCase("uomsa001")) || (str1.equalsIgnoreCase("uomsa002"))) {
				waitForElementToBeClickable(Accounts_5Account);
				clickElement(Accounts_5Account);
				waitFor(5);
				if (isElementPresentAfterWait(InventoryToolsPage_Accountinfo, 20)) {
					FfAccountInfo = getElementText(InventoryToolsPage_Accountinfo);
				}
				Reporter.log("Got 5th account information :Pass");
			}
		
		return this;

	}
	
	@SuppressWarnings("rawtypes")
	public AccountsPage Sixth_AccountSelection(String str1, String string) throws InterruptedException, IOException {
		
		
			if ((str1.equalsIgnoreCase("uomsa001")) || (str1.equalsIgnoreCase("uomsa002"))) {
				clickElement(Accounts_6Account);
				waitFor(5);
				if (isElementPresentAfterWait(InventoryToolsPage_Accountinfo, 20)) {
					SxAccountInfo = getElementText(InventoryToolsPage_Accountinfo);
				}
				Reporter.log("Got 6th account information :Pass");
			}
		
		return this;

	}


	

	@SuppressWarnings("rawtypes")
	public AccountsPage First_AccountSelection(String str1, String string) throws InterruptedException, IOException {
		
			if ((str1.equalsIgnoreCase("sqsauser32")) || (str1.equalsIgnoreCase("sqsauser33"))) {
				waitForElementToBeClickable(Accounts_1Account).click();
				if (isElementPresentAfterWait(InventoryToolsPage_Accountinfo, 20)) {
					T_AccountInfo = getElementText(InventoryToolsPage_Accountinfo);
				}
				Reporter.log("Got 1st account information :Pass");
			}
		

		return this;
	}
	
	@SuppressWarnings("rawtypes")
	public AccountsPage Second_AccountSelection(String str1, String string) throws InterruptedException, IOException {
		
			if ((str1.equalsIgnoreCase("sqsauser32")) || (str1.equalsIgnoreCase("sqsauser33"))) {
				waitForElementToBeClickable(Accounts_2Account).click();
				if (isElementPresentAfterWait(InventoryToolsPage_Accountinfo, 30)) {
					T_AccountInfo = getElementText(InventoryToolsPage_Accountinfo);
				}
				Reporter.log("Got 2nd account information :Pass");
			}
		
		return this;
	}
	
	
	public AccountsPage clickElementAccount(String string) throws InterruptedException, IOException {
		
		if (isElementPresent(selectAcc)) {
			clickElement(selectAcc);
			Reporter.log("clickElemented select account :Pass");
		}
	
	return this;
		}
	
	
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	
	
	}
