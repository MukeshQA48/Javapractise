package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//example for Findelement method to access the webpage elements
public class Basic2 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
WebDriver driver=new ChromeDriver();


driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("mukheshmuku9@gmail.com");
driver.findElement(By.id("pass")).sendKeys("11129B048");

driver.findElement(By.id("u_0_b")).click();
driver.close();
}
}
