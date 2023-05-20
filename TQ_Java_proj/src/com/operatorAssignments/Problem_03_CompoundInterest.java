package com.operatorAssignments;
import java.util.Scanner;

public class Problem_03_CompoundInterest {

	public static void main(String[] args) {
//		3. Write a Java program to enter P, T, R and calculate Compound Interest.
//		FV = P*(1+R/N)^(N*T)
//		where FV is the future value of the loan or investment,
//		P is the initial principal amount, R is the annual interest rate, 
//		N represents the number of times interest is compounded per year, and T represents time in years.
		Scanner sc=new Scanner(System.in);
		long principal, rate, term, fv;
		System.out.println("***Compound Interest Calculator***\nEnter the Principal Amount: ");
		principal = sc.nextLong();
		System.out.println("Enter the Interest Rate: ");
		rate = sc.nextLong();
		System.out.println("Enter the Term in years: ");
		term = sc.nextLong();
		sc.close();
		long pow = 1;
		for(int i=1; i<=term; i++)
		{
			pow = (1+rate)*pow;
		}
		fv = principal * pow;
		System.out.println(fv);
	}

}
