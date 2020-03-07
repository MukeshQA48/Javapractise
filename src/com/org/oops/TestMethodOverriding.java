package com.org.oops;

public class TestMethodOverriding 
{
public static void main(String[] args) {
	SBI s=new SBI();
	ICICI i=new ICICI();
	BOB b=new BOB();
	System.out.println(s.getRateofInterest());
	System.out.println(i.getRateofInterest());
	System.out.println(b.getRateOfinterest());
}
}
