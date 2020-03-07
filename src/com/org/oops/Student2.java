package com.org.oops;
//Example of Static Variable,Static Method
public class Student2 
{
int id;
String name;
static String collegename="ITS";

static void change()
{
	collegename="SCSVMV";
}

Student2(int id,String name)
{
	this.id=id;
	this.name=name;
}

void display()
{
	System.out.println(id+"   "+name+"    "+collegename);
}
}
