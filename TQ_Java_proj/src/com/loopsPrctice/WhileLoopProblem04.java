package com.loopsPrctice;
import java.util.Scanner;

public class WhileLoopProblem04 {

	public static void main(String[] args) {
//		Do While Loop
//		Write code to create a menu driven program to calculate the Area for 
//		1.Circle, 2.Rectangle, 3.Square, 4.Triangle.
		
		Scanner sc=new Scanner(System.in);
		char ch;
		
		do
		{
			System.out.println("Select a choice number to calculate Area for: \n1. Circle\n2. Rectangle\n3. Square\n4.Triangle");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Area of Circle.\nEnter the Radius value: ");
			int radius = sc.nextInt();
			System.out.println("Area of given circle is "+ (2*3.14*radius));
			break;
			
			case 2: System.out.println("Area of Rectangle.\nEnter the Length value: ");
			int length = sc.nextInt();
			System.out.println("Enter the Width value: ");
			int width = sc.nextInt();
			System.out.println("Area of given Rectangle is "+ (length *width));
			break;
			
			case 3: System.out.println("Area of Square.\nEnter the length of side: ");
			int side = sc.nextInt();
			System.out.println("Area of given Square is "+ (side*side));
			break;
			
			case 4: System.out.println("Area of Triangle.\nEnter the base value: ");
			int base = sc.nextInt();
			System.out.println("Enter the Height value: ");
			int height = sc.nextInt();
			System.out.println("Area of given Triangle is "+ ((base*height)/2));
			break;
			
			default: System.out.println("Invalid Choice!");
			}
			
			System.out.println("Do you want to Continue? (Y/N): ");
			ch = sc.next().charAt(0);
			
		} while(ch=='y' || ch=='Y');
		sc.close();
		
	}

}
