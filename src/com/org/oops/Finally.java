package com.org.oops;

public class Finally 
{
public static void main(String[] args) {
	try
	{
		int a=25/0;
		System.out.println(a);
	}
	catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	finally {
		System.out.println("finally block is executed");
	}
}
}
