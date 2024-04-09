package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaDemo3 {
	
	@Test
	public void sum()
	{
		int a = 20;
		int b = 10;
		
		Assert.assertEquals(30,(a+b));
		
		System.out.println("JavaDemo3 Sum ran successfully with result: "+(a+b));
	}
	
	@Test
	public void sub()
	{
		int a = 20;
		int b = 10;
		
		int c = 40;
		
		Assert.assertEquals(10,(a-b));
		
		Assert.assertEquals(-20,(a-c));
		
		System.out.println("JavaDemo3 Sub ran successfully with result: "+(a-b));
		System.out.println("JavaDemo3 Sub ran successfully with new result: "+(a-c));
	}
	
	@Test
	public void multiplier()
	{
		int a = 20;
		int b = 10;
		
		int c = 40;
		
		Assert.assertEquals(200,(a*b));
		
		Assert.assertEquals(800,(a*c));
		
		System.out.println("JavaDemo3 Multipler ran successfully with result: "+(a*b));
		System.out.println("JavaDemo3 Multipler ran successfully with new result: "+(a*c));
	}
	
	@Test
	public void div()
	{
		int a = 20;
		int b = 10;
		
		Assert.assertEquals(2,(a/b));
		
		System.out.println("JavaDemo3 Div ran successfully with result: "+(a/b));
	}
	
	

}
