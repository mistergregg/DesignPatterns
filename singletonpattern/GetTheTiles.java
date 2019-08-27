package com.collabera.singletonpattern;

import java.util.LinkedList;

public class GetTheTiles implements Runnable
{

	@Override
	public void run()
	{
		Singleton newInstance = Singleton.getInstance();
		
		//Shows the instance ID but it should be the same
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		//Displays the tiles left in instance
		System.out.println(newInstance.getLetterList());
		
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player: " + playerOneTiles);
		
		System.out.println("Got Tiles");
	}

}
