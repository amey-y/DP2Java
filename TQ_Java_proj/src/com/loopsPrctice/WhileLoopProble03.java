package com.loopsPrctice;

import java.util.Scanner;

public class WhileLoopProble03 {

	public static void main(String[] args) {
		
//		Write code 'Perform the addition of first digit and last digit from the number.' >Take input from the user.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number having more than 2 digits: ");
		int num = sc.nextInt();
		sc.close();
		int firstnum = num;
		int lastnum = num % 10;
		
		while(firstnum>10)
		{
			firstnum = firstnum / 10;
		}
		
		System.out.println("Addtion of first and last digit: "+ (firstnum + lastnum));
		
	}

}
