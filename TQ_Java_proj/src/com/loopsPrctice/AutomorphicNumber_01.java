package com.loopsPrctice;
import java.util.Scanner;

public class AutomorphicNumber_01 {

	public static void main(String[] args) {
//		WAP to check the number is an Automorphic number or not.
//		If the original number & last digit of its square are same then the number is automorphic.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		int sqr = num*num;
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
		int digit = sqr % power;
		if(copy==digit)
		{
			System.out.println(copy +" is a Automorphic Number!");
		}
		else
		{
			System.out.println(copy +" is not a Automorphic number.");
		}
	}
}
