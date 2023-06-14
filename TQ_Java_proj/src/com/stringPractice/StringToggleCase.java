package com.stringPractice;

import java.util.Scanner;

public class StringToggleCase {
//	WAP to convert string into Toggle Case
	public String toggleCase(String str)
	{
		char st[] = str.toCharArray();
		String toggled = "";
		for(char c : st)
		{
			if(c >= 65 && c <= 90)
			{
				c += 32;
			}
			else if(c >= 97 && c <= 122)
			{
				c -= 32;
			}
			toggled += c;
		}
//		System.out.println(toggled);
		return toggled;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		sc.close();
		
		StringToggleCase stc = new StringToggleCase();
//		stc.toggleCase(str);
		System.out.println(stc.toggleCase(str));
	}
}
