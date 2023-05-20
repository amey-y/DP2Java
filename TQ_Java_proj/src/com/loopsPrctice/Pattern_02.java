package com.loopsPrctice;

public class Pattern_02 {

	public static void main(String[] args) {

		/*			* * * *
		 * 			*     *
		 * 			*     *
		 * 			* * * * 
		 */
		for(int i=1; i<=4; i++)
		{
			for(int j=4; j>=1; j--)
			{
				if((i==2||i==3)&&(j==2||j==3))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
