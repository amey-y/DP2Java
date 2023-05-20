package com.weeklyTest_1;
import java.util.Scanner;

public class Test_040523_04 {

	public static void main(String[] args) {
//		4)write a java program to check given number is spy number or not
//		e.g 123 if sum of digit is equals to product of digit the number is spy number
//		i.e 123=1+2+3=6 and 1*2*3=6 so the number is spy number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		int sum = 0, prod = 1;
		while(num>0)
		{
			int digit = num % 10;
			sum += digit;
			prod *= digit;
			num = num/10;
		}
		if(sum==prod)
		{
			System.out.println(copy +" is a 'Spy' Number.");
		}
		else
		{
			System.out.println(copy +" is NOT a 'Spy' Number.");
		}
	}
}
