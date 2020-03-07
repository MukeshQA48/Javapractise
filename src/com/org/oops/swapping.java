package com.org.oops;

public class swapping 
{
public static void main(String[] args) {
	System.out.println("Before swapping ");
	int x=100;
	int y=200;
	System.out.println("Value of x is "+x);
	System.out.println("Value of y is "+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("After swapping");
	System.out.println("Value of x is "+x);
	System.out.println("Value of y is "+y);
}
}
