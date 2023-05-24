package com.array;
import java.util.Scanner;
import java.util.Arrays;

public class MaxMinElement {
//	WAP to find maximum and minimum element from the array.
	public static void findMaxMin(int arr[])
	{
		int maxNum = arr[0];
		int minNum = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(maxNum < arr[i])
			{
				maxNum = arr[i];
			}
			if(minNum > arr[i])
			{
				minNum = arr[i];
			}
		}
		System.out.println("Max Number = "+ maxNum +"\nMin Num = "+ minNum);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[] = new int[8];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
		MaxMinElement.findMaxMin(arr);
	}
}
