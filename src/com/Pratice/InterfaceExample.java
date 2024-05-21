package com.Pratice;

interface Showable{
	int x=10;
	
	public void print();
	
	public static void show()
	{
		System.out.println("Static Method");
	}
	
	default void display()
	{
		System.out.println("Default Method");
		
	}
}

class Myclass implements Showable{
	@Override
	public void print()
	{
		System.out.println("Abstract Method");
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		Showable.show();
		System.out.println(Showable.x);
		
		Myclass obj = new Myclass();
		obj.print();
		
	}

}
