package com.lab;
import java.util.Scanner;

public class Book {
	int id;
	String name;
	double price;
	String a_name;
	
	public Book(int id, String name, double price, String a_name)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.a_name = a_name;
	}
	
	public double showBook(String a_name)
	{	
		if(a_name.equals(a_name))
		{
			price = price - 50;
		}
		else {
			price = price - 0;
		}
		return price;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Author Name: ");
		String aname = sc.nextLine();
		sc.close();
		
		Book bk=new Book(101, "HP Philosopher's Stone", 799.0, "J.K. Rowling");
		System.out.println("ID: "+ bk.id +"\nBook Name: "+ bk.name +"\nAuthor Name: "+bk.a_name +"\nPrice: "+bk.showBook(aname));
	}
}
