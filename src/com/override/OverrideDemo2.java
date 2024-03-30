package com.override;
class Animall{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Lionn extends Animall{
	@Override
	void eat()
	{
		System.out.println("Lion is Eating");
	}
}
class Dogg extends Animall{
	@Override
	void eat()
	{
		System.out.println("Dog is eating");
	}
	
}

public class OverrideDemo2 {

	public static void main(String[] args) {
	
		Animall al = new Dogg();
		al.eat();
	}

}
