package com.weeklyTest_1;

public class Test_040523_07 {

	public static void main(String[] args) {
//		7.WAP to print following pattern. 
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
		for(int i=5;i>=1;i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
