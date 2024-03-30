package com.selfPratice;

public class Circle {
	   float radius;
	   public Circle(float radius)
	   {
		   this.radius=radius;
	   }
	   public float area()
	   {
		 float area = (3.14f*radius*radius);
		 return area;
	   }
	   public float circumference()
	   {
		   float area = (2.0f*3.14f*radius);
		   return area;
	   }

	public static void main(String[] args) {
		Circle c = new Circle(5.0f);
		System.out.println("Area "+c.area());
		System.out.println("Circumference "+c.circumference());
		

	}

}
