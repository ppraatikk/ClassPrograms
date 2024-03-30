package com.override;

class Computer{
	static void display()
	{
		System.out.println("Computer");
	}
	
}
class Laptop extends Computer{
	//@Override
	//static void display()
	{
		System.out.println("Laptop");
	}
	
}
class Pc extends Computer{
	//@Override
	//static void display()
	{
		
		System.out.println("Pc");
	}
	
}
public class OverrideDemo3 {

	public static void main(String[] args) {
		
		Computer c = new Laptop();
		c.display();
	}

}
