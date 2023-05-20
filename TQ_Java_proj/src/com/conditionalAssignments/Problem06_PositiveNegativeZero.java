package com.conditionalAssignments;
import java.util.Scanner;

public class Problem06_PositiveNegativeZero {

	public static void main(String[] args) {
//		6. Write a Java program to check whether a number is negative, positive or zero
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double num = sc.nextDouble();
		sc.close();
		
		if(num>0)
		{
			System.out.println("Number is Positive!");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative!");
		}
		else
			System.out.println("Number is Zero!");
		
	}

}
