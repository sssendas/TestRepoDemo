package com.qa.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestNewCode {
	public void writeExcelData()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd-HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		String currentTime = dtf.format(now);
		FileOutputStream fos;
		FileInputStream fis;
		
		
		
		
		String fileLocation = "src/test/resources/files/Result_"+currentTime+".xlsx";
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("TestSheet");
		XSSFRow rw;
		Cell cl;
		
		Map<String, Object[]> studentData = new TreeMap<String, Object[]>(); 

			studentData.put("1", new Object[] { "Roll No", "NAME", "Year" }); 

			studentData.put("2", new Object[] { "128", "Aditya","2nd year" }); 
			studentData.put("3", new Object[] { "129", "Narayana", "2nd year" }); 
			studentData.put("4", new Object[] { "130", "Mohan", "2nd year" }); 
			studentData.put("5", new Object[] { "131", "Radha", "2nd year" }); 
			studentData.put("6", new Object[] { "132", "Raj", "2nd year" });
			
			Set<String> keyid = studentData.keySet(); 
			
			int rowid = 0;
			
			for (String key: keyid)
			{
				rw = sh.createRow(rowid++);
				Object[] objectArr = studentData.get(key);
				int cellid = 0;
				
				for (Object obj: objectArr)
				{
					cl = rw.createCell(cellid++);
					cl.setCellValue(obj.toString());
					System.out.println(obj.toString());
				}
			}
			
		try
		{
			
			fos = new FileOutputStream(fileLocation);
			wb.write(fos);
			System.out.println("Excel write was successful");
			fos.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Couldn't write in excel file");
		}
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		TestNewCode tnc = new TestNewCode();
		tnc.writeExcelData();
	}

}
