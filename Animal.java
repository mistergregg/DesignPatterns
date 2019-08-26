package com.collabera;

public class Animal
{
	private String name;
	private int weight;
	private String sound;
	
	
	// You would add this instead of creating a new subclass
	// because behavior isn't tied to this class
	public Flys flyingType;
	
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setWeight(int newWeight)
	{
		if(newWeight > 0)
			weight = newWeight;
		else
			System.out.println("Weight must be bigger than 0");
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void setSound(String newSound)
	{
		sound = newSound;
	}
	
	public String getSound()
	{
		return sound;
	}
	
	public String tryToFly()
	{
		return flyingType.fly();
	}
	
	public void setFlyingSbility(Flys newFlyType)
	{
		flyingType = newFlyType;
	}
}
