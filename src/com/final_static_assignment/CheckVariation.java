package com.final_static_assignment;

public class CheckVariation {
	   static int x=199;
	   String name="SSS";
	
	public static void display()
	{
		CheckVariation c = new CheckVariation();
		System.out.println(x+" "+c.name);
	}
	public void show()
	{
		System.out.println(x+" "+name);
	}

	public static void main(String[] args) {
		CheckVariation c= new CheckVariation(); 
		System.out.println(x+" "+c.name);
		
		c.display();
		c.show();

	}

}
