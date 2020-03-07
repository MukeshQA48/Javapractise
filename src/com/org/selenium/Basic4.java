package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic4 
{
//Examples of Locators
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D://Study//Selenium//Browser_Drivers//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.gmail.com");
	
	driver.findElement(By.id("identifierId")).sendKeys("mukhesh1994@gmail.com");
	
	driver.findElement(By.id("identifierNext")).click();
	
	driver.findElement(By.tagName("input")).sendKeys("9052249491");
	
	driver.findElement(By.id("passwordNext")).click();
	
	driver.close();
	
}
}
