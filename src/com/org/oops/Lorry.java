package com.org.oops;
//without using method overriding.....
public class Lorry extends Vehicle 
{
/*void move()
{
	System.out.println("Lorry is moving");
}*/
	void run()
	{
		System.out.println("Lorry is running safely");
	}
public static void main(String[] args) {
	Lorry lor=new Lorry();
	lor.run();
	//lor.move();
}
}
