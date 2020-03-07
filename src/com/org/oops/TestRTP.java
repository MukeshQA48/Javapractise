package com.org.oops;

public class TestRTP 
{
public static void main(String[] args) {
	Bank b=new SBI();
	Bank b1=new ICICI();
	Bank b12=new BOB();
	System.out.println("the rate of interest is "+b.getRateofInterest());
	System.out.println("the rate of interest is "+b1.getRateofInterest());
	System.out.println("the rate of interest is "+b12.getRateofInterest());
}
}
