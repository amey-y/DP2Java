package com.loopsPrctice;

public class forLoopOddCount1_20 {

	public static void main(String[] args) {
		
		int oddCount = 0;
		for(int i=1; i<=20; i++)
		{
			if(i%2!=0)
			{
				oddCount++;
			}
		}
		System.out.println(oddCount);
	}

}
