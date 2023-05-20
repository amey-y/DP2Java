package com.weeklyTest_1;

public class Test_040523_12 {

	public static void main(String[] args) {
//		12) WAP to print number from 1 to 50 if number is even then print as it is 
//		and number is odd then print negative number with its square
		for(int i=1; i<51; i++)
		{
			if(i%2==0)
			{
				System.out.print(i +" ");
			}
			else {
				System.out.print(-i*i +" ");
			}
		}
	}
}
