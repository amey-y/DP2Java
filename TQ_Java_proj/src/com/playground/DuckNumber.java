package com.playground;
import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
//		WAP to check if a number is a Duck number or not.
//		num which contains at least one zero and does not start with 0.
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		int digit, count=0;
		
		while(num>0)
		{
			digit = num%10;
			System.out.println(digit);
			if(digit==0)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println("Duck");
		
		
		
		
		
	}

}
