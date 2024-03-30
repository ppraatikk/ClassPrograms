package com.final_static_assignment;

public class Check5 {
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void add(float x)
	{
		System.out.println(x);
	}
//	public void add(int x,int y)    
//	{ 
//		System.out.println(x+y);
//	}


	public static void main(String[] args) {
		
		Check5 c = new Check5();
		c.add(1, 2);
		c.add(4f);
		
	}

}
