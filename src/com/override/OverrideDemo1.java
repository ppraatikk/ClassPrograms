package com.override;

class Animal{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Lion extends Animal{
	@Override
	void eat()
	{
		System.out.println("Lion is eating");
	}
}

class Dog extends Animal{
	@Override
	void eat()
	{
		System.out.println("Dog is eating");
	}	
}

public class OverrideDemo1{

	public static void main(String[] args) {
		
		Lion l = new Lion();
		l.eat();
	}

}
