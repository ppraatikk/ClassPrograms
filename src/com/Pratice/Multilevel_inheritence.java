package com.Pratice;

class Machine{
	public void validity()
	{
		System.out.println("Machine Validity is 10 Years");
	}
}
class Vehicle extends Machine{
	public void name()
	{
		System.out.println("Vechicle Name Is BMW");
	}
}
class Bike extends Vehicle{
	public void colour()
	{
		System.out.println("Bike Colour Is White");
	}
}
public class Multilevel_inheritence {

	public static void main(String[] args) {
	
		Bike b = new Bike();
		b.validity();
		b.name();
		b.colour();

	}

}
