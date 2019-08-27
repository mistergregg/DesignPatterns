package com.collabera.commanddesignpattern;
import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote
{
	public static void main(String[] args)
	{
		// Turn TV ON
		Device newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		// Turn TV Off
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		
		// Turn Volume Up
		
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(volUpCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		// Turn off multiple devices
		
		Television theTv = new Television();
		Radio theRadio = new Radio();
		
		List<Device> allDevices = new ArrayList<Device>();
		
		allDevices.add(theTv);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();
		
		// Undo the devices
		
		turnThemOff.pressUndo();
	}
}
