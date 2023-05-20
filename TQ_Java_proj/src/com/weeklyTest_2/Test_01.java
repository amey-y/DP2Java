package com.weeklyTest_2;
import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
//		1) WAP to accept mobile number and count frequency of digit
		Scanner sc=new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();
		long copy=num, digit, i, count;

		for(i=0; i<=9; i++)
		{
			num=copy;
			count=0;
			while(num>0)
			{
				digit = num%10;
				if(digit==i)
				{
					count++;
				}
				num=num/10;
			}
			if(count>0)
			{
				System.out.println(i +" : "+ count);
			}
			
		}
	}
}
