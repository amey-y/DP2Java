package com.loopsPrctice;
import java.util.Scanner;

public class PrimeNo_02_counter {

	public static void main(String[] args) {
//		using counter instead of boolean
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num = sc.nextInt();
		sc.close();
		
		int i = 2;
		int counter = 0;
		while(i<num)
		{
			if(num%i==0)
			{
				counter = 1;
				break;
			}
			i++;
		}
		
		if(counter==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}
