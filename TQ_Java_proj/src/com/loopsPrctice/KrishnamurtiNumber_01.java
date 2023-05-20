package com.loopsPrctice;
import java.util.Scanner;

public class KrishnamurtiNumber_01 {

	public static void main(String[] args) {
//		WAP to check the number is Krishnamurthy or NOT.
//		A number is Krishnamurty number, if the sum of the factorial of each digit is the same as the number.
//		For example, if a number is 145, then sum = 1! + 4! + 5!
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		int sum = 0;
		
		while(num>0)
		{
			int digit = num % 10;
			int fact = 1;
			for(int i=digit; i>=1; i--)
			{
				fact = fact * i;
			}
			sum = sum + fact;
			num = num/10;
		}
		num = copy;
		if(num==sum)
		{
			System.out.println(num +" is a Krishnamurthy Number.");
		}
		else
		{
			System.out.println(num +" is not a Krishnamurthy Number.");
		}
	}

}
