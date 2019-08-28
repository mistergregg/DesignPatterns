package com.collabera.bridgedesignpattern;

public class TVRemotePaused extends RemoteButton
{

	public TVRemotePaused(EntertainmentDevice newDevice)
	{
		super(newDevice);
	}

	@Override
	public void buttonNine()
	{
		System.out.println("TV was Paused");
	}

}
