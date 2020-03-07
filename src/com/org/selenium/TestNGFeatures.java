package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGFeatures 
{
	static WebDriver driver;
@BeforeMethod
public static void setUp()
{
	System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
}


@Test(priority=1,expectedExceptions = ArithmeticException.class)
public static void LoginAppplication()
{
	driver.findElement(By.name("email")).sendKeys("mukheshmuku9@gmail.com");
	
	driver.findElement(By.name("pass")).sendKeys("11129B048");
	
	int x=10/0;
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Test(priority=2)
public static void clickProfile()
{
	driver.findElement(By.linkText("Mukhesh")).click();
}

@Test(priority=3)
public static void clickUpdateInfo()
{
	driver.findElement(By.id("u_ps_fetchstream_7_0_3")).click();
	
}

@AfterMethod
public static void logOut()
{
	driver.quit();
	
	
}
}
