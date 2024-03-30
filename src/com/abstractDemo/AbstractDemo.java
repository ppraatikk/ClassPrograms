package com.abstractDemo;


abstract class Shape{
	int length;
	int breadth;
	Shape(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	abstract void area();
	abstract void perimeter();
	void show()
	{
		System.out.println("Area And Perimeter of Square and Rectangle");
	}
}
class Square extends Shape{
	Square(int length)
	{
		super(length,0);
	}
	@Override
	void area()
	{
		System.out.println("Area of Square : "+length*length);
	}
	@Override
	void perimeter()
	{
		System.out.println("Perimeter of square : "+(4*length));
	}
	
}
class Rectangle extends Shape{
	Rectangle(int length,int breadth)
	{
		super(length,breadth);
	}
	@Override
	void area()
	{
	System.out.println("Area of Rectangle : "+length*breadth);	
	}
	@Override
	void perimeter()
	{
	 System.out.println("Perimeter of Rectangle : "+2*(length+breadth));	
	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		Shape s1 = new Square(5);
		Shape s2 = new Rectangle(10,5);
		s1.area();
		s1.perimeter();
		s2.area();
		s2.perimeter();
		s1.show();
		
	}

}
