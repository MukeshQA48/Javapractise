package com.org.oops;

public class Employee1 extends Person 
{
	float Salary;
Employee1(int id,String name,float Salary)
{
	super(id,name);
	this.Salary=Salary;
}
final void display()
{
	System.out.println(id+"  "+name+" "+Salary);
}
}
