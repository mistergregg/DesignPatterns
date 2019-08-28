package com.collabera.templatemethoddesign;

public class SandwichSculptor
{
	public static void main(String[] args)
	{
		Hoagie cust12 = new ItalianHoagie();
		
		cust12.makeSandwich();
		
		System.out.println();
		
		Hoagie cust11 = new VeggiHoagie();
		
		cust11.makeSandwich();
	}
}
