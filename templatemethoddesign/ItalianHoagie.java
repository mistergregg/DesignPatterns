package com.collabera.templatemethoddesign;

public class ItalianHoagie extends Hoagie
{
	String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = {"Provolone"};
	String[] veggisUsed = {"Lettuce", "Tomatoe", "Oinions", "Sweet Peppers" };
	String[] condimentsUsed = {"Oil", "Vinegar" };
	
	@Override
	void addMeat()
	{
		System.out.print("Adding the meat: ");
		
		for(String meat : meatUsed)
			System.out.print(meat + " ");
	}

	@Override
	void addCheese()
	{
		System.out.print("Adding the cheese: ");
		
		for(String cheese : cheeseUsed)
			System.out.print(cheese + " ");
	}

	@Override
	void addVegtables()
	{
		System.out.print("Adding the veggis: ");
		
		for(String veggi : veggisUsed)
			System.out.print(veggi + " ");
	}

	@Override
	void addCondiments()
	{
		System.out.print("Adding the condiments: ");
		
		for(String condiment : condimentsUsed)
			System.out.print(condiment + " ");
	}

}
