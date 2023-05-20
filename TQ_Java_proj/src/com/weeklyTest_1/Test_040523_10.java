package com.weeklyTest_1;
import java.util.Scanner;

public class Test_040523_10 {

	public static void main(String[] args) {
//		10) Write a program to find twin prime number. (Accept two no from
//			user and check, if both are prime and their difference is 2 then they are twin prime).
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int i = 2;
		boolean isPrime = true;
		
		while(i<num1)
		{
			if(num1%i==0)
			{
				isPrime = false;
				break;
			}
			i++;
		}
		
		if(isPrime == true)
		{
			while(i<num2)
			{
				if(num2%i==0)
				{
					isPrime = false;
					break;
				}
				i++;
			}
			if(isPrime == true)
			{
				if(num1-num2==2 || num1-num2==-2)
				{
					System.out.println("Twin Prime.");
				}
				else {
					System.out.println("Not Twin Prime");
				}
			}
			else {
				System.out.println("Not Twin.");
			}
		}
		else {
			System.out.println("Not Twin Prime");
		}
	}
}
