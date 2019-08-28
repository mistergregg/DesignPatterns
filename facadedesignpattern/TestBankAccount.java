package com.collabera.facadedesignpattern;

public class TestBankAccount
{
	public static void main(String[] args)
	{
		BankAccountFacade accesingBank = new BankAccountFacade(12345678, 1234);
		
		accesingBank.withdrawCash(50.0);
		
		accesingBank.withdrawCash(900.0);

		accesingBank.depositCash(200.0);
	}
}
