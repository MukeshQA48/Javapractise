package com.org.oops;

public class IntialisationthroughConstructor 
{
int Employeeid;
String Employeename;
float Salary;

void record(int e,String n,float s)
{
	Employeeid=e;
	Employeename=n;
	Salary=s;
		
}

void display()
{
	System.out.println(Employeeid + "    " + Employeename + "   " + Salary);
}
}
