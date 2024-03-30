package com.superkey_thiskey_assignment;

class Machine{
	String car="Automatic";  //variable
	
	void display()    //method 
	{
		System.out.println("Machine : "+car);
	}
	Machine()   //Constructor
	{
		System.out.println("This is Parent Constructor");
	}
	Machine(int x ,String name) // parametersied  parent Constructor
	{
		System.out.println(x+" "+name);
	}
}
class Car extends Machine{
	String car = "BMW";  //variable
	
	void display()   //method
	{
		System.out.println("----------------------");
		super.display();
		System.out.println("-------------------");
		System.out.println("Machine : "+super.car);
		System.out.println("    Car : "+car);
	}
	Car()   //Constructor
	{
		super();
	  System.out.println("This is Child Constructor ");
	}
	Car(int x,String name) // Parametersied child Constructor
	{
		super(13,"Sham");
		System.out.println(x+" "+name);
	}
}
public class CheckSuperkey {

	public static void main(String[] args) {
		
		Car c = new Car();
		Car cr = new Car(12,"Pratik");
		c.display();
		
	}

}
