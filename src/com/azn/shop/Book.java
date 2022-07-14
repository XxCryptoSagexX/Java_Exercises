package com.azn.shop;

public class Book extends Item 
{

	String title, author;

	
	public Book(int price, String title, String author) 
	{
		super(price);
		this.title = title;
		this.author = author;
	}

	@Override
	public String getDescription() 
	{
		return "Book [Title: " + title + " Author: " + author + "]";
	}

	@Override
	public int getPrice() 
	{
		return this.price;
	}

	@Override
	public String toString() {
		return "Book [Title: " + title + ", Author: " + author + ", Price: " + price + "]";
	}

}
