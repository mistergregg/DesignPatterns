package com.collabera.facadedesignpattern;

public class FundsCheck
{
	private double cashInAccount = 1000;
	
	public double getCashInAccount()
	{
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn)
	{
		cashInAccount -= cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposited)
	{
		cashInAccount += cashDeposited;
	}
	
	public boolean haveEnough(double cashToWithdraw)
	{
		if(cashToWithdraw > getCashInAccount())
		{
			System.out.println("You dont have enough money");
			System.out.println("Current balance: " + getCashInAccount());
			
			return false;
		}
		else
		{
			decreaseCashInAccount(cashToWithdraw);
			System.out.println("Withdrawl Complete: Current Balanace: " + cashInAccount);
			
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit)
	{
		increaseCashInAccount(cashToDeposit);
		
		System.out.println("Deposit Complete: Current Balance: " + getCashInAccount());
	}
}
