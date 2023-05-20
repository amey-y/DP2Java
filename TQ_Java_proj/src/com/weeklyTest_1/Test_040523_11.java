package com.weeklyTest_1;

public class Test_040523_11 {

	public static void main(String[] args) {
//		11) Print the Series 2 12 36 80 150 252....upto 10 terms
		int a=2;
		System.out.print(a +" ");
		for(int i=a; i<12; i++)
		{
			a = (i*i*i) + (i*i);
			System.out.print(a +" ");
		}
	}
}
