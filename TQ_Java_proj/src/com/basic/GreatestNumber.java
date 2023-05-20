package com.basic;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Greatest Number Finder***\nEnter First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number: ");
		int num3 = sc.nextInt();
		sc.close();
		
		if (num1>=num2 && num1>=num3 && num2!=num3)
		{
			if (num1>num2 || num1>num3)
			{
				System.out.println(num1+" is the Greatest Number!");
			}
		}
		else if (num2>=num1 && num2>=num3 && num1!=num3)
		{
			if (num2>num1 || num2>num3)
			{
				System.out.println(num2+" is the Greatest Number!");
			}
		}
		else if (num3>=num1 && num3>=num2 && num1!=num2)
		{
			if (num3>num1 || num3>num2)
			{
				System.out.println(num3+" is the Greatest Number!");
			}
		}
		else
		{
			if(num1==num2 && num2==num3)
			{
				System.out.println("All Numbers are Same!");
			}
		}
	}
}
