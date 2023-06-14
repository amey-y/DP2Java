package com.stringPractice;
import java.util.Scanner;

public class NumVowelsString {
	
	public int vowels(String st)
	{
		char[] char_st = st.toCharArray();
		char []vowels = {'a','e','i','o','u'};
		int count = 0;

		for(char c:char_st)
		{
			for(char v:vowels)
			{
				if(c == v)
				{
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
//		WAP to find out the number of vowels present in a string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String st = sc.nextLine();
		sc.close();
		
		NumVowelsString s = new NumVowelsString(); 
		System.out.println(s.vowels(st));
	}
}
