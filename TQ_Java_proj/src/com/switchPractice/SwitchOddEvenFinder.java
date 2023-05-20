package com.switchPractice;
import java.util.Scanner;

public class SwitchOddEvenFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		sc.close();
		
		switch(num%2)
		{
		case 0: System.out.println("Even Number");
		break;
		default: System.out.println("Odd Number");
		}
	}

}
