package com.basic;
import java.util.Scanner;

public class IfElseAgeQuestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Age: ");
		int age1 = sc.nextInt();
		
		System.out.println("Enter your Friend's Age: ");
		int age2 = sc.nextInt();
		sc.close();
		
		if (age1>age2)
		{
			System.out.println("Hi");
		}
		else if (age2>age1)
		{
			System.out.println("Hello");
		}
		else
		{
			System.out.println("How are you?");
		}

	}

}
