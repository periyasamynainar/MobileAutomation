package com.iosTabletComponents.pages;
		
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




public class IOSTabletPage {
	
	private static final Logger LOGGER= Logger.getLogger(IOSTabletPage.class.getCanonicalName());
	
	public static final String Menu_Account ="//*[@id='accounts']";
	public static final String Accounts_Page = "//*[@class='navbar-brand']//*[contains(text(),'Accounts')]";
	public static final String Accounts_1Account = "//*[@id='list-item'][1]";	
	public static final String Accounts_2Account =  "//*[@id='list-item'][2]";	


	/* Functions on the Page are defined below */

}
