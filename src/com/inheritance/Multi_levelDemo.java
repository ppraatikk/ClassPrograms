package com.inheritance;
class Animal{
	String atype;
}
class PetAnimal extends Animal{
	String ptype;
}
class Dog extends PetAnimal{
	int legs;
	String name;
	String colour;
	
	void insert()
	{
		legs=4;
		name="turbo";
		colour="White";
		ptype="Veg";
		atype="NotWild";
	}
	void display()
	{
	System.out.println(legs+" "+name+" "+colour+" "+ptype+" "+atype);
	}
}
public class Multi_levelDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
			d.insert();
			d.display();
			
				

	}

}
