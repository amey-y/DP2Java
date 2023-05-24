package com.array;

public class ShowEvenPosition {
	
	public static void Even(int nums[])
	{
		for(int i=0; i<nums.length; i++)
		{
			if(i%2!=0)
			{
				System.out.print(nums[i] +" ");
			}
		}
	}

	public static void main(String[] args) {
//		WAP to display even position elements from the array.
		int nums[] = new int[]{15, 2, 4, 9, 11, 55, 56, 58, 89, 88, 0, 77, 99, 40};
		
		ShowEvenPosition.Even(nums);
		
	}

}
