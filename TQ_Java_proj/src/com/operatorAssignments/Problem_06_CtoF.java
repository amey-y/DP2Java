package com.operatorAssignments;
import java.util.Scanner;

public class Problem_06_CtoF {

	public static void main(String[] args) {
		
//		Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.
//		Temperature in degrees Fahrenheit (°F) = (Temperature in degrees Celsius (°C) * 9/5) + 32
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in Celcius: ");
		double c = sc.nextDouble();
		sc.close();
		
		double f = (c * 9 / 5) + 32;
		
		System.out.println(c +" degree Celcius is "+ f +" degree Fahrenheit.");
	}

}
