package com.collabera.statedesignpattern;

public interface ATMState
{
	void insertCard();
	void ejectCard();
	void insertPin(int pinEnetered);
	void requestCash(int cashToWithdraw);
	
	
}
