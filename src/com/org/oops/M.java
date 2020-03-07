package com.org.oops;

import java.io.IOException;

public class M 
{
void p() throws IOException
{
	throw new IOException("not valid");
}
public static void main(String[] args) {
	M m=new M();
	try {
		m.p();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Exception handled");
}
}
