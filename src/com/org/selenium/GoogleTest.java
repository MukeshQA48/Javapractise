package com.org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	WebDriver driver;
@BeforeMethod
public void setUp()
{
	System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
}

@Test(priority = 1)
public void getTitle()
{
	String title=driver.getTitle();
	System.out.println(title);
}


@Test(priority=2)
public void clickEmailLink()
{
	driver.findElement(By.linkText("Gmail")).click();
}


@Test(priority=3)
public void clickCompose()
{
	driver.findElement(By.className("T-I J-J5-Ji T-I-KE L3")).click();
}

@AfterMethod
public void tearDown()
{
	driver.quit();
}
}
