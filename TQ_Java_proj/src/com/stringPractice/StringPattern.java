package com.stringPractice;

import java.util.Scanner;

public class StringPattern {
//	WAP to display string in pattern manner
	
	public void patternStr(String str)
	{
		String st[] = str.split(" ");
		for(int i=1; i<=st.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(st[j] +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		sc.close();
		
		StringPattern sp = new StringPattern();
		sp.patternStr(str);
	}
}
