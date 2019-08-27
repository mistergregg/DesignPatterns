package com.collabera.decoratordesign;

abstract class ToppingDecorator implements Pizza
{
	protected Pizza tmpPizza;
	
	public ToppingDecorator(Pizza newPizza)
	{
		tmpPizza = newPizza;
	}
	
	public String getDescription()
	{
		return tmpPizza.getDescription();
	}
	
	public double getCost()
	{
		return tmpPizza.getCost();
	}
}
