package com.org.oops;

import java.util.Scanner;

public class Factorial 
{
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter the number to check Factorial of a number :");
	
	int n=scn.nextInt();
	
	int fact=1;
	
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial of the given number is :"+fact);
}
}
