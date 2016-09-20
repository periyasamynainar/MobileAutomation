package com.framework.dataread;
import java.io.File;
import java.io.IOException;


import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Excel {

	 private String inputFile;
	
	 public static String[][]  data1 = null;
	 
	   public void setInputFile(String inputFile) 
	    {
		  // System.out.println("inside method 1");
		  // System.out.println(inputFile);
	        this.inputFile = inputFile;
	    }
	   public String[][] getMethodData(String[][] OrginalList,String methodName)
	   {
		  String[][] methodDataTemp= null;
		   String[][] methodData= null;
		    int counter=0;	     
	       		System.out.println("Inside getMethodData");
	        	int orRows = OrginalList.length;
	        	int orCol =0;
	        	if(orRows!= 0)
	        	{
	        		orCol = OrginalList[0].length;
	        	}
	        	if(orRows !=0 && orCol!=0)
	        	{
	        		methodDataTemp=new String[orRows][orCol];
	        		for(int i = 0;i<orRows;i++)
	        		{
	        			String testCaseName = OrginalList[i][0];
	        			if(testCaseName.equalsIgnoreCase(methodName))
	        			{
	        				counter=counter+1;
	        			}
	        			for (int j = 0; j <orCol; j++) 
		                {	              
		            		if(testCaseName.equalsIgnoreCase(methodName))
		            		{
		            			methodDataTemp[i][j]=OrginalList[i][j];		                   
		            		}
		            		else
		            		{
		            			methodDataTemp[i][j] = "No Value";
		            		}
		                  
		                }    
	        		}
	        	}      
	          
	        	methodData=new String[counter][orCol];
	            int jCounter=0;
	            for (int iCounter = 0; iCounter<orRows; iCounter++) 
	            {
	            	String strCheck = methodDataTemp[iCounter][0];
	            	//System.out.println("sssssss"+data[iCounter][0]);
	            	if(!(strCheck.equalsIgnoreCase("No Value"))){
	            		//System.out.println("inside if");
	            		//for(int jCounter=0;jCounter<counter;jCounter++){
	            		if(jCounter<counter){
	            			for(int kCounter=0;kCounter<orCol;kCounter++)
	            			{
	            				methodData[jCounter][kCounter]=methodDataTemp[iCounter][kCounter];
	            				//System.out.print(methodData[jCounter][kCounter]+" ");
	            				
	            			}
	            			jCounter=jCounter+1;
	            		}
	            	}
	            
	           // System.out.println(methodData.length+"length of data1 array");      
	            }
		   return methodData;
	   }
	   
	   public String[][] read(String inputFile,String sheetName)
	    {
		   String[][]  data = null;
		    int counter=0;		   
		//	String[][]  data = null;
	        File inputWorkbook = new File(inputFile);	        
	        Workbook w;		
	        try 
	        {
	        	System.out.println("inside Excel Read");
	        	try{
	            w = Workbook.getWorkbook(inputWorkbook);
	        	
	           // System.out.println(inputFile);
	          //  System.out.println(w.getNumberOfSheets());
	            // Get the first sheet
	            Sheet sheet = w.getSheet(sheetName);
	            data = new String[sheet.getRows()][sheet.getColumns()];      
	            for (int j = 0; j <sheet.getRows(); j++) 	            	
	            {
	            	for (int i = 0; i < sheet.getColumns(); i++) 
		                {	              
		            		
		                    Cell cell = sheet.getCell(i,j);
		                  //  System.out.print(cell.getContents()+" ");
		                    data[j][i] = cell.getContents();            
		            		
		                  
		                }           	   		
	                
	            	// System.out.println("");	            	
	            }
	           
	            
	           w.close();
	          
	        	}
	        	catch(IOException e)
	        	{
	        		 e.printStackTrace();
	 	            System.out.println(e.getMessage());
	        	}
	        } 
	        catch (BiffException e) 
	        {
	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	    return data;
	        }
	        
	    }  
	   
	   
	 /*  public static String[][] readttt(String inputFile,String sheetName,String methodName) throws IOException  
	    {
		    int counter=0;
	        File inputWorkbook = new File(inputFile);
	        Workbook w;
	        try 
	        {
	        	System.out.println("inside try");
	            w = Workbook.getWorkbook(inputWorkbook);
	            System.out.println(inputFile);
	            System.out.println(w.getNumberOfSheets());
	            // Get the first sheet
	            Sheet sheet = w.getSheet(sheetName);
	            data = new String[sheet.getRows()][sheet.getColumns()];      
	            for (int j = 0; j <sheet.getRows(); j++) 	            	
	            {
	            	Cell testCaseName = sheet.getCell(0,j);
	            	//{
	            	if(testCaseName.getContents().equalsIgnoreCase(methodName))
           		{
	            		counter=counter+1;
           		}
		            	for (int i = 0; i < sheet.getColumns(); i++) 
		                {	              
		            		if(testCaseName.getContents().equalsIgnoreCase(methodName))
		            		{
		                    Cell cell = sheet.getCell(i,j);
		                    System.out.print(cell.getContents()+" ");
		                    data[j][i] = cell.getContents();
		                    //
		            		}
		            		else
		            		{
		            			 data[j][i] = "No Value";
		            		}
		                  
		                }           	   		
	                
	            	 System.out.println("");	            	
	            }
	            System.out.println("****************************************");
	            System.out.println("counter "+counter);
	            System.out.println("sheet.getColumns() "+sheet.getColumns());
	            data1=new String[counter][sheet.getColumns()];
	            int jCounter=0;
	            for (int iCounter = 0; iCounter<sheet.getRows(); iCounter++) 
	            {
	            	String strCheck = data[iCounter][0];
	            	System.out.println("sssssss"+data[iCounter][0]);
	            	if(!(strCheck.equalsIgnoreCase("No Value"))){
	            		//System.out.println("inside if");
	            		//for(int jCounter=0;jCounter<counter;jCounter++){
	            		if(jCounter<counter){
	            			for(int kCounter=0;kCounter<sheet.getColumns();kCounter++)
	            			{
	            				data1[jCounter][kCounter]=data[iCounter][kCounter];
	            				System.out.print(data1[jCounter][kCounter]+" ");
	            				
	            			}
	            			jCounter=jCounter+1;
	            		}
	            	}
	            }
	            System.out.println(data1.length+"length of data1 array");
	            
	           w.close();
	        } 
	        catch (BiffException e) 
	        {
	            e.printStackTrace();
	        }
	    return data1;
	    }  */
	    
	

