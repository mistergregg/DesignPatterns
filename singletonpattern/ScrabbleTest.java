package com.collabera.singletonpattern;
import java.util.LinkedList;

public class ScrabbleTest
{
	public static void main(String[] args)
	{
		//Creates a new Instance
		Singleton newInstance = Singleton.getInstance();
		
		//Displays the New Instance ID and the total tiles on that instance
		System.out.println("Instanace 1 ID: " + System.identityHashCode(newInstance));;
		System.out.println(newInstance.getLetterList());
		
		//Takes 7 tiles out of instance
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		//Displays Player 1's 7 tiles
		System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println("");
		
		
		System.out.println("");
		
		//Creates an instance two but its the same instance because Singleton
		Singleton instanceTwo = Singleton.getInstance();
		
		//Takes 7 tiles out
		LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
		
		//Shows the instance ID but it should be the same
		System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
		
		//Displays the tiles left in instance
		System.out.println(instanceTwo.getLetterList());
		
		//Shows player 2s tiles
		System.out.println("Player 2: " + playerTwoTiles);
	}
}
