package com.collabera.adapterdesign;
import java.util.Random;

public class EnemyTank implements EnemyAttacker
{

	Random generate = new Random();
	
	@Override
	public void fireWeapon()
	{
		int attackDamage = generate.nextInt(10) + 1;
		System.out.println("Enemy tank does " + attackDamage + " damage");
	}

	@Override
	public void driveForward()
	{
		int movement = generate.nextInt(5) + 1;
		
		System.out.println("Enemy tank moves " + movement + " spaces");
	}

	@Override
	public void assignDriver(String driver)
	{
		System.out.println(driver + " is driving the tank");
	}

}
