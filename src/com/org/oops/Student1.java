package com.org.oops;
//Example of Parameterized Constructor and Constructor Overloading
public class Student1 
{
int id;
String Name;
int age;
Student1(int i,String n) {
	
	id=i;
	Name=n;
}
Student1(int i,String n,int a)
{
	id=i;
	Name=n;
    age=a;
}
void display()
{
	System.out.println(id+"  "+Name+"  "+age);
}
public static void main(String[] args) {
	Student1 s1=new Student1(1, "Aryan");
	Student1 s2=new Student1(2, "Vikram",25);
	s1.display();
	s2.display();
}
}
