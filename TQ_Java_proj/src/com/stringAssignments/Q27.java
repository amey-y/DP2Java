package com.stringAssignments;
import java.util.Scanner;

public class Q27 {
//	Q27) Write a Java program to find highest frequency character in a string.
//	Q28) Write a Java program to find lowest frequency character in a string.
//	Q29) Write a Java program to count frequency of each character in a string.
	public void charFrequency(String str)
	{
//		char st[] = str.toLowerCase().toCharArray();
		char st[] = str.toCharArray();
		int count, highcount = Integer.MIN_VALUE, lowcount = Integer.MAX_VALUE;
		boolean flag;
		char hc = 'A', lc = 'z';
		
		for(char i='A'; i<= 'z'; i++)
		{
			count = 0;
			flag = false;
			
			for(char c : st)
			{
				if(i == c)
				{
					count++;
					flag = true;
				}
			}
			if((highcount < count) && flag)
			{
				highcount = count;
				hc = i;
			}
			if((lowcount > count) && flag)
			{
				lowcount = count;
				lc = i;
			}
			if(flag)
			{
				System.out.println(i +" : "+ count);
			}
		}
		System.out.println("Highest occured character is "+ hc);
		System.out.println("Lowest occured character is "+ lc);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		sc.close();
		
		Q27 cf = new Q27();
		cf.charFrequency(str);
	}
}
