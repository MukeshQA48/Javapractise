package com.org.oops;

public class MulticatchBlock 
{
public static void main(String[] args) {
	try
	{
		String s="abc";
		int i=Integer.parseInt(s);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	catch(NumberFormatException nf)
	{
		System.out.println(nf);
	}
}
}
