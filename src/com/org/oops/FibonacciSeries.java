package com.org.oops;

import java.util.Scanner;

public class FibonacciSeries 
{
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter the number of terms :");
	
	int n=scn.nextInt();
	
	int i=0,j=1,nextTerm;
	
	for(int c=0;c<n;c++)
	{
		if(c<=1)
		{
			nextTerm=c;
		}
		else
		{
			nextTerm=i+j;
			i=j;
			j=nextTerm;
		}
		System.out.print("  "+nextTerm);
	}
	
	
}
}
