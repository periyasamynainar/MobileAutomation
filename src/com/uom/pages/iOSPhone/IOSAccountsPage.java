package com.uom.pages.iOSPhone;
		
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

import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.Reporter;

import com.uom.pages.common.AccountsPage;




public class IOSAccountsPage extends AccountsPage {
	
	
	public static final String[] lnk_MenuAccount ={"//*[@id='accounts']",XPATH};		
	public static final String[] lbl_AccountsPage = {"//*[@class='navbar-brand']//*[contains(text(),'Accounts')]",XPATH};
	public static final String[] lbl_InvTools_Accountinfo = {"//*[@id='mount']/div/div/div[2]/nav/div/div/span/h4/a",XPATH};	
	public static final String[] btn_HamburgerMenu ={"//*[@id='hamburger-nav']",XPATH};
	public static final String[] lbl_InvToolsPage = {"//*[@class='navbar-brand']//*[contains(text(),'Inventory Tools')]",XPATH};
	public static final String[] lnk_SelectAccount = {"//*[@class='navbar-brand']//*[contains(text(),'Please select an account')]",XPATH};
	public static final String[] lbl_AccountNone = {"//*[@class='navbar-brand']//*[contains(text(),'Please select an account')]",XPATH};	
	


	/* Functions on the Page are defined below */

}
