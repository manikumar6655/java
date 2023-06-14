package com.Light.utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.DataProvider;

import bsh.ParseException;

public class JsonReader {





	//	JSONParser jsonParser = new JSONParser();
	//
	//	int i = 0;
	//
	//
	//	@DataProvider(name = "jsondata")
	//
	//	public Object[][] getData(Method m) throws IOException, ParseException {
	//
	//		String JSON_path = m.getName();
	//
	//		JSONArray Array = (JSONArray) jsonParser.parse(new FileReader("C:\\JavaEclipse\\SunLight.FrameWork\\file.json"));
	//
	//		Object[][] data = new Object[Array.size()][1];
	//
	//		for (Map<String,String> Map : (List<Map<String,String>>) Array) {
	//
	//			data[i][0]=Map;
	//
	//			i++;
	//
	//		}
	//
	//		return data;
	//
	//
	//
	//	}
	//	@DataProvider(name="FlipkartLogin")
	//	public static Object[][] getJSONdata(int JSON_attributes) throws FileNotFoundException, IOException, ParseException
	//	{
	//		/**		
	//		 * JSON_attributes => like Column in Excel, total column hence total attributes need to provide
	//		 * this is using json simple jar file
	//		 */
	//
	//		Object obj = new JSONParser().parse(new FileReader("C:\\JavaEclipse\\Light.FrameWork\\src\\test\\resources\\File.json"));
	//		JSONObject jo = (JSONObject)obj;
	//		JSONArray js = (JSONArray)jo.get("Flipkart Login");
	//
	//		Object [][] arr = new String[js.size()][JSON_attributes]; 
	//
	//		for (int i = 0; i < js.size(); i++) 
	//		{ 
	//			JSONObject obj1 = (JSONObject)js.get(i);
	//			arr[i][0] = String.valueOf(obj1.get("PHONE"));
	//			
	//		}	
	//		return arr;
	//	}
	
	@DataProvider(name="FlipkartLogin")
	public static Object  getJSONdata() throws IOException, org.json.simple.parser.ParseException
	{

		JSONParser json=new JSONParser();
		FileReader file=new FileReader("C:\\JavaEclipse\\Light.FrameWork\\src\\test\\resources\\File.json");
		Object obj=json.parse(file);
		JSONObject logobj=(JSONObject)obj;
		JSONArray login=(JSONArray)logobj.get("Flipkart Login");
		String ar[]=new String[login.size()];

		for(int i=0;i<login.size();i++)
		{
			JSONObject usr=(JSONObject)login.get(i);
			String user= (String)usr.get("PHONE");
			ar[i]=user;
			System.out.println(ar[i]);
		}
		return ar;
	}
}

