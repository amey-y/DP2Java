package com.basic;
import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Positive & Negative Number Checker***\nEnter a Number: ");
		int num = sc.nextInt();
		sc.close();
		
		if (num<0)
		{
			System.out.println("Given number is Negative");
		}
		else if (num>0)
		{
			System.out.println("Given number is Positive");
		}
		else
		{
			System.out.println("Given number is Zero");
		}

	}

}
