package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class TestNGDataProviderDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\DEV\\CJP\\Practice-2024\\EclipseWorkspace\\Git-CodePull\\Project-1\\TestRepoDemo\\src\\test\\resources\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("The page open with title is: "+driver.getTitle());
	}
	
	@Test (dataProvider = "dp")
	public void faceBookLogin(String email, String password)
	{
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		
		
		//Enter data
		WebElement emailEntry = driver.findElement(By.xpath("//input[@name='email' and @placeholder='Email address or phone number']"));
		WebElement passEntry = driver.findElement(By.xpath("//input[@name='pass' and @placeholder='Password']"));
		
		wait.until(ExpectedConditions.visibilityOf(emailEntry));
		wait.until(ExpectedConditions.visibilityOf(passEntry));
		
		emailEntry.clear();
		emailEntry.sendKeys(email);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		passEntry.clear();
		passEntry.sendKeys(password);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	@Test (dataProvider = "dp1")
	public void faceBookLogin1(String email, String password)
	{
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		
		
		//Enter data
		WebElement emailEntry = driver.findElement(By.xpath("//input[@name='email' and @placeholder='Email address or phone number']"));
		WebElement passEntry = driver.findElement(By.xpath("//input[@name='pass' and @placeholder='Password']"));
		
		wait.until(ExpectedConditions.visibilityOf(emailEntry));
		wait.until(ExpectedConditions.visibilityOf(passEntry));
		
		emailEntry.clear();
		emailEntry.sendKeys(email);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		passEntry.clear();
		passEntry.sendKeys(password);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test (dataProvider = "dp")
	public void faceBookLogin2(String email, String password)
	{
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		
		
		//Enter data
		WebElement emailEntry = driver.findElement(By.xpath("//input[@name='email' and @placeholder='Email address or phone number']"));
		WebElement passEntry = driver.findElement(By.xpath("//input[@name='pass' and @placeholder='Password']"));
		
		wait.until(ExpectedConditions.visibilityOf(emailEntry));
		wait.until(ExpectedConditions.visibilityOf(passEntry));
		
		emailEntry.clear();
		emailEntry.sendKeys(email);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		passEntry.clear();
		passEntry.sendKeys(password);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test (dataProvider = "dp")
	public void faceBookLogin3(String email, String password)
	{
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		
		
		//Enter data
		WebElement emailEntry = driver.findElement(By.xpath("//input[@name='email' and @placeholder='Email address or phone number']"));
		WebElement passEntry = driver.findElement(By.xpath("//input[@name='pass' and @placeholder='Password']"));
		
		wait.until(ExpectedConditions.visibilityOf(emailEntry));
		wait.until(ExpectedConditions.visibilityOf(passEntry));
		
		emailEntry.clear();
		emailEntry.sendKeys(email);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		passEntry.clear();
		passEntry.sendKeys(password);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@Test (dataProvider = "getTestData")
	public void faceBookLogin4(String email, String password)
	{
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		
		
		//Enter data
		WebElement emailEntry = driver.findElement(By.xpath("//input[@name='email' and @placeholder='Email address or phone number']"));
		WebElement passEntry = driver.findElement(By.xpath("//input[@name='pass' and @placeholder='Password']"));
		
		wait.until(ExpectedConditions.visibilityOf(emailEntry));
		wait.until(ExpectedConditions.visibilityOf(passEntry));
		
		emailEntry.clear();
		emailEntry.sendKeys(email);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		passEntry.clear();
		passEntry.sendKeys(password);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			
		}
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@DataProvider(name = "dp")
	public Object[][] getTestData()
	{
		String sheetName = "LoginCreds";
		Object[][] data = TestUtil.getDataFromExcel(sheetName);
		return data;
		
	}
	
	@DataProvider(name = "dp1")
	public Object[][] getTestData1()
	{
		String sheetName = "LoginCreds";
		Object[][] data = TestUtil.getDataFromExcel(sheetName);
		return data;
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
		driver.quit();
	}
	
	
	

}
