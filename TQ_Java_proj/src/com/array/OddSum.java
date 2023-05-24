package com.array;
import java.util.Arrays;

public class OddSum {
	
	public static int arraySum(int nums[])
	{
		int sum = 0;
		for(int x:nums)
		{
			if(x%2!=0)
			{
				sum += x;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
//		WAP to perform the sum of odd elements from the array.
		 int nums[] = new int[]{15, 2, 4, 9, 11, 55, 56, 58, 89, 88, 0, 77, 99, 40};
		 
		 System.out.println(Arrays.toString(nums));
		 System.out.println(OddSum.arraySum(nums));
		
	}

}
