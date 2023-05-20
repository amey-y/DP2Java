package com.loopsPrctice;
import java.util.Scanner;

public class WhileLoopProblem02 {

	public static void main(String[] args) {
		
//		Write code check whether the given number is Palindrome or Not.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number having more than 2 digits: ");
		int num = sc.nextInt();
		sc.close();
		int newnum = 0;
		
		while(num>0)
		{
			int digit = num % 10;
			newnum = newnum * 10 + digit;
			num = num / 10;
		}
		
		if(newnum == num)
		{
			System.out.println(num +" is a Palindrome.");
		}
		else
		{
			System.out.println(num +" is not a Palindrome.");
		}
		

	}

}
