package com.org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelValue 
{
/*public void readExcelFile(String filepath,String filename,String sheetName) throws Exception 
{
	File file=new File(filepath+"\\"+filename);
	FileInputStream fis=new FileInputStream(file);
	Workbook wb=null;
	String fileExtension=filename.substring(filename.indexOf("."));
	if(fileExtension.equals(".xlsx"))
	{
		wb=new XSSFWorkbook(fis);
	}
	else if(fileExtension.equals(".xls"))
	{
		wb=new HSSFWorkbook(fis);
	}
	Sheet wbSheet=wb.getSheet(sheetName);
	int rowCount=wbSheet.getLastRowNum()-wbSheet.getFirstRowNum();
	int colCount=wbSheet.getRow(0).getLastCellNum();
    for(int i=0;i<rowCount;i++)
    {
    	Row row=wbSheet.getRow(i);
    	
    	for(int j=0;j<colCount;j++)
    	{
    		System.out.print(row.getCell(j).toString()+"||");
    	}
    	System.out.println();
    }
	
}*/
	public void readExcelfile(String filepath,String sheetName) throws IOException
	{
		File src=new File(filepath);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowCount;i++)
		{
			XSSFRow currentRow=sheet.getRow(i);
			for(int j=0;j<=colCount;j++)
			{
				String value=currentRow.getCell(j).toString();
				System.out.print(" "+value);
			}
			System.out.println();
		}
		wb.close();
	}
public static void main(String[] args) throws Exception {
	ReadExcelValue excel=new ReadExcelValue();
	 String filepath="C:\\Users\\Mukhesh Kummithi\\Desktop\\ExcelData.xlsx";
	excel.readExcelfile(filepath, "Sheet1");
}
}
