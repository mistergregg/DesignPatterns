package com.collabera.commanddesignpattern;

public class Television implements Device
{
	private int volume = 0;
	
	@Override
	public void on()
	{
		System.out.println("TV is On");
	}

	@Override
	public void off()
	{
		System.out.println("TV is Off");
	}

	@Override
	public void volumeUp()
	{
		volume++;
		System.out.println("TV volume is at " + volume);
	}

	@Override
	public void volumeDown()
	{
		volume--;
		System.out.println("TV volume is at " + volume);
	}

}
