package com.loopsPrctice;

public class ContinueBreak_2 {

	public static void main(String[] args) {

//		Display numbers between 1 to 20. If the number is 2 digit number then stop the display process.
		
		for(int i=1; i<=20; i++)
		{
			if(i>=10) break;
			System.out.print(i +" ");
		}
		
	}

}
