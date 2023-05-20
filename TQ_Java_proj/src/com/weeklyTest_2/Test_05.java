package com.weeklyTest_2;
import java.util.Scanner;

public class Test_05 {

	public static void main(String[] args) {
//		5) Series   0,3,8,15,24,35,48.....n terms
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt(), c = 0, i;
		sc.close();
		System.out.print(c +" ");
		for(i=3; i<=n*2; i++)
		{
			if(i%2!=0)
			{
				c = c + i;
				System.out.print(c +" ");
			}
		}
	}
}
