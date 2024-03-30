package com.method_Overloading;

public class Area {
	
	public void area(float pi,float rad)
	{
	 System.out.println("Area of circle : "+(pi*rad*rad)); 	
	}
	public void area (int len,int bre)
	{
		System.out.println("Area of Reactangle : "+ (len*bre));
	}
	public void area(double base,double height)
	{
		double res=base*height;
		System.out.println("Area of Triangle : "+(res/2));
	}
	public void area( int len)
	{
		System.out.println("Area of Square : "+(len*len));
	}

	public static void main(String[] args) {
		
		Area a=new Area();
		a.area(3.14f,5);
		a.area(10,20);
		a.area(5.0,3.0);
		a.area(70);
	}

}
