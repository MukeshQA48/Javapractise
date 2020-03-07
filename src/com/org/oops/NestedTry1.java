package com.org.oops;

public class NestedTry1 
{
public static void main(String[] args) {
	try
	{
		try
		{
			System.out.println("entering into try block");
			String s="abc";
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Exception is handled");
		}
		
		try
		{
			String s1=null;
			System.out.println(s1.length());
		}
		catch(NullPointerException np)
		{
			System.out.println("Excepiton is handled");
		}
	}
	catch(Exception e)
	{
		System.out.println("parent class Exception handled");
	}
	System.out.println("normal flow");
	
}
}
