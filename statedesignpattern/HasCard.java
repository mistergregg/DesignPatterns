package com.collabera.statedesignpattern;

public class HasCard implements ATMState
{

	ATMMachine atmMachine;
	
	public HasCard(ATMMachine newATMMachine)
	{
		atmMachine = newATMMachine;
	}
	
	@Override
	public void insertCard()
	{
		System.out.println("You cant eneter more then one card.");
	}

	@Override
	public void ejectCard()
	{
		System.out.println("Card Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEnetered)
	{
		if(pinEnetered == 1234)
		{
			System.out.println("Correct Pin");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}else
		{
			System.out.println("Wrong Pin");
			atmMachine.correctPinEntered = false;
			System.out.println("Card Ejected");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cashToWithdraw)
	{
		System.out.println("Enter PIN First");
	}

}
