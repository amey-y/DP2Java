package com.array;
import java.util.Arrays;

public class ArrayMerge {
//	WAP to merge 2 arrays in a third array without any duplicate element.
	
	public static void merger(int arr1[], int arr2[])
	{
		for(int i=0; i<arr1.length; i++)
		{
			boolean isDuplicate = false;
			int count = 1;
			int count2 = 0;
			for(int k=i-1; k>=0; k--)
			{
				if(arr1[i] == arr1[k])
				{
					isDuplicate = true;
					break;
				}
			}
			if(isDuplicate == false)
			{
				for(int j=i+1; j<arr1.length; j++)
				{
					if(arr1[i] == arr1[j])
					{
						count++;
					}
				}
				if(count == 1)
				{
					
					count2++;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr1[] = {4, 5, 9, 5, 12, 16, 8};
		int arr2[] = {6, 11, 12, 13, 16, 12};
		
		int arr3[] = new int[arr1.length+arr2.length];
		
	}

}
