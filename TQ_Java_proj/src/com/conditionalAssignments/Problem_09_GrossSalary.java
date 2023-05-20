package com.conditionalAssignments;
import java.util.Scanner;

public class Problem_09_GrossSalary {

	public static void main(String[] args) {
/*		2. Write a Java program to input basic salary of an employee and calculate its
		Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%,
		DA = 90% Basic Salary >20000 : HRA = 30%, DA = 95%
*/
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Basic Salary: ");
		double basic = sc.nextDouble();
		sc.close();
		
		double gross;
		if(basic<=10000)
		{
			gross = basic + (basic*0.2) + (basic*0.8);
			System.out.println("Gross Salary is "+ gross);
		}
		else if(basic<=20000)
		{
			gross = basic + (basic*0.25) + (basic*0.9);
			System.out.println("Gross Salary is "+ gross);
		}
		else
		{
			gross = basic + (basic*0.3) + (basic*0.95);
			System.out.println("Gross Salary is "+ gross);
		}
		
	}

}
