package com.weeklyTest_1;

public class Test_040523_08 {

	public static void main(String[] args) {
		
//		8) WAP to print following pattern. 
//	      1 2 3 4 5
//	        1 2 3 4
//	          1 2 3
//	            1 2
//	              1

		for (int i = 5; i >= 1; i--) {
		    for (int j = 4; j >= i; j--)
		    {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i; k++)
		    {
		        System.out.print(k);
		    }
		    System.out.println();
		}
	}
}
