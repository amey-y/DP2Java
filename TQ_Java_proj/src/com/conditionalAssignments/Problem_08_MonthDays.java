package com.conditionalAssignments;
import java.util.Scanner;

public class Problem_08_MonthDays {

	public static void main(String[] args) {
//		8. Write a Java program print total number of days in a month
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter months number: ");
		int month = sc.nextInt();
		sc.close();
		
		if((month<=7&&month%2!=0)||(month>=8&&month%2==0))
		{
			System.out.println("Total days are 31.");
		}
		else if(month>3)
		{
			System.out.println("Total days are 30.");
		}
		else
			System.out.println("Total days are 28 or 29.");
	}

}
