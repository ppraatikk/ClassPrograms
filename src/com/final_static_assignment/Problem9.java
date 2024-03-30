package com.final_static_assignment;
class Gamee{
	public void show()
	{
		System.out.println("Parent class instance method1----------------");
	}
	public void show1()
	{
		this.show();
		System.out.println("parent class instance method2-------");
	}
	
}
class Cricket extends Gamee{
	public void display()
	{
		this.show();
		super.show1();
		System.out.println("Child class instance method1---");
	}
	public void display1()
	{
		this.display();
		System.out.println("Child class instance method2--");
	}
	
}
public class Problem9 {
	
	

	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.display1();
				

	}

}
