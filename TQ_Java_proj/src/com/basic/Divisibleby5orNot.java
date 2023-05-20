package com.basic;
import java.util.Scanner;

public class Divisibleby5orNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Divisible by 5 Checker***\nEnter a Number: ");
		int num = sc.nextInt();
		sc.close();
		
		if (num%5==0 && num!=0)
		{
			System.out.println("Given number is divisible by 5");
		}
		else
		{
			System.out.println("Given number is NOT divisible by 5");
		}
	}
}

