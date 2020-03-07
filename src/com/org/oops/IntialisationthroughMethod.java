package com.org.oops;

public class IntialisationthroughMethod 
{
	int id;
	String Name;
 void studentRecord(int i,String n)
 {
	 id=i;
	 Name=n;
 }
 void displayInformation()
 {
	 System.out.println(id+ "   " +Name);
 }
}
