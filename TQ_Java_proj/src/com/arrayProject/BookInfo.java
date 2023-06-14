package com.arrayProject;

import java.util.Scanner;

public class BookInfo {
	
	public void createBook()
	{
		
	}
	
	public void createAuthor()
	{
		
	}
	
	public void showBook()
	{
		
	}
	
	public void updateBook()
	{
		
	}
	
	public void deleteBook()
	{
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of books you want to add: ");
		int books = sc.nextInt();
		Book[] book = new Book[books];
		
		for(int i=0; i<book.length; i++)
		{
			System.out.println("Enter Book Details: ");
			System.out.println("Enter Book Id: ");
			int bookId = sc.nextInt();
			System.out.println("Enter Book's Name: ");
			String bookName = sc.nextLine();
			System.out.println("Enter Book's Price: ");
			double price = sc.nextDouble();
			System.out.println("Enter Author Details: ");
			
		}
		
	}

}
