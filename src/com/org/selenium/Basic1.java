package com.org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basic1 
{
public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
	WebDriver driver=new ChromeDriver();*/
	
	/*System.setProperty("webdriver.gecko.driver", "D://Study//Selenium//Browser_Drivers//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();*/
	
	System.setProperty("webdriver.ie.driver", "D://Study//Selenium//Browser_Drivers//IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	
	driver.get("https://www.softwaretestingmaterial.com/");
	
	String Expectedtitle="Software Testing Material";
	String Actualtitle=null;
	
	Actualtitle=driver.getTitle();
	
	if(Actualtitle.contentEquals(Expectedtitle))
	{
		System.out.println("Expected title is "+Expectedtitle);
		System.out.println("Actual title is "+Actualtitle);
		System.out.println("Test Passed");
	}
	else
	{
	 
		System.out.println("Expected title is "+Expectedtitle);
	    System.out.println("Actual title is "+Actualtitle);
	    System.out.println("Test Failed");
	}
	driver.close();
}
}
