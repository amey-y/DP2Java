package com.operatorAssignments;
import java.util.Scanner;

public class Problem_02_TotalAvgPerc {

	public static void main(String[] args) {
		
//		2. Write a Java program to enter marks of five subjects and calculate total, average and percentage
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for subjects: ");
		double sub1, sub2, sub3, sub4, sub5;
		sub1 = sc.nextDouble();
		sub2 = sc.nextDouble();
		sub3 = sc.nextDouble();
		sub4 = sc.nextDouble();
		sub5 = sc.nextDouble();
		sc.close();
		
		double total, avg, perc;
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		avg = total/5;
		perc = (total/500)*100;
		
		System.out.println("Total = "+total +"\nAverage = "+avg +"\nPercentage = "+perc);
		
	}

}
