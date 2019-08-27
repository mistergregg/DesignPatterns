package com.collabera.abstractfactorypattern;

public class EnemyShipTesting 
{
	public static void main(String[] args) 
	{
		UFOEnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();
		
		EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
		
		System.out.println(theGrunt + "\n");
		
		EnemyShip theBoss = MakeUFOs.orderTheShip("UFO Boss");
		System.out.println(theBoss + "\n");
	}
}