package com.SelfPratice;

public class Rectangle {
	float width;
	float height;
	public Rectangle(Float width,Float height)
	{
		this.height=height;
		this.width=width;
	}
	public float area()
	{
		float area = width*height;
		return area;
	}

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(10f,20f);
		float res = r.area();
		System.out.println("Area of Rectangle : "+res);

	}

}
