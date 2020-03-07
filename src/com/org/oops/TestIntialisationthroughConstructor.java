package com.org.oops;

public class TestIntialisationthroughConstructor 
{
	public static void main(String[] args) {
		
	
	IntialisationthroughConstructor con=new IntialisationthroughConstructor();
	IntialisationthroughConstructor con1=new IntialisationthroughConstructor();
	IntialisationthroughConstructor con2=new IntialisationthroughConstructor();
	con.record(236, "Sudhananda Devarapalli", 50000);
	con.display();
	con1.record(456, "Sudheer Devarapalli", 40000);
	con1.display();
	con2.record(789, "Sivananda Devarapalli", 60000);
	con2.display();
	
	
	
	
	}
}
