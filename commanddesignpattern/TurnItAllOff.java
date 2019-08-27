package com.collabera.commanddesignpattern;
import java.util.List;

public class TurnItAllOff implements Command
{

	List<Device> theDevices;
	
	public TurnItAllOff(List<Device> newDevices)
	{
		theDevices = newDevices;
	}
	
	@Override
	public void execute()
	{
		for(Device device: theDevices)
		{
			device.off();
		}
	}

	@Override
	public void undo()
	{
		for(Device device: theDevices)
		{
			device.on();
		}
	}
	
}
