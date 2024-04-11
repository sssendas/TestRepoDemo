package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	}
	
	@Test
	public void getTitleTest()
	{
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		System.out.println("The page title is: "+driver.getTitle());
		
		try {
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			
		}
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("wikipedia");
		try {
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			
		}
		driver.findElement(By.xpath("//input[@role='button' and @type='submit' and @value='Google Search']")).click();
	}
	
	@AfterMethod
	public void tearDown()
	{
		try {
			Thread.sleep(5000);
		}
		catch (Exception e)
		{
			
		}
		
		driver.quit();
		
	}

}
