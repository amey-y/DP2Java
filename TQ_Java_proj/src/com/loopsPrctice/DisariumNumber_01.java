package com.loopsPrctice;
import java.util.Scanner;

public class DisariumNumber_01 {

	public static void main(String[] args) {
//		WAP to check the number is a Disarium Number or Not.
//		Disarium Num = A number whose sum of its Digits powered with its respective position equals to the number itself.
//		135 >> 1^1 + 3^2 + 5^3 = 135
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		int count = 0;
		int sum = 0;
		while(num>0)
		{
			count++;
			num = num / 10;
		}
		int power = 1;
		num = copy;
		while(num>0)
		{
			int digit = num % 10;
			power = 1;
			for(int i=1;i<=count;i++)
			{
				power = power * digit;
			}
			sum += power;
			count--;
			num = num/10;
		}
		if(copy==sum)
		{
			System.out.println(copy +" is a Disarium Number!");
		}
		else
		{
			System.out.println(copy +" is not a Disarium Number!");
		}
	}
}
