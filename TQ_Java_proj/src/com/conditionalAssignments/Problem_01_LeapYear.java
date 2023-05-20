package com.conditionalAssignments;
import java.util.Scanner;

class Problem_01_LeapYear {

	public static void main(String[] args) {

//		Write a Java program to check whether a year is leap year or not
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		sc.close();
		
		if((year%4==0 && year%100!=0) || (year%100==0 && year%400==0) )
		{
			System.out.println("Entered year is a leap year.");
		}

		else
		{
			System.out.println("Entered year is not a leap year.");
		}
		
	}

}
