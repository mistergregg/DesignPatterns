package com.collabera.templatemethoddesign;

public abstract class Hoagie
{
	boolean afterFirstCondiment = false;
	
	final void makeSandwich()
	{
		cutBun();
		
		if(customerWantsMeat())
		{
			addMeat();
			
			afterFirstCondiment = true;
		}
		
		if(customerWantsCheese())
		{
			if(afterFirstCondiment)
			{
				System.out.println();
			}
			
			addCheese();
			
			afterFirstCondiment = true;
		}
		
		if(customerWantsVegtables())
		{
			if(afterFirstCondiment)
			{
				System.out.println();
			}
			
			addVegtables();
			
			afterFirstCondiment = true;
		}
		
		if(customerWantsCondiments())
		{
			if(afterFirstCondiment)
			{
				System.out.println();
			}
			
			addCondiments();
			
			afterFirstCondiment = true;
		}
		
		wrapTheHoagie();
	}
	
	public void cutBun()
	{
		System.out.println("Bun is cut");
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegtables();
	abstract void addCondiments();
	
	// If user wants to override and return false they can
	boolean customerWantsMeat()
	{
		return true;
	}
	
	boolean customerWantsCheese()
	{
		return true;
	}
	
	boolean customerWantsVegtables()
	{
		return true;
	}
	
	boolean customerWantsCondiments()
	{
		return true;
	}
	
	public void wrapTheHoagie()
	{
		System.out.println("\nWrap the hoagie");
	}
}
