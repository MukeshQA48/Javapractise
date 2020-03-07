package com.org.oops;

import java.util.Scanner;

public class Largestof3Numbers {

	public static void main(String[] args)
	{
		int x,y,z;
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		x=scn.nextInt();
		
		y=scn.nextInt();
		
		z=scn.nextInt();
		
		if(x>y&&x>z)
		{
			System.out.println("The first number is greatest "+x);
		}
		else if(y>x&&y>z)
		{
			System.out.println("The Second number is greatest "+y);
		}
		else if(z>x&&z>y)
		{
			System.out.println("The Third number is greatest"+z);
		}
		else
		{
			System.out.println("these three are distinct");
		}
			

	}

}
