package com.org.oops;

import java.util.Random;

public class RandomNumbers 
{
public static void main(String[] args) {
	
	int counter;
	
	Random t=new Random();
	
	for(counter=0;counter<=10;counter++)
	{
		System.out.println(t.nextInt(200));
	}
}
}
