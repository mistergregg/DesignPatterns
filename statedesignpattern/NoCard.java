package com.collabera.statedesignpattern;

public class NoCard implements ATMState
{
	ATMMachine atmMachine;
	
	public NoCard(ATMMachine newATMMachine)
	{
		atmMachine = newATMMachine;
	}

	@Override
	public void insertCard()
	{
		System.out.println("Please enter a PIN");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard()
	{
		System.out.println("Enter a card first");
	}

	@Override
	public void insertPin(int pinEnetered)
	{
		System.out.println("Enter a card first");
	}

	@Override
	public void requestCash(int cashToWithdraw)
	{
		System.out.println("Enter a card first");
	}

}
