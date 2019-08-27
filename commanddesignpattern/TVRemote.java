package com.collabera.commanddesignpattern;

public class TVRemote
{
	public static Device getDevice()
	{
		return new Television();
	}
}
