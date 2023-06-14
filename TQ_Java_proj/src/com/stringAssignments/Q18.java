package com.stringAssignments;

import java.util.Scanner;

public class Q18 {
//	Write a Java program to remove all occurrences of a character from string.
	public String charRemover(String str, char ch)
	{
		String newstr = "";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ch)
			{
				newstr += "";
			}
			else
				newstr += str.charAt(i);
		}
		return newstr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		System.out.println("Enter the character whose occurences you want to remove: ");
		char ch = sc.next().charAt(0);
		sc.close();
		
		Q18 c = new Q18();
		System.out.println(c.charRemover(str, ch));
	}
}
