package com.array;

import java.util.Arrays;

public class ArrayDivby3 {
//	WAP to create integer type of Array. If array contains any element which is divisible by 3.
//	then replace it by 0 (zero).
	public boolean divBy3(int a)
	{
		boolean isDivisible = false;
		if(a%3==0)
		{
			isDivisible = true;
		}
		return isDivisible;
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 3, 45, 68, 99, 7, 5, 36, 48};
		System.out.println(Arrays.toString(arr));
		
		ArrayDivby3 ad = new ArrayDivby3();
		
		for(int i=0; i<arr.length; i++)
		{
			if(ad.divBy3(arr[i]))
			{
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
