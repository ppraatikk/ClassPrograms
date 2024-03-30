package com.abstract_assignment;

abstract class Parent{
	int x;
	abstract void cook();
	void wash()
	{
		System.out.println("Washing");
	}
	Parent(int x)    // Parameterized Constructor
	{
		this.x=x;
		System.out.println(x);
	}
}
class Child extends Parent{
	  void cook()
	  {
		  System.out.println("Cooking");
	  }
	  Child(int x)
	  {
		super(x);  
	  }
}
public class Problem5 {

	public static void main(String[] args) {
		
		Child c = new Child(999);
		c.cook();
		c.wash();
	}

}
