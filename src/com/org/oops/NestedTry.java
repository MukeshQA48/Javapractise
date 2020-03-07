package com.org.oops;

public class NestedTry 
{
public static void main(String[] args) {
	try
	{
	try
	{
		int a[]=new int[5];
		a[5]=10/0;
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Arithmetic exception handled");
	}
	try
	{
		int a[]=new int[5];
		a[5]=4;
	}
	catch(ArrayIndexOutOfBoundsException ib)
	{
		System.out.println("ArrayIndexoutOfboundsException occurs");
	}
	System.out.println("other statement");
}
	catch(Exception e)
	{
		System.out.println("handled");
	}
	System.out.println("normal flow");
}
}
