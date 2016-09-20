package com.uom.pages.iOSPhone;

import java.util.logging.Logger;

import com.uom.pages.common.VendorPage;

public class IOSVendorPage extends VendorPage {

	private static final Logger LOGGER= Logger.getLogger(IOSVendorPage.class.getCanonicalName());
	
	//Supplier Details page
	public static final String[] lbl_SupplierDetailsName={"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]",XPATH};
	public static final String[] lbl_SupplierDetailsPhoneNumber={"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[2]",XPATH};
	public static final String[] lbl_SupplierDetailsAddress={"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[3]",XPATH};
	public static final String[] lbl_SupplierDetailsContactInfo={"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[4]",XPATH};
	public static final String[] lbl_SupplierDetailsEmail={"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[5]",XPATH};
	public static final String[] lbl_SupplierDetailsNote={"//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[6]",XPATH};


}
