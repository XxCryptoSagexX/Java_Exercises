package com.azn.shop;

public class Computer extends Item 
{

	String cpu, memory, disk;
	
	
	public Computer(int price, String cpu, String memory, String disk) 
	{
		super(price);
		this.cpu = cpu;
		this.memory = memory;
		this.disk = disk;
	}

	@Override
	public String getDescription() 
	{
		return "Computer [CPU: " + cpu + "Memory: " + memory + "Disk: " + disk + "]";
	}

	@Override
	public int getPrice() 
	{
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String toString() {
		return "Computer [CPU: " + cpu + ", Memory: " + memory + ", Disk: " + disk + ", Price: " + price + "]";
	}

}
