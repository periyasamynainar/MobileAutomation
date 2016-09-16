		
		/**
		 ********************************************************************************************************************************************
		 ********************************************************************************************************************************************
		 *																																		   	*
		 * 2016-2017 Infosys Limited, Banglore, India. All Rights Reserved																			*
		 *																																			*
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
		package com.components.pages;
		import java.io.IOException;
		
		import java.util.Set;
		import java.util.logging.Logger;
		
		import org.testng.Assert;
		import org.testng.Reporter;		
		
		
		import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.ios.IOSDriver;
		
		public class CategoryPage extends LibraryPage {
			
			private static final Logger LOGGER= Logger.getLogger(CategoryPage.class.getCanonicalName());
			
		
			 
			
			public static final String[] Continue ={"//*[@class='btn btn-default' and contains(text(),'Continue')]",ID};
			public static final String[] Header={"//*[@id='mount']/div/div/div[2]/nav/div/div/span/h3", XPATH};
			public static final String[] Category_FirstItemSelect= {"//*[@class='checkbox']//*[@class='mm-o-icon']//*[@class='item-input'and @data-index='0']",XPATH};
			public static final String[] Category_FirstItemHeader= {"//*[@id='mount']/div/div/div[2]/div/div[2]/div[1]/div/div/div[1]/div/div[2]/div[2]/h4",XPATH};
			public static final String[] InvToolsPg = {"//*[@class='navbar-brand']//*[contains(text(),'Inventory Tools')]",XPATH};
			public static final String[] SecondCategory_FirstItemSelect= {"//*[@class='checkbox']//*[@class='mm-o-icon']//*[@class='item-input'and @data-index='1']",XPATH};
			public static final String[] FoodAndNonFood = {"//*[contains(text(),'Food & Non-Food')]",XPATH};		
			public static final String[]  SuggestedCategories = {"//*[contains(text(),'Suggested Categories')]",XPATH};
			public static final String[]  CustomCategories = {"//*[contains(text(),'Create Expense Cat.')]",XPATH};		
		
			public static final String[] Complete = {"//*[@class='btn btn-default' and contains(text(),'Complete')]",XPATH};
			public static final String[] SetupInventoryCustomCategoryAllItemsTab ={"//*[@id='mount']//*[@class='mm-c-productList--pill-left']/a",XPATH};
			public static final String[] SetupInventoryCustomCategoryUncategorizedTab = {"//*[@id='mount']//*[@class='mm-c-productList--pill-right']/a",XPATH};
			
			public static final String[] Category_Header= {"//*[@id='mount']/div/div/div[2]/nav/div/div/span/h3",XPATH};
		
			public static final String[] ExpenseCategory_Food= {"(//*[@class='radio'])[1]/label",XPATH};
			public static final String[] ExpenseCategory_Page={"//*[contains(text(),'Create Custom Expense Categories')]",XPATH};
		
			public static final String[] ExpenseCategory_Name={"//*[@class='mm-c-customexpense__details-category-name form-control form-control' and @name='formFields[0].name']",XPATH};
			public static final String[] ExpenseCategory_NonFood= {"{(//*[@class='mm-c-customexpense__details-category']//*[@class='radio'])[2]/label",XPATH};
		
			public static final String[] NextWeb ={"//*[@id='next-nav']/a",XPATH};
			
			public static final String[] ExpenseCategory_NameTxt= {"//*[@name='dynamicFields[0].name']",XPATH};
			
			public static final String[] ExpenseCategory_AnotherCategory={"//*[contains(text(),'Add Another Category')]",XPATH};
			
			public static final String[] ExpenseCategory_Name1= {"//*[@name='dynamicFields[1].name']",XPATH};
			
			public static final String[] ExpenseCategory_Food1= {"(//*[@class='radio'])[3]/label",XPATH};

			public static final String[] Category_1stItemSelect= {"(//*[@class='mm-c-product-minlist mm-c-product__sysco']//*[@class='mm-o-icon'])[1]",XPATH};
			public static final String[] Category_2ndItemSelect= {"(//*[@class='mm-c-product-minlist mm-c-product__sysco']//*[@class='mm-o-icon'])[2]",XPATH};
			public static final String[] Category_3rdItemSelect= {"(//*[@class='mm-c-product-minlist mm-c-product__sysco']//*[@class='mm-o-icon'])[3]",XPATH};
			public static final String[] Category_1stItemHeading={"(//*[@class='mm-c-product-minlist__item']/h4)[1]",XPATH};
			public static final String[] Category_2ndItemHeading={"(//*[@class='mm-c-product-minlist__item']/h4)[2]",XPATH};
			public static final String[] Category_3rdItemHeading= {"(//*[@class='mm-c-product-minlist__item']/h4)[3]",XPATH};
		
		
			
			public static final String[] ADD_CategoryName= {"//*[@id='name']",XPATH};
			public static final String[] AddCategory_FoodWeb= {"(//*[@class='mm-c-expense__details-radio']//*[@class='radio'])[1]",XPATH};
			public static final String[] AddCategory_Food="//android.widget.RadioButton[@content-desc='FOOD']"




		
			
			public static final String[] AddCategory_NonFood="//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAElement[2]",XPATH};
		    
		
			
		
		
			public static final String[] Category_NonSyscoItem1Select="(//*[@class='mm-c-product-minlist mm-c-product__custom']//*[@class='mm-o-icon'])[1]",XPATH};
			public static final String[] Category_NonSyscoItem2Select="(//*[@class='mm-c-product-minlist mm-c-product__custom']//*[@class='mm-o-icon'])[2]",XPATH};
			public static final String[] Category_4thItemHeading= {"(//*[@class='mm-c-product-minlist__item']/h4)[4]",XPATH};
			public static	String CategoryItemName1_4;
			public static final String[] SetUp_Pg3Header ="//*[@class='navbar-brand']//*[contains(text(),'Setup Inventory')]",XPATH};
			
			public static final String[] CreateExpenseCategoryHeader ="//*[contains(text(),'Create Custom Expense Categories')]",XPATH};
					
			
			public static final String[] CreateExpenseCategoryDesc1 ="//*[contains(text(),'Create one or more custom expense categories ')]",XPATH};
			
			public static final String[] CreateExpenseCategoryDesc2 ="//*[contains(text(),'and then select items that belong to each.')]",XPATH};
					 
		
			public static final String[] Select_SuggCat_Dairy = {"//*[@id='list-item']//*[contains(text(),'Dairy')]",XPATH};
			public static final String[] Select_SuggCat_Meat = {"//*[@id='list-item']//*[contains(text(),'Meat')]",XPATH};
		
		
		
			
			public static final String[] SetUp_Pg3Title = {"//*[@id='content-container']/div[1]/div[2]/h2",XPATH};
			
			
			
			
			
			//old elements - which needs to be removed
			public static final String[] DoneWeb={"//*[@id='done-nav']/a",XPATH};		
			public static final String Back ="//*[@id='back-nav']/a/i",XPATH};
			public static final String AddWeb= {"//*[@id='add-nav']/a/i",XPATH};
			public static final String EditWeb = {"//*[@id='edit-nav']/a/i",XPATH};
			public static final String Delete ="//*[@id='delete-button' and contains(text(),'Delete Expense Category')]",XPATH};
			public static final String YesDelete ="//*[@id='yes-button' and contains(text(),'Yes, Delete')]",XPATH};
			//new for above elements
			
			
			
			
			
			
			
			
			//old elements - which needs to be removed
			public static final String[] textUnderFoodAndNOnFood = {"//*[contains(text(),'Use these as expense categories')]",LibraryPage.XPATH};
			public static final String[] textUnderSuggestedCat = {"//*[contains(text(),'Meat, Poultry, Seafood, Dairy, Produce, Groceries, Beverages, & Miscellaneous')]",XPATH};
			public static final String[] textUnderCreateExpCat = {"//*[contains(text(),'Create your own')]",XPATH};	
			public static final String[] FoodAndNonFoodDesc = {"//*[contains(text(),'Use these as expense categories')]",LibraryPage.XPATH};
			public static final String[] SuggestedCategoriesDesc ={"//*[contains(text(),'Meat, Poultry, Seafood, Dairy, Produce, Groceries, Beverages, and Miscellaneous')]",XPATH};
			public static final String[] CustomCategoriesDesc = {"//*[contains(text(),'Create your own')]",XPATH};
			//new for above elements
			public static final String[] lbl_FoodAndNonFoodDesc = {"//*[contains(text(),'Use these as expense categories')]",XPATH};
			public static final String[] lbl_SuggestedCategoriesDesc ={"//*[contains(text(),'Meat, Poultry, Seafood, Dairy, Produce, Groceries, Beverages, and Miscellaneous')]",XPATH};
			public static final String[] lbl_CustomCategoriesDesc = {"//*[contains(text(),'Create your own')]",XPATH};
			
						
			
			//old elements - which needs to be removed
			public static final String[] SuggestedCategory_Dairy= {"//*[@id='list-item']//span[contains(text(),'Dairy')]",XPATH};
			public static final String[] SuggestedCategory_Meat= {"//*[@id='list-item']//span[contains(text(),'Meat')]",XPATH};
			public static final String[] SuggestedCategory_Poultry={ "//*[@id='list-item']//span[contains(text(),'Poultry')]",XPATH};
			public static final String[] SuggestedCategory_Seafood= {"//*[@id='list-item']//span[contains(text(),'Seafood')]",XPATH};
			public static final String[] SuggestedCategory_Produce= {"//*[@id='list-item']//span[contains(text(),'Produce')]",XPATH};
			public static final String[] SuggestedCategory_Groceries={ "//*[@id='list-item']//span[contains(text(),'Groceries')]",XPATH};
			public static final String[] SuggestedCategory_Beverage= {"//*[@id='list-item']//span[contains(text(),'Beverage')]",XPATH};
			public static final String[] SuggestedCategory_Miscellaneous= {"//*[@id='list-item']//span[contains(text(),'Miscellaneous')]",XPATH};
			public static final String[] DefaultCategory_Food= {"//*[@id='list-item']//span[contains(text(),'Food')]",XPATH};
			public static final String[] DefaultCategory_NonFood= {"//*[@id='list-item']//span[contains(text(),'Non-Food')]",XPATH};
			//new for above elements
			public static final String[] lst_SelectCategory= {"//*[@id='list-item']//span[contains(text(),'{dynamic1}')]",XPATH};
			
			
			
			//native elements
			public static final String Next="//UIAStaticText[@label='Next']";
			public static final String Done="//UIAStaticText[@label='Done']";
			
			
			
			
			
			public static String CategoryItemName1_1,String CategoryItemName1_2,CategoryItemName1_3,CategoryItemName2_1,CategoryItemName2_2,CategoryItemName2_3;		
			public static int CategoryNoOfElements1,CategorysNoOfElements2;
			public String CategoryName,ItemNameSelected,ItemNameAdded,SyscocategoryKeyword1,Selected_SuggCat1;
			public static String[] SyscoCategory1;
			public static String ItemAdded;
		
		
		
			/* Functions on the Page are defined below */
			
			
			public CategoryPage CustomCategories(String string) throws InterruptedException, IOException
			{
				 
		        	 	waitForElementToBeClickable(FoodAndNonFood);
		        	 	waitForElementToBeClickable(SetUp_Pg3Header);
						waitForElementToBeClickable(CustomCategories);
						
						if(isElementPresent(CustomCategories))
						{
							clickElement(CustomCategories);
							  
							Reporter.log("Custom Category selected from Food cost page :Pass");	
						}
		         
				return this;
				
			}
			
			 public CategoryPage tapContinue(String string) throws InterruptedException, IOException{
				 
			     	waitForElementToBeClickable(Continue);
					clickElement(Continue);
					Reporter.log("Tapped on Continue :Pass");
				
				return this;
			}
			
			
			 public CategoryPage CategoryDetails(String Name, String string) throws InterruptedException, IOException
			 {
			 
			 	  
			       String name=Name;
			      
			 		waitForElementToBeClickable(ExpenseCategory_Page);
			 		waitForElementToBeClickable(ExpenseCategory_Name);
			 		if(isElementPresent(ExpenseCategory_Name))
			 		{
			 			clickElement(ExpenseCategory_Name);
			 			sendText(ExpenseCategory_Name, name);
			 			waitForElementToBeClickable(ExpenseCategory_Food);
			 			clickElement(ExpenseCategory_Food);
			 				
			 		}
			 				Reporter.log("Custom category created  :Pass");	
			 	
			 	return this;
			 	
			 }
			
			@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
			  public CategoryPage TapOnNext(String string) throws InterruptedException, IOException{
			       	
			       			waitForElementToBeClickable(NextWeb);
			       		if (isElementPresent(NextWeb))
			       		{
			       			clickElement(NextWeb);
			       			Reporter.log("Tapped on Next : Pass");
			       		}
			       		
			      
			       	return this;
			
			  public CategoryPage defaultCategories(String string) throws InterruptedException, IOException
				{
					
			        	    waitForElementToBeClickable(FoodAndNonFood);
			        	    waitForElementToBeClickable(SetUp_Pg3Header);
							if(isElementPresent(FoodAndNonFood))
							{
								clickElement(FoodAndNonFood);
								//switchToWebContext();
								
								Reporter.log("default Category selected :Pass");
								
							}
							
			        
					return this;
					
				}
			  
			  
			  
			public CategoryPage tapComplete(String string) throws InterruptedException, IOException{
				  String string2="Issue";
			       String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			     	
			     		waitForElementToBeClickable(Complete);
					clickElement(Complete);
					
					
					Reporter.log("Tapped on Complete :Pass");
				
				
				
				return this;
				
			}       
			  
			public CategoryPage CreateTwoExpenseCategory(String Name1,String Name2,String string) throws InterruptedException, IOException {
			       	Reporter.log("Creating multiple custom category"); 
			       	String finalPath1=Screenshot.drivePath+string+Screenshot.string2+Screenshot.pathExtension;
			       	 
			       
			       		 
			        		waitForElementToBeClickable(ExpenseCategory_Page);
		
			       	waitForElementToBeClickable(ExpenseCategory_NameTxt);
			       	if(isElementPresent(ExpenseCategory_NameTxt))
			       	{ 
			       		
			       		clickElement(ExpenseCategory_NameTxt);
			       		sendText(ExpenseCategory_NameTxt, Name1); 
			  
			       		waitForElementToBeClickable(ExpenseCategory_Food);
			       		clickElement(ExpenseCategory_Food); 

			       		if(isElementPresent(ExpenseCategory_AnotherCategory)) { 
			       			
			       			clickElement(ExpenseCategory_AnotherCategory);
			                    }

			       		if(isElementPresent(ExpenseCategory_Name1)) {
			       			clickElement(ExpenseCategory_Name1);
			       			sendText(ExpenseCategory_Name1, Name2); 
			       			
			       			waitForElementToBeClickable(ExpenseCategory_Food1);
		
			       			clickElement(ExpenseCategory_Food1);
		
			       			}
			       			
			       		waitFor(5);
			       				
			       		
		    		Reporter.log("Custom Categories created:Pass"); 
			       		} 
			       
			    
			       return this;
			       	}  
		
			  
			public CategoryPage CustomCategory_ItemSelectAndCheck(String string) throws InterruptedException, IOException
			   	{
			   		Reporter.log("Verifying added item is in  custom category - Uncategorised and All Items");

			   		 
			          
			   			
			           	  
			           	  waitForElementToBeClickable(Category_Header);
			            	 
			             	CategoryName= getElementText(Category_Header);

			             	
			             		    	waitFor(5);
			             	if(isElementPresent(Category_FirstItemSelect)) {
			             		waitFor(5);
			             		clickElement(Category_FirstItemSelect); 
			             		ItemAdded=getElementText(Category_FirstItemHeader); 
			             		Reporter.log("First item selected"); 
			             		} 
			             	
			   		       waitFor(5);	
			   		       waitForElementToBeClickable(SetupInventoryCustomCategoryAllItemsTab);
			   		       clickElement(SetupInventoryCustomCategoryAllItemsTab);
			   		       waitFor(3);
			   		       final String  FirstItemSelectedFromUncatgorisedVerify="//*[@id='mount']//*[contains(text(),'"+ItemAdded+"')]";
			   		       if (isElementPresent(FirstItemSelectedFromUncatgorisedVerify)) {
			   				Reporter.log(" Added item  is present in All Items Tab  :Pass");
			   				
			   			}
			   		       waitFor(5);	
			   		       waitForElementToBeClickable(SetupInventoryCustomCategoryUncategorizedTab);
			   		       clickElement(SetupInventoryCustomCategoryUncategorizedTab);
			   		     
			   		      		       
			   		       if (isElementPresent(FirstItemSelectedFromUncatgorisedVerify)) {
			   					Reporter.log(" Added item  is present in category Tab(Expected-Item should not be present) :Fail");
			   					throw new Exception();
			   				}
			   		       else if (!(isElementPresent(FirstItemSelectedFromUncatgorisedVerify))) {
			   					Reporter.log(" Added item  is not present in uncategorized Tab :Pass");
			   			}
			   		       
			   		       waitFor(5);	
			   		       
			   		   	}
			   		
			   	
			   		return this;
			   		
			   	}	
			
		}
			
			
			public CategoryPage selectMultipleItemsFromCategory1(String string) throws InterruptedException, IOException {
			   	   	  String string2="Issue";
			   	     String finalPath1=Screenshot.drivePath+string+string2+Screenshot.pathExtension;
			   	      try{
			   	    	Thread.sleep(5000);
			 	      	waitForElementToBeClickable(Category_1stItemSelect);
			 	    	waitForElementToBeClickable(Category_2ndItemSelect);
			 	    	waitForElementToBeClickable(Category_3rdItemSelect);
				 	     
			   	   		if(isElementPresent(Category_1stItemSelect))
			   	   		{
			   	   		CategoryNoOfElements1++;
			   	   	CategoryItemName1_1=getElementText(Category_1stItemHeading);
			   	   			clickElement(Category_1stItemSelect);
			   	   			
			   	   		}
			   	   		if(isElementPresent(Category_2ndItemSelect)){
			   	   			
			   	   		CategoryNoOfElements1++;
			   	   	CategoryItemName1_2=getElementText(Category_2ndItemHeading);
			   	   			clickElement(Category_2ndItemSelect);
			   	   		}
			   	   			
			   	   		if(isElementPresent(Category_3rdItemSelect)){	
			   	   		CategoryNoOfElements1++;
			   	   	CategoryItemName1_3=getElementText(Category_3rdItemHeading);
			   	   			clickElement(Category_3rdItemSelect);
			   	   		}
			   	   			Reporter.log("Multiple items selected :Pass"); 			
			   	   		
			   	   	
			   	   
			   	      return this;
			   	   }
			   	      
			   	      
			   	      
			   	      
			   	      
			   	      
			        
					public CategoryPage selectMultipleItemsFromCategory2(String string) throws InterruptedException, IOException {
			      	   	  
		
			    	      	waitForElementToBeClickable(Category_1stItemSelect);
			    	      	waitForElementToBeClickable(Category_2ndItemSelect);
			    	      	waitForElementToBeClickable(Category_3rdItemSelect);
			    	      	
			      	   		if(isElementPresent(Category_1stItemSelect))
			      	   		{
			      	   		CategoryNoOfElements1++;
			      	   	CategoryItemName2_1=getElementText(Category_1stItemHeading);
			      	   			clickElement(Category_1stItemSelect);
			      	   			
			      	   		}
			      	   		if(isElementPresent(Category_2ndItemSelect)){
			      	   			
			      	   		CategoryNoOfElements1++;
			      	   	CategoryItemName2_2=getElementText(Category_2ndItemHeading);
			      	   			clickElement(Category_2ndItemSelect);
			      	   		}
			      	   			
			      	   		if(isElementPresent(Category_3rdItemSelect)){	
			      	   		CategoryNoOfElements1++;
			      	   	CategoryItemName2_3=getElementText(Category_3rdItemHeading);
			      	   			clickElement(Category_3rdItemSelect);
			      	   		}
			      	   			Reporter.log("Multiple items selected :Pass"); 			
			      	  
			      	      return this;
			      	   }

		
		public CategoryPage AddCategoryName(String categoryName,String string) throws InterruptedException, IOException
		   	{
		   		
		   				clearElement(ADD_CategoryName);
		   			clickElement(ADD_CategoryName);
		   			sendText(ADD_CategoryName,categoryName);
		   		 		Reporter.log("added category name :Pass");
		   		
		   		
		   		return this;
		   		
		   	}
		   @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
		public CategoryPage AddLocationCooler(String string) throws InterruptedException, IOException
		   	{
		  		
	           waitForElementToBeClickable(AddCategory_FoodWeb);
		   		    clickElement(AddCategory_FoodWeb);
		   		
		   			
		   		
		   		return this;
		   		
		   	}
		
		
		@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
		public CategoryPage TapOnDone(String string) throws InterruptedException, IOException{
		    
		    		
		    		
		    		
		    			waitForElementToBeClickable(DoneWeb);
		    		if (isElementPresent(DoneWeb))
		    		{
		    			
		    			clickElement(DoneWeb);
		    			Reporter.log("Tapped on done:Pass");
		    			
		    			
		    		}
		    		
		    
		    	
		    	return this;
		    }
		
		
		
		public CategoryPage SelectCategory(String name,String string) throws InterruptedException, IOException
		{
		   
			
		 waitFor(2);
			final String Locname= "//*[@id='list-item']//*[contains(text(),'"+name+"')]";
			
			  clickElement(Locname); 
		      
			 	Reporter.log("Category is selected for item :Pass");						
		
			return this;
			
		}
		   @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
			public CategoryPage AddCategoryFood(String string) throws InterruptedException, IOException
			   	{
			   		
			  			switchToNativeContext();
			  			waitForElementToBeClickable(AddCategory_Food);
			   		    clickElement(AddCategory_Food);
			   		 switchToWebContext();
			   			 		Reporter.log("Selected food :Pass");
			   		
			   		
			   		return this;
			   		
			   	}
		
		public CategoryPage TapOnBack(String string) throws InterruptedException, IOException{

					
					waitForElementToBeClickable(Back);
					if (isElementPresent(Back))
					{
						
						clickElement(Back);
						Reporter.log("tap on back :Pass");
					}
					
				
				
				return this;
			}
		
		
		
		
		public CategoryPage VerifyCategory(String name,String string) throws InterruptedException, IOException
		{
			
			
		 waitFor(2);
			final String  Locname= "//*[@class='mm-c-product-list__details']//*[contains(text(),'"+name+"')]";    
			waitForElementToBeClickable(Locname);
				Reporter.log("Category is verified for item :Pass");						
		
			return this;
			
		}

		
		public CategoryPage TapAdd(String string) throws InterruptedException, IOException
		{
		
		waitForElementToBeClickable(AddWeb);
		if(isElementPresent(AddWeb))
		{
			clickElement(AddWeb);
			Reporter.log("Navigating to Add categories page :Pass");	
		
		}

		
		return this;
		
		}
		
		
		public  CategoryPage VerifyCategoryList(String categoryAdded,String string) throws InterruptedException, IOException{
	
		
		final String  CatAdded="//*[@id='list-item']//span[contains(text(),'"+categoryAdded+"')]";  
		
		waitForElementToBeClickable(CatAdded);
		if (isElementPresent(CatAdded)) {
			Reporter.log("Added Category is listed :Pass");
		}
		

		
		return this;
		
		
		}
		
		
		public CategoryPage TapOnEdit(String string) throws InterruptedException, IOException{
		
		
			waitForElementToBeClickable(EditWeb);
			if (isElementPresent(EditWeb))
			{
				
				clickElement(EditWeb);
				Reporter.log("tap on edit :Pass");
			}
			
		
		
		return this;
		}
		
		
		public CategoryPage TapOnDeleteCategory(String string) throws InterruptedException, IOException{
		
			
			
			waitFor(5);
			waitForElementToBeClickable(Delete);
			if (isElementPresent(Delete))
			{
				
				clickElement(Delete);
				Reporter.log("tap on Delete :Pass");
			}
			
	
		
		return this;
		}
		
		
		public CategoryPage TapOnYesDelete(String string) throws InterruptedException, IOException{
			  String string2="Issue";
		
				
				waitFor(5);
				waitForElementToBeClickable(YesDelete);
				if (isElementPresent(YesDelete))
				{
					
					clickElement(YesDelete);
					Reporter.log("tap on yes delete :Pass");
				}
		
			return this;
		}

		
		public  CategoryPage VerifyDeletedCategoryList(String categoryAdded,String string) throws InterruptedException, IOException{
	
		
			waitFor(5);
		final String  CatAdded="//*[@id='list-item']//span[contains(text(),'"+categoryAdded+"')]";   
		
		if (isElementPresent(CatAdded)) {
			Reporter.log("Deleted category is there :Fail");
			Assert.assertTrue(false);
		}
		Reporter.log("Deleted category is not listed   :Pass");
		}
		
		
		return this;
		
		
		}  	
		
		
	
		public CategoryPage AssignMultipleItemsToCategory(String string) throws InterruptedException, IOException {
		
		
			waitFor(5);
		waitForElementToBeClickable(Category_1stItemSelect);
		waitForElementToBeClickable(Category_2ndItemSelect);
		waitForElementToBeClickable(Category_NonSyscoItem1Select);
		waitForElementToBeClickable(Category_NonSyscoItem2Select);
		
			if(isElementPresent(Category_1stItemSelect))
			{
			CategoryNoOfElements1++;
			CategoryItemName1_1=getElementText(Category_1stItemHeading);
				clickElement(Category_1stItemSelect);
				
			}
			if(isElementPresent(Category_2ndItemSelect)){
				
			CategoryNoOfElements1++;
		CategoryItemName1_2=getElementText(Category_2ndItemHeading);
				clickElement(Category_2ndItemSelect);
			}
				
			if(isElementPresent(Category_NonSyscoItem1Select)){	
			CategoryNoOfElements1++;
		CategoryItemName1_3=getElementText(Category_3rdItemHeading);
				clickElement(Category_NonSyscoItem1Select);
			}
				
			if(isElementPresent(Category_NonSyscoItem2Select)){	
				CategoryNoOfElements1++;
			CategoryItemName1_4=getElementText(Category_4thItemHeading);
					clickElement(Category_NonSyscoItem2Select);
				}	
				Reporter.log("Multiple items selected :Pass"); 			
	
		return this;
		}

		
		public CategoryPage SuggestedCategories(String string) throws InterruptedException, IOException
		{
			Reporter.log("Selecting suggested category from Food cost page");

			
		    		 waitForElementToBeClickable(FoodAndNonFood);
		    		 waitForElementToBeClickable(SetUp_Pg3Header);
					waitForElementToBeClickable(SuggestedCategories);
					
					if(isElementPresent(SuggestedCategories))
					{
						clickElement(SuggestedCategories);
						 
						Reporter.log("Suggested Category selected :Pass");
						
					}
					
		 
			return this;
			
		}
		
		
		
		public CategoryPage VerifyMultipleListSyscoSuggestedCategory(String string) throws InterruptedException, IOException
		{
			
			 Boolean flag1=false;
			 Boolean flag2=false;
			
			
		try{
			
			
		 waitFor(2);
		 if((LocationsPage.Category1[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category1[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category1[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category1[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category1[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category1[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category1[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category1[0].equalsIgnoreCase("Miscellaneous"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category2[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category2[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category2[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category2[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category2[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category2[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category2[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category2[0].equalsIgnoreCase("Miscellaneous"))){
			  flag2=true;
			  
		}
		 if(!(flag2&&flag1)){ 
			   throw new Exception();
		 } 
		   
			  
				Reporter.log("Category is verified for item :Pass");						
			
			return this;
			
		}
		
	
		
		public CategoryPage VerifyPrepCustomCategory(String customcategory,String string) throws InterruptedException, IOException
		{
			
			 Boolean flag4=false;
		
			
			
		 waitFor(2);
		 if((LocationsPage.Prep_Category1[0].equalsIgnoreCase(customcategory))){
			  flag4=true;
			  
		 }
		 if(!(flag4)){ 
			   throw new Exception();
		 } 
		   
			
				Reporter.log("Category is verified for prep item :Pass");						
			
			return this;
			
		}
		
		public CategoryPage VerifyOGSyscoItemsSuggestedCategoryLocation1(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
	
		 waitFor(2);
			
		 if((LocationsPage.Category3[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category3[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category3[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category3[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category3[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category3[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category3[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category3[0].equalsIgnoreCase("Miscellaneous"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category4[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category4[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category4[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category4[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category4[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category4[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category4[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category4[0].equalsIgnoreCase("Miscellaneous"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category5[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category5[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category5[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category5[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category5[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category5[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category4[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category5[0].equalsIgnoreCase("Miscellaneous"))){
			  flag3=true;
			  
		}

		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
				Reporter.log("Category is verified for item :Pass");						
			
			return this;
			
		}

		
		public CategoryPage VerifyOGSyscoItemsSuggestedCategoryLocation2(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
		
			
			
		 waitFor(2);
		 if((LocationsPage.Category6[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category6[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category6[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category6[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category6[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category6[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category6[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category6[0].equalsIgnoreCase("Miscellaneous"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category7[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category7[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category7[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category7[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category7[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category7[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category7[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category7[0].equalsIgnoreCase("Miscellaneous"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category8[0].equalsIgnoreCase("Meat"))||(LocationsPage.Category8[0].equalsIgnoreCase("Groceries"))||(LocationsPage.Category8[0].equalsIgnoreCase("Dairy"))||(LocationsPage.Category8[0].equalsIgnoreCase("Poultry"))||(LocationsPage.Category8[0].equalsIgnoreCase("Seafood"))||(LocationsPage.Category8[0].equalsIgnoreCase("Produce"))||(LocationsPage.Category8[0].equalsIgnoreCase("Beverage"))||(LocationsPage.Category8[0].equalsIgnoreCase("Miscellaneous"))){
			  flag3=true;
			  
		}
		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
		   
		 
		
				Reporter.log("Category is verified for item :Pass");						
			
			
			return this;
			
		}
		
		public CategoryPage VerifyNonSycoCustomCategory(String customcategory,String string) throws InterruptedException, IOException
		{
			
			 Boolean flag3=false;
		
			
		
		waitFor(2);
		if((LocationsPage.NonSysco_Category1[0].equalsIgnoreCase(customcategory))){
			  flag3=true;
			  
		}
		if(!(flag3)){ 
			   throw new Exception();
		} 
		 
			
				Reporter.log("Category is verified for nonsysco item :Pass");						
		
			return this;
			
		}
		
		
		
		public CategoryPage VerifySuggestedCategory(String string) throws InterruptedException, IOException
		{
			  
			
		  final String Sysco_Product_Select= "(//*[@class='mm-c-product-list']//*[@class='mm-c-product-list__item mm-c-product__sysco ']//*[@class='mm-c-product-list__image'])[1]";
				if(isElementPresent(Sysco_Product_Select)){
					final String CategoryLine1= "(//*[@class='mm-c-product-list']//*[@class='mm-c-product-list__all-prods']//*[@class='mm-c-product-list__details-wrapper']//*[@class='mm-c-product-list__location'])[1]"; 
					String SyscocategoryKeyword1 = getElementText(CategoryLine1);
						SyscoCategory1=SyscocategoryKeyword1.split("\\s+");

		
					
				}
			   
				Reporter.log("Suggested Category is verified for item :Pass");						
			
			return this;
			
		}
		
		public CategoryPage TapAnySuggestedCategory(String string) throws InterruptedException, IOException
		{
			  

			if(SyscoCategory1[0].equalsIgnoreCase("Dairy"))
				{waitForElementToBeClickable(Select_SuggCat_Meat).clickElement(Select_SuggCat_Meat);
				Selected_SuggCat1="Meat";
				}
			else
				{waitForElementToBeClickable(Select_SuggCat_Dairy).clickElement(Select_SuggCat_Dairy);
				Selected_SuggCat1="Dairy";
				}
				Reporter.log("Suggested Category is selected for item :Pass");						
		
			return this;
			
		}
		
		public CategoryPage VerifySelectedSuggestedCategory(String string) throws InterruptedException, IOException
		{
			
			if(SyscoCategory1[0].equalsIgnoreCase(Selected_SuggCat1))
				 throw new Exception();
			else
				System.out.println("Suggested Category is changed for item :Pass");
				Reporter.log("Suggested Category is changed for item :Pass");	
			
			
		
			return this;
			
		}
		
		public CategoryPage VerifySuggestedCategoryList(String string) throws InterruptedException, IOException
		{
			
			boolean flag2_1 = isElementPresentAfterWait(SuggestedCategory_Dairy, 3);
			boolean flag2_2 = isElementPresentAfterWait(SuggestedCategory_Meat, 3);
			boolean flag2_3 = isElementPresentAfterWait(SuggestedCategory_Poultry, 3);
			boolean flag2_4 = isElementPresentAfterWait(SuggestedCategory_Seafood, 3);
			boolean flag2_5 = isElementPresentAfterWait(SuggestedCategory_Produce, 3);
			boolean flag2_6 = isElementPresentAfterWait(SuggestedCategory_Groceries, 3);
			boolean flag2_7 = isElementPresentAfterWait(SuggestedCategory_Beverage, 3);
			boolean flag2_8 = isElementPresentAfterWait(SuggestedCategory_Miscellaneous, 3);
			if((flag2_1 && flag2_2 && flag2_3 && flag2_4 && flag2_5 && flag2_6 && flag2_7 && flag2_8)){ 
				Reporter.log("Suggested category list verification done :Pass");
			}    			     
			
			else {
				throw new Exception();
				}
			
			return this;
			
		}
		
		
		public CategoryPage VerifyCustomListItemsDefaultCategoryLocation1(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
		
			
		 waitFor(2);
			
		 if((LocationsPage.Category3[0].equalsIgnoreCase("Food"))||(LocationsPage.Category3[0].equalsIgnoreCase("Non-Food"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category4[0].equalsIgnoreCase("Food"))||(LocationsPage.Category4[0].equalsIgnoreCase("Non-Food"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category5[0].equalsIgnoreCase("Food"))||(LocationsPage.Category5[0].equalsIgnoreCase("Non-Food"))){
			  flag3=true;
			  
		}

		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
		   
		 
		 
			return this;
			
		}
		
		public CategoryPage VerifyCustomListItemsDefaultCategoryLocation2(String string) throws InterruptedException, IOException
		{
			Boolean flag3=false;
			 Boolean flag1=false;
			 Boolean flag2=false;
		
		 
			
		 waitFor(2);

		 if((LocationsPage.Category6[0].equalsIgnoreCase("Food"))||(LocationsPage.Category6[0].equalsIgnoreCase("Non-Food"))){
			  flag1=true;
			  
		 }
		 if((LocationsPage.Category7[0].equalsIgnoreCase("Food"))||(LocationsPage.Category7[0].equalsIgnoreCase("Non-Food"))){
			  flag2=true;
			  
		}
		 if((LocationsPage.Category8[0].equalsIgnoreCase("Food"))||(LocationsPage.Category8[0].equalsIgnoreCase("Non-Food"))){
			  flag3=true;
			  
		}
		 if(!(flag2&&flag1&&flag3)){ 
			   throw new Exception();
		 } 
		   
		 
				Reporter.log("Default Category is verified for items :Pass");						
			}
			
			
			
			return this;
			
		}
		
		
		public CategoryPage VerifyDefaultCategoryList(String string) throws InterruptedException, IOException
		{
		
		
			boolean flag2_1 = isElementPresentAfterWait(DefaultCategory_Food, 3);
			boolean flag2_2 = isElementPresentAfterWait(DefaultCategory_NonFood, 3);
			if((flag2_1 && flag2_2)){ 
				Reporter.log("Default category list verification done :Pass");
			}    			     
			
			else {
				throw new Exception();
				}
			
			
			
			return this;
			
		}
		
		
		
		public CategoryPage VerifyItemPresentUncategorizedAndAllItems(String string) throws InterruptedException, IOException
		{
		
		waitFor(5);	
		waitForElementToBeClickable(SetupInventoryCustomCategoryAllItemsTab);
		clickElement(SetupInventoryCustomCategoryAllItemsTab);
		waitFor(3);
		final String  ItemSelectedFromUncatgorisedVerify= "//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_1+"')]";
		final String  ItemSelectedFromUncatgorisedVerify1= "//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_2+"')]";
		final String  ItemSelectedFromUncatgorisedVerify2= "//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_3+"')]";
		final String  ItemSelectedFromUncatgorisedVerify3="//*[@id='mount']//*[contains(text(),'"+CategoryItemName1_4+"')]";
		
		if (isElementPresent(ItemSelectedFromUncatgorisedVerify)) {
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify1);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify2);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify3);
		Reporter.log(" Added item  is present in All Items Tab  :Pass");
		
		}
		waitFor(5);	
		waitForElementToBeClickable(SetupInventoryCustomCategoryUncategorizedTab);
		clickElement(SetupInventoryCustomCategoryUncategorizedTab);
		
				       
		if (isElementPresent(ItemSelectedFromUncatgorisedVerify)) {
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify1);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify2);
			waitForElementToBeClickable(ItemSelectedFromUncatgorisedVerify3);
			Reporter.log(" Added item  is present in category Tab(Expected-Item should not be present) :Fail");
			throw new Exception();
		}
		else if ( !(  (isElementPresent(ItemSelectedFromUncatgorisedVerify))&& (isElementPresent(ItemSelectedFromUncatgorisedVerify1))&&
				( isElementPresent(ItemSelectedFromUncatgorisedVerify2))&&(isElementPresent(ItemSelectedFromUncatgorisedVerify3) )))  {
			Reporter.log(" Added item  is not present in uncategorized Tab :Pass");
		}
		
		waitFor(5);	
		
		
	
		return this;
		
		}

		
		public CategoryPage VerifyOptionsOnSetUpFoodCost(String string) throws InterruptedException, IOException{
		
		waitForElementToBeClickable(SetUp_Pg3Title);
			if(isElementPresent(FoodAndNonFood) && isElementPresent(FoodAndNonFoodDesc) && isElementPresent(SuggestedCategories) && isElementPresent(SuggestedCategoriesDesc) && isElementPresent(CustomCategories) && isElementPresent(CustomCategoriesDesc))
			{
				Reporter.log("VerifyOptionsOnSetUpFoodCost:Pass");
			}
			else
			{
				Reporter.log("VerifyOptionsOnSetUpFoodCost:Fail");
				throw new Exception();
			}
			
		
	
		
		return this;
		
		}
		
		public CategoryPage AddCategoryNonFood(String string) throws InterruptedException, IOException
			{
				
					
						switchToNativeContext();
		
							waitForElementToBeClickable(AddCategory_NonFood);
				    clickElement(AddCategory_NonFood);
				    switchToWebContext();
					 		Reporter.log("Selected Non Food :Pass");
					
			
				return this;
			}
		
		
		public CategoryPage VerifyCustomListItemsCustomCategoryLocation1(String category, String string) throws InterruptedException, IOException {
			Boolean flag3 = false;
			Boolean flag1 = false;
			Boolean flag2 = false;
	
		
				waitFor(2);
				if ((LocationsPage.Category3[0].equalsIgnoreCase(category))) {
					flag1 = true;
		
				}
				if ((LocationsPage.Category4[0].equalsIgnoreCase(category))) {
					flag2 = true;
		
				}
				if ((LocationsPage.Category5[0].equalsIgnoreCase(category))) {
					flag3 = true;
		
				}
		
				if (!(flag2 && flag1 && flag3)) {
					throw new Exception();
				}
		
				Reporter.log("Custom Category is verified for items in location1 :Pass");
		
		
			
			return this;
		
		}
		
		
		public CategoryPage VerifyCustomListItemsCustomCategoryLocation2(String category, String string) throws InterruptedException, IOException {
			Boolean flag3 = false;
			Boolean flag1 = false;
			Boolean flag2 = false;
		
		
				waitFor(2);
		
				if ((LocationsPage.Category6[0].equalsIgnoreCase(category))) {
					flag1 = true;
		
				}
				if ((LocationsPage.Category7[0].equalsIgnoreCase(category))) {
					flag2 = true;
		
				}
				if ((LocationsPage.Category8[0].equalsIgnoreCase(category))) {
					flag3 = true;
		
				}
				if (!(flag2 && flag1 && flag3)) {
					throw new Exception();
				}
		
				Reporter.log("Custom Category is verified for items in location2 :Pass");
			}
		
			
			return this;
		
		}
		
	
		public CategoryPage VerifyOptionsOnCreateExpenseCategory(String string) throws InterruptedException, IOException {

			

				waitForElementToBeClickable(CreateExpenseCategoryHeader);
				if (isElementPresent(CreateExpenseCategoryHeader) && isElementPresent(SetUp_Pg3Header)
						&& isElementPresent(CreateExpenseCategoryDesc1)
						&& isElementPresent(CreateExpenseCategoryDesc2)) {
					
					Reporter.log("Verify Options On Create custom category page:Pass");

				} else {

					Reporter.log("Verify Options On Create custom category page:Fail");
					throw new Exception();
				}
				Reporter.log("Create custom Category page verification done :Pass");
		

			return this;

		}


		}
