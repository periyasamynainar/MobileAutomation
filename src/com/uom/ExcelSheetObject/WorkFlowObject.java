package com.uom.ExcelSheetObject;

public class WorkFlowObject {

	public String strScriptName;
	public String strCatalogType;
	public String strItemId1;
	public String strSize1;
	public String strColor1;
	public String strQuantity1;
	
	
	
	public WorkFlowObject[][] getTestData(String[][] MethodArray){
		
		WorkFlowObject sheetObjArray[][] =new WorkFlowObject[MethodArray.length][1];
		
		for(int i= 0;i<MethodArray.length;i++)
		{
			WorkFlowObject sheetObj = new WorkFlowObject();
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
	

