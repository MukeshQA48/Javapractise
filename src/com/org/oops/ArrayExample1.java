package com.org.oops;

public class ArrayExample1 
{

public static void main(String[] args) {
	/*int a[]=new int [5];
	a[1]=10;
	a[2]=20;
	a[3]=30;
	a[4]=40;
	a[0]=50;*/
	int a[]= {33,3,45};
	/*for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}*/
	for(int i:a)
	{
		System.out.println(i);
	}
}
}
