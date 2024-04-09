package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaDemo5 {
	
	@Test
	public void sum()
	{
		int a = 20;
		int b = 10;
		
		Assert.assertEquals(30,(a+b));
		
		System.out.println("JavaDemo4 Sum ran successfully with result: "+(a+b));
	}
	
	@Test
	public void sub()
	{
		int a = 20;
		int b = 10;
		
		Assert.assertEquals(10,(a-b));
		
		System.out.println("JavaDemo4 Sub ran successfully with result: "+(a-b));
	}
	
	@Test
	public void multiplier()
	{
		int a = 20;
		int b = 10;
		
		Assert.assertEquals(200,(a*b));
		
		System.out.println("JavaDemo4 Multipler ran successfully with result: "+(a*b));
	}
	
	@Test
	public void div()
	{
		int a = 20;
		int b = 10;
		
		Assert.assertEquals(2,(a/b));
		
		System.out.println("JavaDemo4 Div ran successfully with result: "+(a/b));
	}
	
	

}
