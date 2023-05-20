package com.conditionalAssignments;
import java.util.Scanner;

public class Problem_10_ElectricityCalc {

	public static void main(String[] args) {
/*		Write a Java program to input electricity consumption unit and calculate total electricity bill according to the given
		condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit
		above 250 Rs. 1.50/unit // An additional surcharge of 20% is added to the bill
*/
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter total units: ");
		double units = sc.nextDouble();
		sc.close();
		
		double bill;
		if(units<=50)
		{
			bill = units * 0.5;
			bill = bill + (bill*0.2);
			System.out.println(bill);
		}
		else if(units<=150)
		{
			bill = (50*0.5) + ((units-50)*0.75);
			bill = bill + (bill*0.2);
			System.out.println(bill);
		}
		else if(units<=250)
		{
			bill = (50*0.5) + (100*0.75) + ((units-150)*1.2);
			bill = bill + (bill*0.2);
			System.out.println(bill);
		}
		else
		{
			bill = (50*0.5) + (100*0.75) + (100 * 1.2) + ((units-250)*1.5);
			bill = bill + (bill*0.2);
			System.out.println(bill);
		}
	}

}
