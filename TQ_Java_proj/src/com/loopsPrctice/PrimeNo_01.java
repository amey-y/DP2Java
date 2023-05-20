package com.loopsPrctice;
import java.util.Scanner;

public class PrimeNo_01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		int i = 2;
		boolean isPrime = true;
		
		while(i<num)
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
			i++;
		}
		
		if(isPrime == true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}
