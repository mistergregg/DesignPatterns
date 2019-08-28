package com.collabera.bridgedesignpattern;

public class TestTheRemote
{
	public static void main(String[] args)
	{
		RemoteButton theTv = new TVRemoteMute(new TVDevice(1,200));
		
		RemoteButton theTv2 = new TVRemotePaused(new TVDevice(1, 200));
		
		//RemoteButton theDVD = new DVDRemote(new TVDevice(1, 14));
		
		System.out.println("Test TV with Mute");
		theTv.buttonFivePressed();
		theTv.buttonSixPressed();
		theTv.buttonNine();
		
		System.out.println("\nTest TV with Pause");
		
		theTv2.buttonFivePressed();
		theTv2.buttonSixPressed();
		theTv2.buttonSixPressed();
		theTv2.buttonSixPressed();
		theTv2.buttonSixPressed();
		theTv2.buttonNine();
		theTv2.deviceFeedback();
	}
}
