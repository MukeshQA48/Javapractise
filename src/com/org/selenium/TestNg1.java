package com.org.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1 
{
 
	@BeforeSuite
	public void setUp()
	{
		System.out.println("BeforeSuite: Setup successfully done....");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest: Test successfully done...");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass: class is successfully done");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod: method is successfully done");
	}
	
	@Test
	public void Test()
	{
		System.out.println("test: Test is successfully Executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod: Method is successfully executed...");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass: class is successfully Executed..");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Aftermethod:Method is Successfully executed");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite:suite is executed successfullyy...");
	}
	
	
	
	
}
