package com.loopsPrctice;

public class Problems01 {

	public static void main(String[] args) {
//		write a program to generate first 10 numbers of the series.
//		2, 3, 5, 9, 17, 33,.....
		
//		int num = 2;
//		
//		System.out.print(num + " ");
//		for(int i=1; i<=10; i++)
//		{
//			num = num * 2 - 1;
//			System.out.print(num +" ");
//		}
		
//		write a program to generate first 20 numbers of the series.
//		1,2,3,3,7,5,15,9,31,17,....
			
			int num1 = 1;
			int num2 = 2;
			
			System.out.print(num1 +" "+num2 +" ");
			
			for(int i=1; i<=10; i++)
			{
				num1 = num1 * 2 + 1;
				num2 = num2 * 2 - 1;
				System.out.print(num1 +" "+num2 +" ");
			}
			
	}

}
