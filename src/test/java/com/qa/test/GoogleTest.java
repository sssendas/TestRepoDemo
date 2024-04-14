package com.qa.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("wiki");
		try {
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			
		}
		
		List<WebElement> webEleList = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']"));
		
		System.out.println("Number of suggestions found: "+webEleList.size());
		
		for(int i = 0;i<webEleList.size();i++)
		{
			System.out.println("Available suggestions are: "+webEleList.get(i).getText());
			
		}
		
		for(int i = 0;i<webEleList.size();i++)
		{
			if (webEleList.get(i).getText().contains("WikiLeaks"))
			{
				webEleList.get(i).click();
				break;
			}
		}
		
		
		
		//List<WebElement> webEleList1 = driver.findElements(By.xpath("//ul[@role='listbox']/descendant::li[@data-entityname='wiki<b>pedia</b>']"));
		//System.out.println("Number of suggestions found: "+webEleList1.size());
		
		//driver.findElement(By.xpath("//ul[@role='listbox']/descendant::li[@data-entityname='wiki<b>pedia</b>']")).click();
		
		//driver.findElement(By.xpath("//ul[@role='listbox']/decendant::li[@data-entityname='wiki<b>how</b>']"));
		//driver.findElement(By.xpath("//input[@role='button' and @type='submit' and @value='Google Search']")).click();
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
