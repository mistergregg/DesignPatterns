package com.collabera.statedesignpattern;

public class NoCash implements ATMState
{
	ATMMachine atmMachine;
	
	public NoCash(ATMMachine newATMMachine)
	{
		atmMachine = newATMMachine;
	}

	@Override
	public void insertCard()
	{
		System.out.println("We dont have money!");
	}

	@Override
	public void ejectCard()
	{
		System.out.println("We dont have money!, You didnt enter a card");
	}

	@Override
	public void insertPin(int pinEnetered)
	{
		System.out.println("We dont have money!");
	}

	@Override
	public void requestCash(int cashToWithdraw)
	{
		System.out.println("We dont have money!");
	}

}
