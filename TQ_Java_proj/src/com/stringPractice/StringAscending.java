	package com.stringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringAscending {
//		WAP to sort a string in a ascending order
	public void stringAsnd(String[] str)
	{
		for(int i = 0; i < str.length; i++)
		{
			for(int j = i+1; j < str.length; j++)
			{
				if(str[i].length() > str[j].length())
				{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				else if(str[i].length() == str[j].length())
				{
					if(str[i].compareTo(str[j]) > 0)
					{
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
	
	public void stringDsnd(String []str)
	{
		for(int i = 0; i < str.length; i++)
		{
			for(int j = i+1; j < str.length; j++)
			{
				if(str[i].length() < str[j].length())
				{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				else if(str[i].length() == str[j].length())
				{
					if(str[i].compareTo(str[j]) < 0)
					{
						String temp = str[i];
						str[i] = str[j];
						str[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str[] = sc.nextLine().split(" ");
		
		StringAscending sa = new StringAscending();
		sa.stringAsnd(str);
		sa.stringDsnd(str);
		
		
	}

}
