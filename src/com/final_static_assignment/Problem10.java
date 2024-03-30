package com.final_static_assignment;

class Player{
	public static void show()
	{
		System.out.println("Parent class static method1");
	}
	public static void show1()
	{
		Player.show();
		System.out.println("Parent class static method2");
	}
	
}
class Rohit extends Player{
	public static void display()
	{
		Rohit.show1();
		System.out.println("child class static method1");
	}
	public static void display1()
	{
		                          // this and super cannot use in static method
		Rohit.display();
		//super.show();
		//this.display();
		System.out.println("child class Static method2");
	}
}
public class Problem10 {

	public static void main(String[] args) {
		Rohit.display1();
    }
}
