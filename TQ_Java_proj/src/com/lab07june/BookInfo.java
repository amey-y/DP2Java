package com.lab07june;

import java.util.Scanner;

public class BookInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("..........BookStore.in..........");

		Book bk = new Book();
		bk.setId(101);
		bk.setBookName("java");
		bk.setPrice(600);

		Book bk2 = new Book();
		bk2.setId(102);
		bk2.setBookName("python");
		bk2.setPrice(500);

		int newPrice;
		System.out.println("Enter a book name you want to purchase: ");
		String bkChoice = sc.next().toLowerCase();
		if (bkChoice.equals(bk.getBookName())) {
			newPrice = (bk.getPrice()) - (bk.getPrice() * 10 / 100);
		} else {
			newPrice = bk2.getPrice();
		}
		System.out.println("Book Name: " + bkChoice);
		System.out.println("Book Price: " + newPrice);

	}

}
