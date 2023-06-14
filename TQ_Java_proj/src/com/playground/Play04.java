package com.playground;
import java.util.*;

public class Play04 {
	
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9,0};		
		
		ArrayList<Integer> al = new ArrayList(Arrays.asList(nums));
		
		for(int n:nums)
		{
			System.out.print(n +" ");
			al.add(n);
		}
		System.out.println(al);
		
	}

}
