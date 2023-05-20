package com.weeklyTest_1;

public class Test_040423_01 {

	public static void main(String[] args) {
//		Write a program to print all numbers between 1 and 100 except
//		the numbers which are divisible by 5 or 10
		
		for(int i=1; i<=100; i++)
		{
			if(i%5!=0)
			{
				System.out.print(i +" ");
			}
		}
	}
}
