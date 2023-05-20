package com.loopsPrctice;

public class series03 {

	public static void main(String[] args) {
//		2,7,10,63,26,....
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i*i*i-1 +" ");
				continue;
			}
			else
			{
				System.out.print(i*i+1 +" ");
			}
		}
	}

}
