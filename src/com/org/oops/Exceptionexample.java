package com.org.oops;

public class Exceptionexample 
{
public static void main(String[] args) {
	
	try
	{
	int data[]= {1,2,3,4};
	System.out.println(data[5]);
	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		System.out.println(ae);
	}
	System.out.println("rest of the program....");
}
}
