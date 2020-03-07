package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//launching application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//logging into application
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		//clicking usermanagement link
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//handling dropdown using select class
		Select sel=new Select(driver.findElement(By.xpath("//Select[@id='searchSystemUser_userType']")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sel.selectByVisibleText("Admin");
		sel.selectByValue("2");
		//driver.quit();
		
		

	}

}
