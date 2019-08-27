package com.collabera.decoratordesign;

public class Mozzarella extends ToppingDecorator
{

	public Mozzarella(Pizza newPizza)
	{
		super(newPizza);
		
		System.out.println("Adding dough");
		
		System.out.println("Adding Moz");
	}
	
	public String getDescription()
	{
		return tmpPizza.getDescription() + ", Mozzarella";
	}
	
	public double getCost()
	{
		return tmpPizza.getCost() + .5;
	}
}
