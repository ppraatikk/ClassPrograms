package com.final_static_assignment;

public class Program12 {
	Program12()
	{
		System.out.println("default Constructor");
	}
	Program12(int x)
	{
		System.out.println("Parameterised Constructor "+x);
	}
	static {
		System.out.println("static block");
	}
	public static void display()
	{
		System.out.println("static method");
	}

	public static void main(String[] args) {
		
		Program12 p1 = new Program12();
		Program12 p2 = new Program12(99); 
		Program12.display();
		
	}

}
