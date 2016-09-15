package com.framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	
public	static Set<Entry<Object, Object>> obj ;
public static	Map<Object, Object> mapObject = new HashMap<>();
	
	static{
	
	File file = new File("test.properties");	
	Properties prop = new Properties();
	
	try {
		prop.load(new FileInputStream(file));
		
		obj = prop.entrySet();
		
		for(Entry<Object, Object> en: obj){
			System.out.println(en.getKey()+" ="+ " "+ en.getValue() );
			
			mapObject.put(en.getKey(), en.getValue());		
			
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	static String getProperty(String str){
	
	return mapObject.get(str).toString();
	
}


}