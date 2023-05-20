package com.lab;
import java.util.Scanner;
public class Problem05_DoWhileBillGen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		int bill=0;
		do 
		{
			System.out.println("What do want to order? ");
			System.out.println("1.Pizza Rs.199\n2.Puff Rs.29\n3. Cold Drink Rs.20");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("How many pizzas do you want?");
			int quantity = sc.nextInt();
			bill = bill + (199*quantity);
			break;
			
			case 2: System.out.println("How many Puffs do you want?");
			quantity = sc.nextInt();
			bill = bill + (29*quantity);
			break;
			
			case 3: System.out.println("How many Cold Drinks do you want?");
			quantity = sc.nextInt();
			bill = bill + (20*quantity);
			break;
			
			default: System.out.println("Invalid Choice!");
			}
			
			System.out.println("Do you want anything else? (Y/N)");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		sc.close();
		
		System.out.println("Your total bill is Rs."+ bill +"\nEnjoy the Show!");
		
	}
}
