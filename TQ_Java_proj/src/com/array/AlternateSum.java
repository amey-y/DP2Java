package com.array;
import java.util.Arrays;
public class AlternateSum {
	
	public static int sum(int nums[])
	{
		int sum = 0;
		for(int i=0; i<nums.length; i++)
		{
			if(i%2==0)
			{
				sum += nums[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
//		WAP to perform the sum of alternate element from the array.
		int nums[] = new int[]{15, 2, 4, 9, 11, 55, 56, 58, 89, 88, 0, 77, 99, 40};
		
		System.out.println(Arrays.toString(nums));
		System.out.println(AlternateSum.sum(nums));
	}

}
