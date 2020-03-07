package com.org.oops;

import java.util.Scanner;

public class PerfectNumber 
{
public static void main(String[] args) {
	int n,sum=0;
	
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter the number to check :");
	
	n=scn.nextInt();
	
	int i=1;
	
	while(i<=n/2)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if(sum==n)
	{
		System.out.println("given number is perfect Number");
	}
	else
	{
		System.out.println("given number is not a perfect Number");
	}
}
}
