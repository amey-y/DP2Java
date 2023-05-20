package com.operatorAssignments;
import java.util.Scanner;

public class Problem_01 {

	public static void main(String[] args) {
//		1. Write a Java program to calculate area of an equilateral triangle.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Area of Equilateral Triangle\nEnter the length of side: ");
		double side = sc.nextDouble();
		sc.close();
//		Value of root 3 is 1.732
		
		double area = 1.732/4*side*side;
		System.out.println("Area of triangle is "+ area);
		
	}

}
