package com.weeklyTest_2;
import java.util.Scanner;

public class Test_03 {

	public static void main(String[] args) {
//		A Kaprekar number is a number whose square when divided into two parts and 
//		such that sum of parts is equal to the original number 
//		and none of the parts has value 0
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int copy = n;
		int sqr = n*n;
		int count = 0;
		int power = 1;
		while(n>0)
		{
			n = n/10;
			count++;
		}
		for(int i=1; i<=count; i++)
		{
			power = power * 10;
		}
		int digit = sqr % power; // 2045 % 100 = 25
		int digi2 = sqr / power; // 2045 / 100 = 20
		int sum = digit + digi2;
		if(copy==sum && (digit!=0 && digi2 !=0))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
