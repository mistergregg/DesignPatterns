package com.collabera.bridgedesignpattern;

public class TVRemoteMute extends RemoteButton
{

	public TVRemoteMute(EntertainmentDevice newDevice)
	{
		super(newDevice);
	}

	@Override
	public void buttonNine()
	{
		System.out.println("TV was Muted");
	}

}
