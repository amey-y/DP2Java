package com.loopsPrctice;

public class ContinueBreak_1 {

	public static void main(String[] args) {

//		Write code to display numbers between 1 to 50. If any number is divisible by 3 OR 5, skip that number.
		
		for(int i=1; i<=50; i++)
		{
			if(i%3==0 || i%5==0)
			{
				continue;
			}
			System.out.print(i +" ");
		}
		
		System.out.print("\n");
		
//		Write code to display numbers between 1 to 50. If any number is divisible by 3 AND 5, skip that number.
	
		for(int i=1; i<=50; i++)
		{
			if(i%3==0 && i%5==0)
			{
				continue;
			}
			System.out.print(i +" ");
		}
		
	}

}
