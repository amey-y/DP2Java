package com.loopsPrctice;
import java.util.Scanner;

public class SpyNum_01 {

	public static void main(String[] args) {
//		WAP to check the number is 'SPY' number or not.
//		>> If the sum of digits is equal to the product of digits of given number.
//		123 >> 1+2+3 = 6 = 1*2*3
		
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
