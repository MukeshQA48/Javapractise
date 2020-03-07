package com.org.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream inp = new FileInputStream("C:\\Users\\Mukhesh Kummithi\\Desktop\\Registration.xlsx");
		
		        int ctr = 0;
		
		        Workbook wb = WorkbookFactory.create(inp);
		
		        Sheet sheet = wb.getSheetAt(0);
		
		        Row row = null;
		
		        Cell cell = null;
		
		        boolean isNull = false;
		
		        do{
		
		            try{
		
		            row = sheet.getRow(ctr);
		
		            cell = row.getCell(1);
		
		            System.out.println(cell.toString());
		
		            ctr++;
		
		            } catch(Exception e) {
		
		                isNull = true;
		
		            }
		
		             
		
		        }while(isNull!=true);
		
		        inp.close();
		
		    }

}


