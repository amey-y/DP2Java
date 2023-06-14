package com.stringAssignments;

import java.util.Scanner;

public class Q17 {
//	Write a Java program to convert uppercase string to lowercase.
	public String uppercase(String str)
	{
		char st[] = str.toCharArray();
		String finalstr = "";
		
		for(char c : st)
		{
			if(c >= 97 && c <= 122)
			{
				c -= 32;
			}
			finalstr += c;
		}
		return finalstr;
	}
	
	public String lowercase(String str)
	{
		char st[] = str.toCharArray();
		String finalstr = "";
		
		for(char c : st)
		{
			if(c >= 65 && c <= 90)
			{
				c += 32;
			}
			finalstr += c;
		}
		return finalstr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Select the case no. you want to convert the string to:\n1. uppercase\n2. lowercase");
		int choice = sc.nextInt();
		sc.close();
		Q17 a = new Q17();
		
		switch(choice)
		{
		case 1: System.out.println(a.uppercase(str));
		break;
		case 2: System.out.println(a.lowercase(str));
		break;
		default: System.out.println("Invalid choice!");
		}
	}
}
