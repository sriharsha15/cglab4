package com.cg.lab4.Exercise1;

import java.util.Scanner;

public class CubesOfTheDigits {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int number=sc.nextInt();
	 Cube obj= new Cube();
	 obj.cubeSum(number);
	 sc.close();

	}

}
