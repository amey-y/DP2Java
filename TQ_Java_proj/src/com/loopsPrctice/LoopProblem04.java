package com.loopsPrctice;
import java.util.Scanner;

public class LoopProblem04 {

	public static void main(String[] args) {
//		Take one number from user and find out the occurrence of each digit from the number.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		int copy = num;
		
		for(int i=0;i<=9;i++)
		{
			int count=0;
			while(num>0)
			{
				int digit = num%10;
				if(i==digit)
				{
					count++;
				}
				num = num/10;
			}
			num = copy;
			if(count>0)
			{
				System.out.println(i +" "+ count);
			}
		}
		
		

	}

}
