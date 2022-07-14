package com.azn.shop;

public class Camera extends Item 
{
	String make;
	

	public Camera(int price, String make)
	{
		super(price);
		this.make = make;
	}

	@Override
	public String toString() {
		return "Camera [Make: " + make + ", Price: " + price + "]";
	}

	@Override
	public String getDescription() 
	{
		return "Camera [Make: " + make + "]";
	}

	@Override
	public int getPrice() 
	{
		return price;
	}

}
