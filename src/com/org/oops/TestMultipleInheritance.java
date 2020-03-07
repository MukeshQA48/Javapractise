package com.org.oops;

public class TestMultipleInheritance implements Printable,Showable 
{

	
	public void print() {
		System.out.println("RRR teaser is shown");
		
	}

	
	
public static void main(String[] args) 
{
	TestMultipleInheritance tmi=new TestMultipleInheritance();
	tmi.print();
}
}
