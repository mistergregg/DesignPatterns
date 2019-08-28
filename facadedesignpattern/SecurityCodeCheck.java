package com.collabera.facadedesignpattern;

public class SecurityCodeCheck
{
	private int securityCode = 1234;
	
	public int getSecurityCode()
	{
		return securityCode;
	}
	
	public boolean isCodeCorrect(int seCodeToCheck)
	{
		if(securityCode == getSecurityCode())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

