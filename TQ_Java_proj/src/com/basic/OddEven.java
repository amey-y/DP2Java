package com.basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Odd or Even Number Finder***\nEnter a Number: ");
		int num = sc.nextInt();
		sc.close();
		
		if (num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
		
		
		
		
		
		


	}

}
