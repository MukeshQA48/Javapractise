package com.org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisationinSelenium {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.get("https://www.facebook.com/");
	 
	 WebElement firstName=driver.findElement(By.name("firstname"));
	 sendKeys(driver, firstName, 10, "Mukesh");
	 
	 WebElement lastName=driver.findElement(By.name("lastname"));
	 sendKeys(driver, lastName, 5, "kummithi");
	 
	 WebElement forgotAccount=driver.findElement(By.linkText("Forgotten account?"));
	 clickOn(driver, forgotAccount, 10);
	 
	 

	}
	public static void sendKeys(WebDriver driver,WebElement element,int timeOut,String value)
	{
		new WebDriverWait(driver, timeOut)
		.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	public static void clickOn(WebDriver driver,WebElement element,int timeOut)
	{
		new WebDriverWait(driver, timeOut)
		.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
