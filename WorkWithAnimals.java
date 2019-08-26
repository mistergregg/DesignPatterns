package com.collabera;

public class WorkWithAnimals
{
	
	int justANum = 10;
	
	public static void main(String[] args)
	{
		Dog fido = new Dog();
		fido.setName("Fido");
		
		System.out.println(fido.getName());
		
		fido.digHole();
		fido.setWeight(-1);
		
		int randNum = 10;
		
		fido.changeVar(randNum);
		
		System.out.println("randNum after method call: " + randNum);
		
		changeObjectName(fido);
		
		System.out.println("Dog name after method call: " + fido.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kittt says: " + kitty.getSound());
		
		Animal[] animals = new Animal[4];
		
		animals[0] = doggy;
		animals[1] = kitty;
		
		
		System.out.println("Doggy says: " + animals[0].getSound());
		System.out.println("Kittt says: " + animals[1].getSound());
		
		speakAnimal(doggy);
		
		// Because doggy is an animal and not a dog you have to cast
		// the dig hole because that is part of dog
		
		((Dog)doggy).digHole();
		
		// This wont work because its a non static number in a static method
		// System.out.println(justANum);
		
		// This one wont work either cause non static method
		// sayHello();
		
		// This wont work because its private
		// fido.bePrivate();
		
		// To make it work you must call the private method from within the method
		fido.accessPrivate();
		
		Giraffe giraffe = new Giraffe();
		
		giraffe.setName("Frank");
		System.out.println(giraffe.getName());
	}
	
	public static void speakAnimal(Animal randAnimal)
	{
		System.out.println("Animal says: " + randAnimal.getSound());
	}

	public static void changeObjectName(Dog fido)
	{
		fido.setName("Marcus");
	}
	
	public void sayHello()
	{
		System.out.println("Hello");
	}
}
