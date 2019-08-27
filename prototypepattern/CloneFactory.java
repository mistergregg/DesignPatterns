package com.collabera.prototypepattern;

public class CloneFactory
{
	public Animal getClone(Animal animalSample)
	{
		return animalSample.makeCopy();
	}
}
