package com.loopsPrctice;

public class PrimeNo_DisplayPrimes {

	public static void main(String[] args) {
//		Display all Primes between 1 to 10
		for(int num=1; num<=10; num++)
		{
			boolean isprime = true;
			int i = 2;
			while(i<num)
			{
				if(num%i==0)
				{
					isprime = false;
					break;
				}
				i++;
			}
			if(isprime)
			{
				System.out.println(num);
			}
		}
	}
}
