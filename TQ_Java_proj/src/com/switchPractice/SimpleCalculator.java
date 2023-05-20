package com.switchPractice;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int second = sc.nextInt();
		
		System.out.println("Enter a Operator: e.g(+ ,- ,* ,/ ,%)");
		char operator = sc.next().charAt(0);
		sc.close();
		
		switch(operator)
		{
		case '+': System.out.println("Addition: "+ (first+second));
		break;
		case '-': System.out.println("Substraction: "+ (first-second));
		break;
		case '*': System.out.println("Multiplication: "+ (first*second));
		break;
		case '/': System.out.println("Division: "+ (first/second));
		break;
		case '%': System.out.println("Mod: "+ (first%second));
		break;
		default: System.out.println("Invalid Operator.");
				
		}
	}
}
