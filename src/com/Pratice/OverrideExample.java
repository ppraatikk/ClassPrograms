package com.Pratice;

class Animal{
	 public void eat()
	{
		 
		System.out.println("Animal Eating");
	}
	
}
class Dog extends Animal{
	@Override
	 public void eat()
	{
		System.out.println("Dog is Eating");
		
	}
}
public class OverrideExample {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
	}

}
