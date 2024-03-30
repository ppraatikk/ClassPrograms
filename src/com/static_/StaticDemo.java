package com.static_;

public class StaticDemo {
	static int x=10;
	 int y=20;
	 
	  public void show()
	  {
		  System.out.println(x);
		  System.out.println(y);
	  }
	  public static void display()
	  {
		  StaticDemo s1=new StaticDemo();
		  System.out.println(x);
		  System.out.println(s1.y);
	  }

	public static void main(String[] args) {
		StaticDemo s= new StaticDemo();
		System.out.println(x);
		System.out.println(s.y);
		System.out.println("---------------");
		s.show();
		System.out.println("------------");
		s.display();
		System.out.println("-----------------");
		StaticDemo.display();  // we call static method using class name without object 
							   // creation
	}

}
