package com.collabera.factorypattern;

import java.util.Scanner;

public class EnemyShipFactoryTesting
{
	public static void main(String[] args)
	{
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of ship? (U / R / B)");
		
		if(userInput.hasNext())
		{
			String typeOfShip = userInput.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if(theEnemy != null)
			doStuffEnemy(theEnemy);
		else
			System.out.println("Enter a U, R, or B next time!");
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip)
	{
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
