package com.twoDArray;

import java.util.Arrays;

public class TwoDaddition {
//	WAP Create 2 2D Arrays & Perform the Addition of both Arrays.
	
//	Method to perform addition
	public int[][] addition(int a[][], int b[][])
	{
		int addition[][] = new int[a.length][a.length];
	
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				addition[i][j] = a[i][j] + b[i][j];
//				Printing each addition
				System.out.print(addition[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
//		Returning the new array
		return addition;
	}
	
	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int b[][] = {{17,18,19,20}, {21,22,23,24}, {25,26,27,28}, {29,30,31,32}};
		
		TwoDaddition tda = new TwoDaddition();
//		Calling method and accepting returned value/array and Displaying one row at a time.
		for(int x[]:tda.addition(a, b))
		{
			System.out.println(Arrays.toString(x));
		}
	}
}
