package com.org.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClass 
{
	public static void readExcel(String xlfile,String xlpath) throws Exception {
	
		FileInputStream fis=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int rowCount=sh.getLastRowNum();
		for(int row=1;row<rowCount;row++)
		{
			XSSFRow currentRow=sh.getRow(row);
			
			for(int col=1;col<currentRow.getLastCellNum();col++)
			{
				String username=currentRow.getCell(row, col).
			}
		}
		
	}
	
}
