package com.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	//Pre-condition annotations starting with -- @Before
	@BeforeSuite
	public void setUpProperties()
	{
		System.out.println("Setting up system properties for Chrome -- @BeforeSuite");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Chrome browser Launcehed -- @BeforeClass");
	}
	
	@BeforeClass
	public void enterURL()
	{
		System.out.println("URL Entered -- @BeforeMethod");
	}
	
	@BeforeMethod
	public void tryLogin()
	{
		System.out.println("Logegd in Successfully -- @BeforeTest");
	}
	
	//Test cases starting with -- @Test
	@Test
	public void googleTitle()
	{
		System.out.println("Testing Google page Title -- @Test");
	}
	
	@Test
	public void facebookTitle()
	{
		System.out.println("Testing facebookTitle page Title -- @Test");
	}
	
	@Test
	public void xTitle()
	{
		System.out.println("Testing xTitle page Title -- @Test");
	}
	
	@Test
	public void flipkartTitle()
	{
		System.out.println("Testing flipkartTitle page Title -- @Test");
	}
	
	//Post-condition annotations starting with -- @After
	@AfterMethod
	public void tryLogout()
	{
		System.out.println("Logegd out Successfully -- @AfterTest");
	}
	
	@AfterClass
	public void clearCache()
	{
		System.out.println("Cache cleared Successfully -- @AfterMethod");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Browser closed Successfully -- @AfterClass");
	}
	
	@AfterSuite
	public void generateReport()
	{
		System.out.println("Report generated Successfully -- @AfterSuite");
	}
	

}
