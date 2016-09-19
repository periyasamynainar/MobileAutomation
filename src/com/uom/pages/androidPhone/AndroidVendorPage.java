package com.androidComponents.pages;

import java.util.logging.Logger;

import com.commonFunction.FunctionLibrary;
import com.components.pages.VendorPage;
import com.framework.utilities.FrameworkReporter;

public class AndroidVendorPage extends VendorPage {
	
	private static final Logger LOGGER= Logger.getLogger(AndroidVendorPage.class.getCanonicalName());
	
	//Supplier Details page
	public static final String[] lbl_SupplierDetailsName={"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[1]",XPATH};
	public static final String[] lbl_SupplierDetailsPhoneNumber={"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[2]",XPATH};
	public static final String[] lbl_SupplierDetailsAddress={"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[3]",XPATH};
	public static final String[] lbl_SupplierDetailsContactInfo={"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[4]",XPATH};
	public static final String[] lbl_SupplierDetailsEmail={"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[5]",XPATH};
	public static final String[] lbl_SupplierDetailsNote={"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[4]/android.widget.EditText[6]",XPATH};
	
}
