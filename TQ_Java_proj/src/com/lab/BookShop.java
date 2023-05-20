package com.lab;
import java.util.Scanner;

public class BookShop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Boook bk = new Boook();
		bk.setB_id(101);
		bk.setB_name("Zero to One");
		bk.setB_price(399);
		
		System.out.println("To get discount on book '"+bk.getB_name()+"' Enter the Promo Code: ");
		String promo = sc.nextLine(); // PROMO == 30OFF
		bk.setPromo(promo);
		
		System.out.println("Thank you for buying '"+bk.getB_name()+"'\nYour bill is Rs."+bk.getB_price());
		
	}

}
