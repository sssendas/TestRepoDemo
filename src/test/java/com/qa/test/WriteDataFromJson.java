package com.qa.test;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.json.simple.JSONObject;

public class WriteDataFromJson {

	public static void main(String[] args) throws Exception {
		
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd-HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		String currentTime = dtf.format(now);
		FileWriter fr = new FileWriter("src/test/resources/files/json_files/Result_"+currentTime+".json", false);*/
		
		//creating a json object
		
		JSONObject jObj = new JSONObject();
		
		//creating key value pairs
		
		jObj.put("Employee_Id", 101);
		jObj.put("firstName", "Sourav");
		jObj.put("lastName", "Das");
		jObj.put("Country", "US");
		
		FileWriter fr = new FileWriter("src/test/resources/files/json_files/Result.json", true);
		
		fr.write(jObj.toJSONString());
		fr.close();
		
		System.out.println("File successfuly created");
	}

}
