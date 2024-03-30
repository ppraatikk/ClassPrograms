package com.classProgram;

//Design an interface Shape with methods calculateArea() and calculatePerimeter(). 
//Implement classes Rectangle and Circle that implement the Shape interface. 
//The Rectangle class should have length and width, while the Circle class should have a radius. 
//Implement methods to calculate area and perimeter for both shapes. Finally, create instances 
//of both shapes and print their areas and perimeters.


interface Shape{
	    double calculateArea();
	    double calculatePerimeter();
}
class Rectangle implements Shape{
	public int length;
	public int breadth;
	
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double calculateArea()
	{
		return length*breadth;
	}
	public double calculatePerimeter()
	{
		return 2*(length*breadth);
	}
}
class Circle implements Shape{
	public double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public double calculateArea()
	{
		return 3.14*radius*radius;
	}
	public double calculatePerimeter()
	{
		return 2*3.14*radius;
	}
}

public class Inteface_demo {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(5,4);
		System.out.println(r.calculateArea()+"        "+r.calculatePerimeter());
		
		Circle c = new Circle(3);
		System.out.println(c.calculateArea()+"        "+c.calculatePerimeter());
	}

}
