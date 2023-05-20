package com.labTest;

public class AlternatePrime {

	public static void main(String[] args) {
//		WAP to print Alternate Prime number between 1 to 20.
		int count = 0;
		boolean flag = false;
		
		for(int i=1; i<=20; i++)
		{
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					break;
				}
				else {
					flag = true;
					count++;
				}
			}
			if(flag && count%2!= 0)
			{
				System.out.print(i +" ");
				flag = false;
			}
		}
		
	}

}
