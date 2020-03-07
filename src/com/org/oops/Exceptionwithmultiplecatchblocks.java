package com.org.oops;

public class Exceptionwithmultiplecatchblocks 
{
public static void main(String[] args) {
	try
	{
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		System.out.println("Exception Handled...");
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Arithmetic Exception handled");
	}
	catch(ArrayIndexOutOfBoundsException aie)
	{
		System.out.println("ArrayIndexoutofBound exception handled...");
	}
	
	System.out.println("rest of the code ");
}
}
