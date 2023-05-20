package com.lab;
import java.util.Scanner;

public class ATM_Transact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int secureCode = 9211, balance = 1000, i = 0;
		char ch;
		boolean isPIN = false;
		
		while(i<3)		// to check PIN match and give max 3 attempts.
		{
			System.out.println("Welcome to SBI ATM\nPlease Enter Your PIN: ");
			int pin = sc.nextInt();
			if(pin==secureCode)
			{
				isPIN = true;		// if entered PIN matches successfully then isPIN = true & it breaks the while loop.
				break;
			}
			else {
				i++;		// it increments number of attempts.
				System.out.println("You Entered the wrong PIN "+ i +" time(s)\nYou have "+ (3-i) +" more attempt(s) remaining.");
			}
		}
		
		if(isPIN)
		{
			do {
			System.out.println("Welcome to SBI ATM.\nEnter the transaction number you want to continue:");
			System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("How much money you want to deposit?");
				int deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("Rs."+deposit +" deposited.\nYour current balance is Rs."+balance);
			break;
			
			case 2: System.out.println("How much money you want to withdraw?");
				int withdraw = sc.nextInt();
				if(withdraw<balance)
				{
					balance = balance - withdraw;
					System.out.println("Rs."+withdraw +" withdrawed.\nYour current balance is Rs."+balance);
				}
				else {
					System.out.println("Not enough balance!");
				}
			break;
			
			case 3: System.out.println("Your account balance is: "+ balance);
			break;
			
			case 4: System.out.println("Thank you for Banking with us!");
				System.exit(0);
			break;
			
			default: System.out.println("Invalid choice! Please select a valid choice.");
			
			}
			System.out.println("Do you want to Continue? (Y/N): ");		// Giving choice to continue and storing that into 'ch'
			ch = sc.next().charAt(0);
			}while(ch=='y' || ch == 'Y');	// if input is y/Y >> loop continues.
			System.out.println("Thank you for Banking with us!");
		}
		else {
			System.out.println("\nYou have entered incorrect PIN for 3 times, Your card is blocked.\nContact to your nearest branch to reset your PIN.");
		}
		sc.close();
	}
}
