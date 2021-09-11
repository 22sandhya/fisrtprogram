package com.bz.test;

import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
		
		int power=1,consta=2;
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		
	
			for(int i=1;i<num;i++)
			{
				power = power*consta;
				
			}
			System.out.println("the value is: " + power);		
		
		

	}

}
