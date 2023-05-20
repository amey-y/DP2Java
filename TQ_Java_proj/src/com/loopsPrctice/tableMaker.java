package com.loopsPrctice;
import java.util.Scanner;

public class tableMaker {

	public static void main(String[] args) {
//		Write code to find out the table of given number.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("***Table Maker***\nEnter a Number: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
	}
}
