package com.final_static_assignment;

public class Problem4 {
	public void show(int x)
	{
		System.out.println(x);
	}
	public void show(int x,int y )
	{
		System.out.println(x+"   "+y);
	}
	public void show(float x,int y)
	{
		System.out.println(x+"   "+y);
	}
	public void show(int x,float y)
	{
		System.out.println(x+"   "+y);
	}

	public static void main(String[] args) {
		
		Problem4 p = new Problem4();
		p.show(1);
		p.show(1,2);
		p.show(1f,2);
		p.show(1,2f);

	}

}
