package com.org.selenium;

import java.util.List;
//Example of Findelements Method..........
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic3 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	for(WebElement element:links)
	{
		System.out.println(element.getText());
	}
	driver.close();
	
	
}
}
