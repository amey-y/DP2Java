package com.lab07june;

public class Book {
	private int id;
	private String bookName;
	private int price;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	
	public int getPrice()
	{
		return price;
	}
	
}
