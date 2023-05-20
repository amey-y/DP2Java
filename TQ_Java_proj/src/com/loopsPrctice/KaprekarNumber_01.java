package com.loopsPrctice;
import java.util.Scanner;

public class KaprekarNumber_01 {

	public static void main(String[] args) {
//		WAP to check the number is Kaprekar or NOT.
/*		Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits.
 * 		If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since
		 9^2=81    8+1=9, 
		and 297 is a Kaprekar number since
		 297^2=88209    88+209=297. 
		The first few are 1, 9, 45, 55, 99, 297, 703,
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
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
		int digi2 = sqr / power;
		int sum = digit + digi2;
		if(copy==sum)
		{
			System.out.println(copy +" is a Kaprekar Number!");
		}
		else
		{
			System.out.println(copy +" is not a Kaprekar number.");
		}
	}
}
