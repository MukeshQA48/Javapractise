package com.org.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTestUsingExcel {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://Study//Selenium//Browser_Drivers//TestFolder//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/");
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Mukhesh Kummithi\\Desktop\\Mercury Travels.xlsx");
			
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			
			XSSFSheet sh=wb.getSheet("Sheet1");
			
			int rowCount=sh.getLastRowNum();
			
			for(int row=1;row<rowCount;row++)
			{
				XSSFRow currentRow=sh.getRow(row);
				
			   String FirstName=currentRow.getCell(0).getStringCellValue();
			   
			   String LastName=currentRow.getCell(1).getStringCellValue();
			   
			   String phoneNumber=currentRow.getCell(2).toString();
			   
			   String Email=currentRow.getCell(3).getStringCellValue();
			   
			   String Address=currentRow.getCell(4).getStringCellValue();
			   
			   String city=currentRow.getCell(5).getStringCellValue();
			   
			   String state=currentRow.getCell(6).getStringCellValue();
			   
			   String PostalCode=currentRow.getCell(7).toString();
			   
			   String Country=currentRow.getCell(8).getStringCellValue();
			   
			   String UserName=currentRow.getCell(9).getStringCellValue();
			   
			   String Password=currentRow.getCell(10).getStringCellValue();
			   
			   String ConfirmPassword=currentRow.getCell(11).getStringCellValue();
			   

			   driver.findElement(By.linkText("REGISTER")).click();
			   
			   driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FirstName);
			   
			   driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(LastName);
			   
			   driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phoneNumber);
			   
               driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Email);
				
               driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Address);
				
               driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
				
               driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
				
               driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(PostalCode);
               
               Select dropdown=new Select(driver.findElement(By.name("country")));
   			   
               dropdown.selectByVisibleText(Country);
   			
   			
               driver.findElement(By.xpath("//input[@name='email']")).sendKeys(UserName);
   			
               driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
   			
               driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(ConfirmPassword);
   			
               driver.findElement(By.xpath("//input[@name='register']")).click();
               
               if(driver.getPageSource().contains("Thank you for registering"))
   			   {
   				System.out.println("Registration completed for "+row+" record ");
   		       }
   			   else
   			   {
   				System.out.println("Registration failed for "+row+" record ");
   			   }
			}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
