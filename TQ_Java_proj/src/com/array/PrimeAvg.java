package com.array;
import java.util.Arrays;
import java.util.Scanner;
public class PrimeAvg {
//		WAP to calculate average of prime numbers from the array.
	public static int avgPrime(int arr[])
	{
		int total = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			boolean checkPrime = true;
			int n = arr[i];
			for(int j=2; j<n; j++)
			{
				if(n%j == 0)
				{
					checkPrime = false;
					break;
				}
			}
			if(checkPrime)
			{
				total += n;
				count++;
			}
		}
		return total/count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[8];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Average of Prime number(s) = "+ PrimeAvg.avgPrime(arr));
		
	}

}
