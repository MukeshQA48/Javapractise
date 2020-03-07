package com.org.oops;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample
{
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Prudhvi");
	list.add("Sandeep");
	list.add("Sai");
	list.add("Satish");
	list.add("Mukesh");
	list.add("sai Kiran");
	
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
