package com.collabera.bridgedesignpattern;

public class DVDRemote extends RemoteButton
{

	public DVDRemote(EntertainmentDevice newDevice)
	{
		super(newDevice);
	}

	@Override
	public void buttonNine()
	{
		System.out.println("DVD Button 9");
	}

}
