package com.org.oops;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) 
	{
	LinkedList<String> al=new LinkedList<String>();
	al.add("Ravi");
	al.add("avi");
	al.add("Manish");
	
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

	}

}
