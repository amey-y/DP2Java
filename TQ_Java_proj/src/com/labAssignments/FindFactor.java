package com.labAssignments;
import java.util.Scanner;

public class FindFactor {

	public static void main(String[] args) {
//		Betsy  teaches her daughter  to find the factors of a given number. 
//		When she provides a number to her daughter, she should tell the factors of that number. 
//		Help her to do this, by writing a program.
//		Write a class FindFactor.java and write the main method in it.
//	Note:	If the input provided is negative, ignore the sign and provide the output. If the input is zero
//		    If the input is zero the output should be “No Factors”.
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if(num<0)
		{
			num = num * -1;
		}
		else if(num==0)
		{
			System.out.println("No Factors");
		}
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.print(i +", ");
			}
		}
	}
}
