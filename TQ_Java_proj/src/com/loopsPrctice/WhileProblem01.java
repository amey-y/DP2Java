package com.loopsPrctice;
import java.util.Scanner;

public class WhileProblem01 {

	public static void main(String[] args) {
//		Write code to count the number of digits from the number.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		int count=0;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Number of digits: " +count);
	}

}
