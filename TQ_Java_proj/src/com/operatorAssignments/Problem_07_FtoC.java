package com.operatorAssignments;
import java.util.Scanner;

public class Problem_07_FtoC {

	public static void main(String[] args) {
		
//		Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)
//		Temperature in degrees Celsius (°C) = (Temperature in degrees Fahrenheit (°F) - 32) * 5/9.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit: ");
		double f = sc.nextDouble();
		sc.close();
		
		double c = (f - 32) * 5 / 9;
		
		System.out.println(f +" degree in Fahrenheit is "+ c +" degree in Celcius.");
	}

}
