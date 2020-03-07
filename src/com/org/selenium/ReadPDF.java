package com.org.selenium;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadPDF {
	
	public void readPdf() throws Exception
	{
		URL TestURL=new URL("http://www.axmag.com/download/pdfurl-guide.pdf");
		BufferedInputStream bio=new BufferedInputStream(TestURL.openStream());
		PDFParser 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
