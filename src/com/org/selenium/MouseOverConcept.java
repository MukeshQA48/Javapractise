package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverConcept 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.spicejet.com/");
	
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Hot Meals")).click();
	 
}
}
