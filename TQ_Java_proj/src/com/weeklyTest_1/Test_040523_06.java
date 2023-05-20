package com.weeklyTest_1;

public class Test_040523_06 {

	public static void main(String[] args) {
//		6) WAP to print following pattern. 
// 		   1
//  	 2 2 2
//	   3 3 3 3 3
//	 4 4 4 4 4 4 4
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if((i<=3 && (j==4)) || (i==2 && (j>=3 && j<=5)) || (i==3 && (j>=2 && j<=6)) || i==4)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
