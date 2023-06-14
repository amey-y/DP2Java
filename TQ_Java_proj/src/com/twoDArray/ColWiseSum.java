package com.twoDArray;

import java.util.Arrays;

public class ColWiseSum {
//	WAP to find out the Column wise sum of 2D Array.
	public void colSum(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			int sum = 0;
			for(int j=0; j<a[i].length; j++)
			{
				sum += a[j][i];
			}
			System.out.print(sum +" ");
		}
	}
	
	public static void display(int a[][])
	{
		for(int x[]:a)
		{
			System.out.println(Arrays.toString(x));
		}
	}
	
	public static void main(String[] args) {
		int a[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		
//		Displaying 
		ColWiseSum.display(a);
		ColWiseSum cs = new ColWiseSum();
		cs.colSum(a);
	}
}
