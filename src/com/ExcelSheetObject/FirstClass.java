package com.ExcelSheetObject;

public class FirstClass {

	public String strScriptName;
	public String strCatalogType;
	public String strItemId1;
	public String strSize1;
	public String strColor1;
	public String strQuantity1;
	
	
	
	public FirstClass[][] getTestData(String[][] MethodArray){
		
		FirstClass sheetObjArray[][] =new FirstClass[MethodArray.length][1];
		
		for(int i= 0;i<MethodArray.length;i++)
		{
			FirstClass sheetObj = new FirstClass();
			int j=0;
			sheetObj.strScriptName= MethodArray[i][j++];
			sheetObj.strCatalogType= MethodArray[i][j++];
			sheetObj.strItemId1= MethodArray[i][j++];
			sheetObj.strSize1= MethodArray[i][j++];
			sheetObj.strColor1= MethodArray[i][j++];
			sheetObj.strQuantity1= MethodArray[i][j++];
			sheetObjArray[i][0]= sheetObj;	
		}
		return sheetObjArray;
		}
		
	}
	

