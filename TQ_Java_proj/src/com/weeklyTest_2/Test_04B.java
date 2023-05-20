package com.weeklyTest_2;

public class Test_04B {

	public static void main(String[] args) {
// 4B)    1
//       10
//      101
//     1010
//    10101
		
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<=5-i; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				if(j%2!=0)
				{
					System.out.print(1);
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
