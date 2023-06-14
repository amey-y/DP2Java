package com.playground;
import java.util.Scanner;
public class Play01 {

	static void m1(byte x)
	{
		System.out.println("INT");
	}
	
	static void m1(long y)
	{
		int a =10;
		System.out.println("LONG");
	}
	
	static void m1(double z)
	{
		System.out.println("DOUBLE");
	}
	
	public static void main(String[] args) {

//		float i=3.5f;
//		m1(i);
		int a =10;
		
		char x = 'a', y = 'b';
		char z = (char)(x+y);
		System.out.println(z);
		
		for(int i=1;i<=200; i++)
		{
			System.out.println(i +" : "+(char)i);
		}
		
		
		
		
		//		Scanner sc=new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		int sum=0, i;
//		
//		for(i=1; i<=n; i++)
//		{
//			sum = sum +i;
//		}
//		System.out.println(sum);

//		Scanner sc=new Scanner(System.in);
//		int num = sc.nextInt();
//		sc.close();
//		boolean isThree = false;
//		
//		while(num>0)
//		{
//			int digit = num%10;
//			if(digit==3)
//			{
//				isThree = true;
//				break;
//			}
//			num = num/10;
//		}
//		System.out.println(isThree);
	}
}
