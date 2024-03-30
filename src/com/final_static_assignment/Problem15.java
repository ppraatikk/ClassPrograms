package com.final_static_assignment;

public class Problem15 {
	public void show(int num)
	{
		System.out.println("int method");
	}
	public void show(float num)
	{
		System.out.println("float method");
	}
	public void show(long num)
	{
		System.out.println("long method");
	}
	public void show(double num)
	{
		System.out.println("double method");
	}

	public static void main(String[] args) {
		
		Problem15 p = new Problem15();
		p.show(1f);
		
	}

}
