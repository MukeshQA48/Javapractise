package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest 
{
	
	WebDriver driver;
   @Test
   @Parameters({"url","Email_Address"})
   public void loginYahoo(String url,String Email_Address)
   {
	   
	   System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
	   driver=new ChromeDriver();
	   
	   driver.get(url);
	   driver.findElement(By.xpath("//a[@id='uh-signin']")).click();//clicking signin button..
	   driver.findElement(By.xpath("//input[@id='login-username']")).clear();
	   driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Email_Address);//entering userid...
	   driver.findElement(By.xpath("//input[@id='login-signin']")).click();//clicking next button..
	   	   
   }
   
   
	
	
	
	
}
