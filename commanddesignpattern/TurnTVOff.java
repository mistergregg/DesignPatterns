package com.collabera.commanddesignpattern;

public class TurnTVOff implements Command
{

	Device theDevice;
	
	public TurnTVOff(Device newDevice)
	{
		theDevice = newDevice;
	}
	
	@Override
	public void execute()
	{
		theDevice.off();
	}

	@Override
	public void undo()
	{
		theDevice.on();
	}
	
}
