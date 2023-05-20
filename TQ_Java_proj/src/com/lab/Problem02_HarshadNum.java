package com.lab;
import java.util.Scanner;

public class Problem02_HarshadNum {

	public static void main(String[] args) {
//		A positive integer n is said to be a Niven number (or a Harshad number) 
//		if it is divisible by the sum of its (decimal) digits. For instance, 153 is a Niven number since 9 divides 153
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		int sum = 0;
		
		while(num>0)
		{
			int digit = num%10;
			sum = sum + digit;
			num = num / 10;
		}
		if(copy%sum==0)
		{
			System.out.println(copy +" is a Harshad Number.");
		}
		else
		{
			System.out.println("Not a Harshad Number.");
		}
	}
}
