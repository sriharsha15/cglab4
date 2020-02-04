package com.cg.lab4.Exercise1;

public class Cube {
 	
   void cubeSum(int number)
	{
		int count=0;
		while(number>0)
		{
			int temp=number%10;
			int cube=temp*temp*temp;
			number=number/10;
			count=count+cube;
		}
		System.out.println("Sum of the digits of the cube = " +count);
	}

}
