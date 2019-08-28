package com.collabera.templatemethoddesign;

public class VeggiHoagie extends Hoagie
{
	String[] veggisUsed = {"Lettuce", "Tomatoe", "Oinions", "Sweet Peppers" };
	String[] condimentsUsed = {"Oil", "Vinegar" };
	
	@Override
	boolean customerWantsMeat()
	{
		return false;
	}
	
	@Override
	boolean customerWantsCheese()
	{
		return false;
	}
	
	@Override
	void addMeat()
	{
		
	}

	@Override
	void addCheese()
	{
		
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
