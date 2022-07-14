package com.azn.shop;

public class Game extends Item 
{
	String title, rating;
	//char rating
	
	//public Game(int price, String title, char)
	public Game(int price, String title, String rating) 
	{
		super(price);
		this.title = title;
		this.rating = rating;
	}

	@Override
	public String getDescription() 
	{
		return "Game: [Title: " + title + "Rating: " + rating + "]";
	}

	@Override
	public int getPrice() 
	{
		return price;
	}

	@Override
	public String toString() 
	{
		return "Game [Title: " + title + ", Rating: " + rating + ", Price: " + price + "]";
	}
	
	// *******************************************************************************
/*
	String title; 
	char rating;
	

	public Game (int price, String title, char rating)
	{
		super(price);
		this.title = title;
		this.rating = rating;
	}

	@Override
	public String getDescription() 
	{
		return "Game: [Title: " + title + "Rating: " + rating + "]";
	}

	@Override
	public int getPrice() 
	{
		return price;
	}

	@Override
	public String toString() 
	{
		return "Game [Title: " + title + ", Rating: " + rating + ", Price: " + price + "]";
	}
*/	
	
	
	
	
	
	
	
	
}
