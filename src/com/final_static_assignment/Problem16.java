package com.final_static_assignment;

public class Problem16 {
	public static void show(int x,float y)
	{
		System.out.println("int float "+x+" "+y);
	}
	public static void show(float x, int y)
	{
		System.out.println("float int "+x+" "+y);
	}
	public static void show(int x,int y)
	{
		System.out.println("int int "+x+" "+y);
	}
	public static void show(float x,long y)
	{
		System.out.println("float long "+x+" "+y);
	}

	public static void main(String[] args) {
		
		Problem16 p = new Problem16();
		p.show(1,2f);
		p.show(3f,4);
		p.show(5,6);
		p.show(7f,8);
		
	}

}
