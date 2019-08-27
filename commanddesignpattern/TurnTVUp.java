package com.collabera.commanddesignpattern;

public class TurnTVUp implements Command
{

	Device theDevice;
	
	public TurnTVUp(Device newDevice)
	{
		theDevice = newDevice;
	}
	
	@Override
	public void execute()
	{
		theDevice.volumeUp();
	}

	@Override
	public void undo()
	{
		theDevice.volumeDown();
	}
	
}
