package com.final_static_assignment;

class Electric{
	  public final void show() //final method in parent class
	{
		System.out.println("Electric");
	}
}
class Ather extends Electric{
	 public void display() // method in child class 
	 {
		 super.show(); // calling final method in parent class using super keyward
		 System.out.println("Ather");
	 }
}
public class Final11 {

	public static void main(String[] args) {
		Ather a = new Ather();  // creating object of child class
		a.display(); //calling child class method using object
	}

}
// Ans == Final method of parent class can be
//         inherited in child class   