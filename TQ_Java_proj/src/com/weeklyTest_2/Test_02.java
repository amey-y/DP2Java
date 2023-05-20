package com.weeklyTest_2;
import java.util.Scanner;
public class Test_02 {

	public static void main(String[] args) {
//		WAP to calculate x^y  where x is base and y is index without using readymade function.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base Value: ");
		int x = sc.nextInt();
		System.out.println("Enter the index/power value: ");
		int y = sc.nextInt();
		sc.close();
		int power = 1, i;
		
		for(i=1; i<=y; i++)
		{
			power = power * x;
		}
		System.out.println(x+"^"+y+" = "+power);
	}
}
