package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class uploadingfilesusingsikuli 
{
public static void main(String[] args) throws FindFailed {
	String inputfilepath="C:\\Users\\Mukhesh Kummithi\\Desktop\\";
	String openbutton="C:\\Users\\Mukhesh Kummithi\\Desktop\\";
	Screen s=new Screen();
	Pattern p=new Pattern(inputfilepath+"Filetextbox.png");
	Pattern p1=new Pattern(openbutton+"Openbox.png");
	
	
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/image_upload/index.php");
	
	driver.findElement(By.xpath("//input[@type='file']")).click();
	
	s.wait(p, 20);
	s.type(p, inputfilepath+"cucumber.txt");
	s.click(openbutton);
	
	driver.close();
	
	
	
	
	
}
}
