package com.constructor_Overloading;

public class Area
{
	 public Area()
	 {
		 int side = 5;
		 System.out.println("Area Of Square : "+side*side); 
	 }
	 public Area(int len,int bre)
	 {
		 int res=len*bre;
		 System.out.println("Area Of Rectangle : "+res);
	 }
	 public Area(float radius)
	 {
		 System.out.println("Area Of Circle : "+3.14*radius*radius);
	 }

	public static void main(String[] args) {
		
		Area a1=new Area();
		
		Area a2=new Area(10,5);
		Area a3=new Area(5.0f);
	}

}
