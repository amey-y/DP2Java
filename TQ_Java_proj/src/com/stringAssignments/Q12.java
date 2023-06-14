package com.stringAssignments;

import java.util.Scanner;

public class Q12 {
//	Q12) Write a Java program to count occurrences of a character in given string.
//	Q16) Write a Java program to search all occurrences of a character in given string.
	public int charCount(String str, char ch)
	{
		int count = 0;
		System.out.print(ch +" occured at index(s) >> ");
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ch)
			{
				count++;
				System.out.print(i +" ");
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Enter the character whose occurence count you want to check: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		Q12 c = new Q12();
		System.out.println(ch +" occured "+ c.charCount(str, ch) +" time(s)");
	}
}
