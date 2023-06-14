package com.stringPractice;

import java.util.Scanner;

public class EvenDigitSum {
//	WAP to find out the even digit sum from the string
	public int evenSum(String alphanum)
	{
		char st[] = alphanum.toCharArray();
		int sum = 0;
		for(char s : st)
		{
			if(s >= '0' && s <= '9')
			{
				if(s%2 == 0)
				{
					sum += Character.getNumericValue(s);
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Alphanumeric string: ");
		String alphanum = sc.nextLine();
		sc.close();
		
		EvenDigitSum eds = new EvenDigitSum();
		System.out.println(eds.evenSum(alphanum));
	}
}
