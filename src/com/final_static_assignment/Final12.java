package com.final_static_assignment;

class Charging{
	private void show() //Private type of method in parent class 
	{
		System.out.println("Charging");
	}
}
class Ola extends Charging{
	 void display()  //method in child class
	{
		//super.show();                 //Private method of parent class is not 
		                               // accessible in child class using super keyword
		System.out.println("OLA");
		
	}
}
public class Final12 {

	public static void main(String[] args) {
		Ola o = new Ola(); //creating child class object
		o.display();  // calling child class method using object of child class

	}
         //Answer  == private method of parent class cannot be 
}       //          Accessible in child class or cannot be inherited in child class
