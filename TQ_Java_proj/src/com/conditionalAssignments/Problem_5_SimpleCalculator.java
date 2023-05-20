package com.conditionalAssignments;
import java.util.Scanner;

public class Problem_5_SimpleCalculator {

	public static void main(String[] args) {
//		5. Write a Java program to create Simple Calculator
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter 2nd number: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter a operator:\n+, -, *, /, %");
		char op = sc.next().charAt(0);
		sc.close();
		
		switch(op)
		{
		case '+': System.out.println("Addition: "+ (num1+num2));
		break;
		
		case '-': System.out.println("Substraction: "+ (num1-+num2));
		break;
		
		case '*': System.out.println("Multiplication: "+ (num1*num2));
		break;
		
		case '/': System.out.println("Division: "+ (num1/num2));
		break;
		
		case '%': System.out.println("Modulas: "+ (num1%num2));
		break;
		
		default: System.out.println("Invalid Operator!");
		}
		
	}

}
