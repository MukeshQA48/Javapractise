package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverConcept2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		act.moveToElement(driver.findElement(By.linkText("Configuration"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Optional Fields")).click();

	}

}
