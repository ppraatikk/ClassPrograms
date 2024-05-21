package com.Pratice;


abstract class Shape{
	
	abstract double area();
	abstract void display();
	public void print()
	{
		System.out.println("Concrete Method / Non abstract method");
	}
}

class Circle extends Shape{
	
	double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	@Override
	double area()
	{
		return 3.14*radius*radius;
	}
	@Override
	  void display()
	{
		System.out.println("Area of circle "+this.area());
	}
}
class Rectangle extends Shape{
	double len;
	double bre;
	Rectangle(double len,double bre)
	{
		this.len=len;
		this.bre=bre;
	}
	@Override
	double area()
	{
		return len*bre;
	}
	@Override
	void display()
	{
		System.out.println("Area Of Rectangle "+this.area());
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		
		Shape s1=new Circle(5);
		s1.display();
		s1.print();
		
		
		Shape s2=new Rectangle(10,20);
		s2.display();
		s2.print();
	}

}
