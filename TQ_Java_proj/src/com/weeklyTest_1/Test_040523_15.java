package com.weeklyTest_1;
import java.util.Scanner;

public class Test_040523_15 {

	public static void main(String[] args) {
//		15)1!+2!+3!+4!...n WAP java program to find sum.
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, fact, i, j;
		
		for(i=1; i<=n; i++)
		{
			fact = 1;
			for(j=i; j>=1; j--)
			{
				fact = fact * j;
			}
			sum = sum + fact;
		}
		System.out.println(sum);
	}
}
