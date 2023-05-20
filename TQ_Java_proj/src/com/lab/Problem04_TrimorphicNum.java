package com.lab;
import java.util.Scanner;
public class Problem04_TrimorphicNum {

	public static void main(String[] args) {
//		A number is called Trimorphic number if and only if its cube ends in the same digits as the number itself.
//		ex. 4^3 = 64
		
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
			count++;
			num = num/10;
		}
		for(int i=1; i<=count; i++)
		{
			power = power * 10;
		}
		
		int digit = cube % power;
		if(copy==digit)
		{
			System.out.println(copy +" is a Trimorphic number.");
		}
		else
		{
			System.out.println(copy +" is not a Trimorphic number.");
		}
	}
}
