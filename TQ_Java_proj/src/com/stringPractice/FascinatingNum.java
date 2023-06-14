package com.stringPractice;

import java.util.Scanner;

public class FascinatingNum {
/*	Take one 3 digit number, multiply that number by 1, 2, 3.
 * Concatenate all the answers then check if answer contains all the unique digits,
 * If yes the display 'It's a Fascinating Number' otherwise 'Not Fascinating'.
*/	
	public void fascinating(int num)
	{
		int []multi = new int[3];
		int count = 0;
		String str = "";
		for(int i=0; i<=2; i++)
		{
			multi[i] = num*(i+1);
			str += multi[i];
		}
		System.out.println(str);
		
		char st[] = str.toCharArray();
		
		for(int j='0'; j<='9'; j++)
		{
			count = 0;
			for(char c : st)
			{
				if(c==j)
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println("Not Fascinating.");
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Fascinating Number.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int num = sc.nextInt();
		sc.close();
		
		FascinatingNum fn = new FascinatingNum();
		fn.fascinating(num);
	}
}
