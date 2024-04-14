package com.test.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
	
	public static String TEST_DATASHEET_PATH = "src/test/resources/files/TestData.xlsx";

	static Workbook book;
	static Sheet sheet;
	static FileInputStream fis;
	
	public static Object[][] getDataFromExcel(String sheetName)
	{
		
		File f = new File(TEST_DATASHEET_PATH);
		
		try
		{
			fis = new FileInputStream(f);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			book  = WorkbookFactory.create(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i = 0; i<sheet.getLastRowNum();i++ )
		{
			for (int j = 0; j<sheet.getRow(0).getLastCellNum();j++ )
			{
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
		
	}
	
	public void writeExcelData()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd-HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		String currentTime = dtf.format(now);
		FileOutputStream fos;
		FileInputStream fis;
		Workbook newBook;
		
		
		
		String fileLocation = "src/test/resources/files/Result_"+currentTime+".xlsx";
		
		try
		{
			fos = new FileOutputStream(fileLocation);
			fos.close();
			System.out.println("New File generated successfully at "+fileLocation);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Couldn't generate file");
		}
		
		try
		{
			fis = new FileInputStream(fileLocation);
			newBook = WorkbookFactory.create(fis);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
