package com.conditionalAssignments;
import java.util.Scanner;

public class Problem_02_DivisibleBy {

	public static void main(String[] args) {

//		2. Write a Java program to check whether a number is divisible by 5 and 11 or not
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		if(num%5==0 || num%11==0)
		{
			System.out.println("Number is divisible by 5 or 11");
		}
		else
		{
			System.out.println("Number is not divisible by 5 or 11");
		}
	}

}
