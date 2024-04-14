package com.qa.test;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadDataFromJson {

	public static void main(String[] args) throws Exception {
		
		JSONParser jsonP = new JSONParser();
		
		FileReader fr = new FileReader("src/test/resources/files/json_files/videoDemo.json");
		Object obj = jsonP.parse(fr);
		
		JSONObject empJson = (JSONObject)obj;
		
		String fName = empJson.get("firstName").toString();
		String lName = empJson.get("lastName").toString();
		
		System.out.println("First Name is "+fName);
		
		System.out.println("First Name is "+lName);
		//System.out.println("Last Name is "+empJson.get("lastName"));
		
		JSONArray jArray = (JSONArray)empJson.get("address");
		
		ArrayList <JSONObject> al = new ArrayList<JSONObject>();
		
		for(int i=0;i<jArray.size();i++)
		{
			JSONObject addressObject = (JSONObject) jArray.get(i);
			al.add(addressObject);
			
			System.out.println("Address of "+(i+1));
			System.out.println("Street name is :"+addressObject.get("street"));
			System.out.println("City name is :"+addressObject.get("city"));
			System.out.println("State name is :"+addressObject.get("state"));
		}
	}

}
