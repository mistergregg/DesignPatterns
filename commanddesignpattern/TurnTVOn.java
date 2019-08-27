package com.collabera.commanddesignpattern;

public class TurnTVOn implements Command
{

	Device theDevice;
	
	public TurnTVOn(Device newDevice)
	{
		theDevice = newDevice;
	}
	
	@Override
	public void execute()
	{
		theDevice.on();
	}

	@Override
	public void undo()
	{
		theDevice.off();
	}
	
}
