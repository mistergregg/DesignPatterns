package com.collabera;

// You cannot create objects from a class marked as abstract
abstract public class Creature
{
	protected String name;
	protected int weight;
	protected String sound;
	
	public abstract void setName(String newName);
	public abstract String getName();
	
	public abstract void setWeight(double newWeight);
	public abstract double getWeight();
	
}
