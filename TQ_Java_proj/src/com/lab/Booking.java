package com.lab;
import java.util.Scanner;

public class Booking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person Name: ");
		String cname = sc.next();
		System.out.println("Choose movie to watch:\n1.RRR\n2.KGF\n3.DDLJ");
		int mchoice = sc.nextInt();
		System.out.println("Do you have any coupon? \nIf yes Enter coupan code.\nelse Enter 0: ");
		int coupon = sc.nextInt();
		sc.close();
		
		switch(mchoice)
		{
		case 1: Movie mv=new Movie(101, "RRR", 350);
		System.out.println("Hello "+cname+"!"+"\nYour ticket price is Rs "+mv.getPrice(coupon)+"\nEnjoy your show!");
		break;
		case 2: Movie mv2=new Movie(102, "KGF", 360);
		System.out.println("Hello "+cname+"!"+"\nYour ticket price is Rs "+mv2.getPrice(coupon)+"\nEnjoy your show!");
		break;
		case 3: Movie mv3=new Movie(103, "DDLJ", 340);
		System.out.println("Hello "+cname+"!"+"\nYour ticket price is Rs "+mv3.getPrice(coupon)+"\nEnjoy your show!");
		break;
		default: System.out.println("Invalid Choice!");
		}
		
	}

}
