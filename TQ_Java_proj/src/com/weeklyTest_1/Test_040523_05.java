package com.weeklyTest_1;
import java.util.Scanner;

public class Test_040523_05 {

	public static void main(String[] args) {
//		5) write a java program to check given number is trimorphic  number or not
//		4 is trimorphic number as its cube (64) contains 4  at the end .
//		5 is trimorphic number as its cube (625)contains 5 at the end.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		int cube = num*num*num;
		int count = 0;
		int power = 1;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		for(int i=1; i<=count; i++)
		{
			power = power * 10;
		}
		int digit = cube % power;
		System.out.println(digit);
		if(copy==digit)
		{
			System.out.println(copy +" is a Trimorphic Number!");
		}
		else
		{
			System.out.println(copy +" is not a Trimorphic number.");
		}
	}
}
