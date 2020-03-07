package com.org.selenium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RW_File 
{
public static void main(String[] args) throws IOException {
	String TestFile="D://test.txt";
	
	File file=new File(TestFile);
	
	file.createNewFile();
	
	FileWriter write=new FileWriter(TestFile);
	//Entering data into file using bufferedwriter
	BufferedWriter writer=new BufferedWriter(write);
	
	writer.write("This is first line...");
	
	writer.newLine();
	
	writer.write("This is second line...");
	
	writer.close();
	
	//Reading data from text file
	FileReader reader=new FileReader(TestFile);
	
	BufferedReader Breader=new BufferedReader(reader);
	
	String Content=Breader.readLine();
	
	while((Content=Breader.readLine())!=null)
	{
		System.out.println(Content);
	}
	
}
}
