package com.collabera.decoratordesign;

public class TomatoeSauce extends ToppingDecorator
{

	public TomatoeSauce(Pizza newPizza)
	{
		super(newPizza);
		
		System.out.println("Adding Tomatoe Sauce");
	}
	
	public String getDescription()
	{
		return tmpPizza.getDescription() + ", Tomatoe Sauce";
	}
	
	public double getCost()
	{
		return tmpPizza.getCost() + .35;
	}
}