package com.azn.shop;

public class Main 
{

	public static void main(String[] args) 
	{
		Item [] items = getInventory();
		for (Item i : items)
		{
			System.out.println(i.getDescription() + ", Sale Price: " + i.getPrice());
		}
		
	}	
		
	static public Item[] getInventory()
	{
		Item [] items = new Item[] 
				{
						new Book (15, "Naruto Shippuden", "Masashi Kishimoto"),
						new Book (15, "Bleach", "Tite Kubo"),
						new Computer(1000, "32-Core", "64-GB Ram", "2TB-Solid State"),
						new Computer(1500, "64-Core", "128-GB Ram", "4TB-Solid State"),
						new Camera (55, "Canon"),
						new Camera (120, "Nikon"),
						new Game (65, "Grand Theft Auto V", "M"),
						new Game (65,"Naruto Ultimate Ninja Storm 4", "T")	
				};
		return items;
	}
		


}
