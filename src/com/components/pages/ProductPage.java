		
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

package com.sysco.pages;

import java.io.IOException;
import java.util.Set;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.Reporter;

import com.sysco.jsn_framework.JSN_Framework;
import com.sysco.locators.Screenshot;
public class ProductPage extends JSN_Framework {
	
	private static final Logger LOGGER= Logger.getLogger(ProductPage.class.getCanonicalName());
	/* Defining the locators on the Page */

	
	// 14-08-2016 PN
	
	
	public static String lbl_CategoryDisabled = "//*[@class='mm-c-product-details__form disabled row']";
	public static String lbl_LocationDisabled = "//*[@class='mm-c-product-details__location disabled']//span";
	public static String EditWeb =  "//*[@id='edit-nav']/a";	
	public static String lst_Category = "//select[@name='expense']";
	public static String lst_Location = "(//select)[2]";	
	public static String rbt_CategoryFood =  "//android.widget.CheckedTextView[@index='{dynamic1}']";
	public static String rbt_Category =  "//android.widget.CheckedTextView[contains(text(),'{dynamic1}')]";
	public static String rbt_LocationType =  "//android.widget.CheckedTextView[contains(text(),'{dynamic1}')]";
	public static final String btn_Done =  "//*[@class='mm-c-navbar__done']/a";
	public String lnk_PageBack ="//li[@id='back-nav']/a";
	public String lbl_ProductDetailsPage ="//*[@class='navbar-brand']/h3";
	
	
	
	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @description verify location and category fields are not editable in product page before click on Edit button
	 * @Date  14-08-2016
	 * @throws InterruptedException, IOExceptio
	 * @param string
	 ****************************************************************************/	
	
	public void verifyLocationCategoryNonEditable(String string) throws InterruptedException, IOException {

		String finalPath1 = Screenshot.drivePath + string + "Issue" + Screenshot.pathExtension;
		Reporter.log("Verify location and category fields are not editable");
		try {
			
				if (isElementPresentAfterWait(lbl_CategoryDisabled, 10)) {
					Reporter.log("Category field is not editable: Pass");
				} else {
					Reporter.log("Category field is editable: Fail");
					throw new Exception("Category field is editable: Fail");
				    }
				
				if (isElementPresentAfterWait(lbl_LocationDisabled, 5)) {
					Reporter.log("Location field is not editable: Pass");
				} else {
					Reporter.log("Location field is editable: Fail");
					throw new Exception("Location field is editable: Fail");
				    }			
			}

		 catch (Exception e) {
			Reporter.log("Location field is editable :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);			
			Assert.assertTrue(false);
		}

		
	}
	
	
	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @description Get and store location and category values before the update
	 * @Date  14-08-2016
	 * @throws InterruptedException, IOExceptio
	 * @param string
	 ****************************************************************************/	
	
	public void getLocationAndCategoryValue(String string) throws InterruptedException, IOException {

		String finalPath1 = Screenshot.drivePath + string + "Issue" + Screenshot.pathExtension;
		Reporter.log("Verify location and category fields are not editable");
		try {
			
				if (isElementPresentAfterWait(lbl_CategoryDisabled, 10)) {
					String strCategoryVal = getElementText(lbl_CategoryDisabled).toString();
					strCategoryVal = strCategoryVal.split("EXPENSE:")[1].replace(" ", "");
					mapObj.put("categoryValue", strCategoryVal);					
				} else {
					throw new Exception("Category field is editable: Fail");
				    }
				
				if (isElementPresentAfterWait(lbl_LocationDisabled, 5)) {
					String strLocationVal = getElementText(lbl_LocationDisabled).toString();
					
					mapObj.put("locationValue", strLocationVal);
				} else {					
					throw new Exception("Location field is editable: Fail");
				    }			
			}

		 catch (Exception e) {
			Reporter.log("Location field is editable :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);			
			Assert.assertTrue(false);
		}

		
	}
	

	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @description verify location and category fields are updated after the change and reflected properly even after the logged out and login
	 * @Date  14-08-2016
	 * @throws InterruptedException, IOExceptio
	 * @param string
	 * @Dependency getLocationAndCategoryValue
	 ****************************************************************************/	
	
	public void verifyLocationAndCategoryValue(String strCatval, String strLocaVal, String string) throws InterruptedException, IOException {

		String finalPath1 = Screenshot.drivePath + string + "Issue" + Screenshot.pathExtension;
		Reporter.log("Verify location and category fields are not editable");
			
		try {
					
			if (isElementPresentAfterWait(lbl_CategoryDisabled, 10)) {
				String strCategoryVal = getElementText(lbl_CategoryDisabled).toString();
				strCategoryVal = strCategoryVal.split("EXPENSE:")[1].replace(" ", "");
				
				if(strCategoryVal.equalsIgnoreCase(strCatval) && 
						(!strCategoryVal.equalsIgnoreCase(mapObj.get("categoryValue").toString()))){
					Reporter.log("Category updated from "+ mapObj.get("categoryValue").toString()+ "to"+ strCategoryVal + "Pass");
				}else{
					Reporter.log("Category is not updated: Fail");
					throw new Exception();
				}
			} 
			
			
			if (isElementPresentAfterWait(lbl_LocationDisabled, 10)) {
				String strLocVal = getElementText(lbl_LocationDisabled).toString();
								
				if(strLocVal.equalsIgnoreCase(strLocaVal) && 
						(!strLocVal.equalsIgnoreCase(mapObj.get("locationValue").toString()))){
					Reporter.log("Location updated from "+ mapObj.get("locationValue").toString()+ "to"+ strLocVal + "Pass");
				}else{
					Reporter.log("Location is not updated: Fail");
					throw new Exception();
				}
			} 
		}

		 catch (Exception e) {
			Reporter.log("Location field is editable :Fail");
			switchToNativeContext();
			takeScreenshot(finalPath1);			
			Assert.assertTrue(false);
		}

		
	}
	
	

	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @category Tab on edit button
	 * @Date  14-08-2016
	 * @throws InterruptedException, IOExceptio
	 *  @param string
	 ****************************************************************************/	
	public void tapOnEdit(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		Reporter.log("Tab on Edit button");
		try {

			waitForElementToBeClickable(EditWeb);
			if (isElementPresent(EditWeb)) {
				clickElement(EditWeb);
				Reporter.log("tap on edit :Pass");
			}else{
				throw new Exception();						
			}

		} catch (Exception e) {
			Reporter.log("tap on edit :Fail");
			switchToNativeContext();			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}

	}
	
	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @category Click on category field to select category
	 * @Date  14-08-2016
	 * @throws InterruptedException, IOExceptio
	 * @param string
	 ****************************************************************************/	
	public void clickOnCategory(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		Reporter.log("Click on category");
		try {
			
			if (isElementPresentAfterWait(lst_Category, 10)) {
				clickElement(lst_Category);
				Reporter.log("Click on category :Pass");
			}else{
				throw new Exception();						
			}

		} catch (Exception e) {
			Reporter.log("Click on category :Fail");
			switchToNativeContext();			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}

	}
	
	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @category Click on Location field to select Location
	 * @Date  14-08-2016
	 * @param string
	 * @throws InterruptedException, IOExceptio
	 ****************************************************************************/	
	public void clickOnLocation(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		Reporter.log("Click on category");
		try {
			
			if (isElementPresentAfterWait(lst_Location, 10)) {
				clickElement(lst_Location);
				Reporter.log("Click on location :Pass");
			}else{
				throw new Exception();						
			}

		} catch (Exception e) {
			Reporter.log("Click on location :Fail");
			switchToNativeContext();			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}

	}
	
	
	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @category select the category from category picker view
	 * @Date  14-08-2016
	 * @param strCategoryType, string
	 * @throws InterruptedException, IOExceptio
	 ****************************************************************************/	
	public void selectCategory(String strCategoryType, String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		Reporter.log("Click on category");
		int index = 1;
		try {
			
			if(rbt_Category.contains("dynamic1")){			
				if(strCategoryType.toLowerCase().contains("non-food")){
					rbt_Category = rbt_Category.replace("{dynamic1}", "Non-Food");
					index= index + 1;
				}else if(strCategoryType.toLowerCase().contains("food")){
					rbt_Category = rbt_CategoryFood.replace("{dynamic1}", Integer.toString(index));
					mapObj.put("categoryIndex", index);
				}		
			}
			System.out.println("Elemnt is" + rbt_Category);
			
			if (isElementPresentAfterWait(rbt_Category, 10)) {
				clickElement(rbt_Category);
				Reporter.log("Click on category ele :Pass" + rbt_Category );
			}else{
				throw new Exception();						
			}

		} catch (Exception e) {
			Reporter.log("Click on category ele : Fail" + rbt_Category );
			switchToNativeContext();			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}
	}
	
	/**************************************************************************
	 * @author Periyasamy Nainar
	 * @category Verify category drop down - verify the option in picker view
	 * @Date  14-08-2016
	 * @param rbt_LocationType, string
	 * @throws InterruptedException, IOExceptio
	 ****************************************************************************/	
	public void verifyCategoryDropDown(String string) throws InterruptedException, IOException {
		String string2 = "Issue";

		String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
		Reporter.log("Click on category");
		try {
			
		//verify non food is displayed 		
			if(rbt_Category.contains("dynamic1")){	
				rbt_Category = rbt_Category.replace("{dynamic1}", "Non-Food");					
			}
			if (isElementPresentAfterWait(rbt_Category, 10)) {
				Reporter.log("Non Food displayed in dropdwon :Pass");
			}else{
				throw new Exception();						
			}
			
			
		//verify food is displayed in dropdown
			if(rbt_CategoryFood.contains("dynamic1")){	
				rbt_CategoryFood = rbt_CategoryFood.replace("{dynamic1}", mapObj.get("categoryIndex").toString());					
			}
			
			if (isElementPresentAfterWait(rbt_CategoryFood, 10)) {
				Reporter.log("Food displayed in dropdwon :Pass");
			}else{
				throw new Exception();						
			}
			
		}
		 catch (Exception e) {
			Reporter.log("Options not displayed : Fail" );
			switchToNativeContext();			
			takeScreenshot(finalPath1);
			Assert.assertTrue(false);
		}
}

		
		/**************************************************************************
		 * @author Periyasamy Nainar
		 * @category select the location from category picker view
		 * @Date  14-08-2016
		 * @param rbt_LocationType, string
		 * @throws InterruptedException, IOExceptio
		 * @Dependency getItemCountForDefaultLocations and SelectLocation in Inventory page
		 ****************************************************************************/	
		public void selectLocation(String strLocationType, String string) throws InterruptedException, IOException {
			String string2 = "Issue";
			int itemCount = 0;

			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
			Reporter.log("Click on category");
			try {
				
				
	// Increase the count by 1 for New Location 
			if(rbt_LocationType.contains("dynamic1")){	
				
			switch(strLocationType.toLowerCase()) {
			case "freezer":
				rbt_LocationType = rbt_LocationType.replace("{dynamic1}", "Freezer");
				itemCount = Integer.parseInt(mapObj.get("ItemCountInFreezer").toString())+1;
				mapObj.put("ItemCountInFreezer", itemCount);	
				break;
				
			case "cooler":
				rbt_LocationType = rbt_LocationType.replace("{dynamic1}", "Cooler");
				itemCount = Integer.parseInt(mapObj.get("ItemCountInCooler").toString())+1;	
				mapObj.put("ItemCountInCooler", itemCount);		
				break;
				
			case "dry":
				rbt_LocationType = rbt_LocationType.replace("{dynamic1}", "Dry");
				itemCount = Integer.parseInt(mapObj.get("ItemCountInDry").toString())+1;
				mapObj.put("ItemCountInDry", itemCount);	
				break;

				}	
			
//Reduce the count by 1 for old location 			
		switch(mapObj.get("currentLocationName").toString().toLowerCase().trim()){	
			case "freezer":			
				itemCount = Integer.parseInt(mapObj.get("ItemCountInFreezer").toString())-1;
				mapObj.put("ItemCountInFreezer", itemCount);	
				break;
				
			case "cooler":			
				itemCount = Integer.parseInt(mapObj.get("ItemCountInCooler").toString())-1;	
				mapObj.put("ItemCountInCooler", itemCount);		
				break;
				
			case "dry":
				itemCount = Integer.parseInt(mapObj.get("ItemCountInDry").toString())-1;
				mapObj.put("ItemCountInDry", itemCount);	
				break;
				}	
		
			}				
				System.out.println("Elemnt is" + rbt_LocationType);
				
				if (isElementPresentAfterWait(rbt_LocationType, 10)) {
					clickElement(rbt_LocationType);
					Reporter.log("Click on Location ele :Pass" + rbt_LocationType);
				}else{
					throw new Exception();						
				}
				
			}
			 catch (Exception e) {
				Reporter.log("Click on Location ele : Fail" + rbt_LocationType);
				switchToNativeContext();			
				takeScreenshot(finalPath1);
				Assert.assertTrue(false);
			}
			
	}
	
		
		/**************************************************************************
		 * @author Periyasamy Nainar
		 * @category  Verify location drop down - verify the option in picker view
		 * @Date  14-08-2016
		 * @param rbt_LocationType, string
		 * @throws InterruptedException, IOExceptio
		 ****************************************************************************/	
		public void verifyLocationDropDown(String string) throws InterruptedException, IOException {
			String string2 = "Issue";

			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
			Reporter.log("Click on category");
			try {
				
			//verify freezer is displayed 		
				if(rbt_LocationType.contains("dynamic1")){	
					rbt_LocationType = rbt_LocationType.replace("{dynamic1}", "Freezer");					
				}
				
				if (isElementPresentAfterWait(rbt_LocationType, 10)) {
					Reporter.log("Freezer displayed in dropdwon :Pass");
				}else{
					throw new Exception();						
				}
				
			//verify cooler is displayed in dropdown
				if(rbt_LocationType.contains("dynamic1")){	
					rbt_LocationType = rbt_LocationType.replace("{dynamic1}", "Cooler");					
				}
				
				if (isElementPresentAfterWait(rbt_LocationType, 10)) {
					Reporter.log("Freezer displayed in dropdwon :Pass");
				}else{
					throw new Exception();						
				}
				
			//verify dry is dispalyed in drop down
				if(rbt_LocationType.contains("dynamic1")){	
					rbt_LocationType = rbt_LocationType.replace("{dynamic1}", "Dry");					
				}				
				if (isElementPresentAfterWait(rbt_LocationType, 10)) {
					Reporter.log("Freezer displayed in dropdwon :Pass");
				}else{
					throw new Exception();						
				}
				
			}
			 catch (Exception e) {
				Reporter.log("Options not displayed : Fail" );
				switchToNativeContext();			
				takeScreenshot(finalPath1);
				Assert.assertTrue(false);
			}
	}

		/**************************************************************************
		 * @author Periyasamy Nainar
		 * @category Click on Done button 
		 * @Date  14-08-2016
		 * @param string
		 * @throws InterruptedException, IOExceptio
		 ****************************************************************************/	
		public void tabOnDone(String string) throws InterruptedException, IOException {
			String string2 = "Issue";

			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
			Reporter.log("Click on Done button ");
			try {
				
				if (isElementPresentAfterWait(btn_Done, 10)) {
					clickElement(btn_Done);
					Reporter.log("Click on done :Pass");
				}else{
					throw new Exception();						
				}

			} catch (Exception e) {
				Reporter.log("Click on done :Fail");
				switchToNativeContext();			
				takeScreenshot(finalPath1);
				Assert.assertTrue(false);
			}

		}
		

		/**************************************************************************
		 * @author Periyasamy Nainar
		 * @category Tab on Back button
		 * @Date  14-08-2016
		 * @throws InterruptedException, IOExceptio
		 *  @param string
		 ****************************************************************************/	
		public void tapBack(String string) throws InterruptedException, IOException {
			String string2 = "Issue";

			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
			Reporter.log("Tab on Back button");
			try {

				if (isElementPresentAfterWait(lnk_PageBack,20)){
					clickElement(lnk_PageBack);
					Reporter.log("tap on back :Pass");
				}else{
					throw new Exception();						
				}

			} catch (Exception e) {
				Reporter.log("tap on back :Fail");
				switchToNativeContext();			
				takeScreenshot(finalPath1);
				Assert.assertTrue(false);
			}

		}
		
		/**************************************************************************
		 * @author Periyasamy Nainar
		 * @category Verify product page is displayed or not
		 * @Date  14-08-2016
		 * @throws InterruptedException, IOExceptio
		 *  @param string
		 ****************************************************************************/	
		public void verifyProductPageLoaded(String string) throws InterruptedException, IOException {
			String string2 = "Issue";

			String finalPath1 = Screenshot.drivePath + string + string2 + Screenshot.pathExtension;
			Reporter.log("verify product page is displayed");
			try {

				if (isElementDisplayedAfterWait(lbl_ProductDetailsPage,20)){					
					Reporter.log("product page verification :Pass");
				}else{
					throw new Exception();						
				}
				
				
				if (getElementText(lbl_ProductDetailsPage).toString().trim().equalsIgnoreCase("Product Details")){					
					Reporter.log("product page header verification :Pass");
				}else{
					throw new Exception();						
				}
				

			} catch (Exception e) {
				Reporter.log("product page header verification :Fail");
				switchToNativeContext();			
				takeScreenshot(finalPath1);
				Assert.assertTrue(false);
			}

		}
	
	
		

}
