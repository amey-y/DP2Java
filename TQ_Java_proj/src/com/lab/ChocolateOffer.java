package com.lab;
import java.util.Scanner;

public class ChocolateOffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rupees the kid have? ");
		int rs = sc.nextInt();
		sc.close();
		int i, count = 0;
		
		for(i=1; i<=rs; i++)
		{
			count++;
			if(count%3==0)
			{
				count++;
			}
		}
		System.out.println("The kid will get "+ count +" chocolates.");
	}
}
