package com.org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile
{
public void writeExcel(String filepath,String filename,String sheetName,String[] datatoWrite)throws Exception
{
	File src=new File(filepath+"//"+filename);
	
	FileInputStream fis=new FileInputStream(src);
	
	Workbook wb=null;
	
	String ExtensionName=filename.substring(filename.indexOf("."));
	
	if(ExtensionName.equals(".xlsx"))
	{
		wb=new XSSFWorkbook(fis);
	}
	else if(ExtensionName.equals(".xls"))
	{
		wb=new HSSFWorkbook(fis);
	}
	
	Sheet sheet=wb.getSheet(sheetName);
	
	int rowCount=sheet.getLastRowNum();
	
	Row row=sheet.getRow(0);
	
	Row newRow=sheet.createRow(rowCount+1);
	
	for(int j=0;j<row.getLastCellNum();j++)
	{
		Cell cell=newRow.createCell(j);
		cell.setCellValue(datatoWrite[j]);
	}
	fis.close();
	
	FileOutputStream fos=new FileOutputStream(src);
	
	wb.write(fos);
	
	fos.close();
}
public static void main(String[] args) throws Exception 
{
WriteExcelFile file=new WriteExcelFile();

String filepath="C:\\Users\\Mukhesh Kummithi\\Desktop";

String datatoWrite[]= {"Test34","Srilanka","Colombo","Colombo","Pookadai satram"};

file.writeExcel(filepath, "ExcelData.xlsx", "Sheet1", datatoWrite);
}
}
