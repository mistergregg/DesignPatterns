package com.collabera.abstractfactorypattern;

public abstract class EnemyShip
{
	private String name;
	private double amtDamage;
	ESWeapon weapon;
	ESEngine engine;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public double getDamage()
	{
		return amtDamage;
	}
	
	public void setDamage(double newDamage)
	{
		amtDamage = newDamage;
	}
	
	abstract void makeShip();
	
	public String toString()
	{
		String infoOnShip = "The " + name + " has a top speed of " + engine
				+ " and an attack power of " + weapon;
		
		return infoOnShip;
	}
	
	public void followHeroShip()
	{
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayEnemyShip()
	{
		System.out.println(getName() + " is on the screen");
	}
	
	public void enemyShipShoots()
	{
		System.out.println(getName() + " attacks and does " + getDamage());
	}
}