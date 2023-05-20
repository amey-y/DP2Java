package com.loopsPrctice;

public class Pattern_04 {

	public static void main(String[] args) {
		/*			D C B A
		 * 			D C B
		 * 			D C
		 * 			D
		 */
		
		for(char i='A'; i<='D'; i++)
		{
			for(char j='D'; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
