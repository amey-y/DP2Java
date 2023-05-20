package com.loopsPrctice;

public class PrimeNum_1_10_avg {

	public static void main(String[] args) {
//		WAP to calculate the average of prime numbers between 1 - 10.
		int counter = 0;
		float sum = 0f;
		for(int num = 1; num<=10; num++)
		{
			boolean isprime = true;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isprime = false;
					break;
				}
			}
			if(isprime)
			{
				counter++;
				sum = sum + num;
			}
		}
		System.out.println(sum/counter);
	}
}
