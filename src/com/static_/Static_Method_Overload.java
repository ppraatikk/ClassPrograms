package com.static_;

public class Static_Method_Overload {
	
	public static void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public static void add(float x,float y)
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {
		Static_Method_Overload s = new Static_Method_Overload();
       s.add(2,3);
       s.add(4.0f,3.0f);
	}

}
