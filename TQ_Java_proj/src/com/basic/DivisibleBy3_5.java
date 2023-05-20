package com.basic;

import java.util.Scanner;

public class DivisibleBy3_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Divisible by 3 or 5 Checker***\nEnter a Number: ");
		int num = sc.nextInt();
		sc.close();
		
		if ((num%3==0 || num%5==0) && num!=0)
		{
			if (num%3==0 && num%5==0)
			{
				System.out.println("Given number is divisible by 3 and 5");
			}
			else if(num%3==0)
			{
				System.out.println("Given number is divisible by 3");
			}
			else
			{
				System.out.println("Given number is divisible by 5");
			}
		}
		else
		{
			System.out.println("Given number is NOT divisible by 3 or 5");
		}
	}

}
