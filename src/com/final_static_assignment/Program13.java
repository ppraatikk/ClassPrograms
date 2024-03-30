package com.final_static_assignment;

public class Program13 {
	final int x;
	Program13()    // initialize only in constructor
	{
		this.x=11;
		System.out.println(x);
	}
	Program13(final int x)  //initialize only in constructor
	{
		this.x=12;
		System.out.println(x);
	}
	public void show(final int x)
	{
		System.out.println(x);		
	}
	public static void show1(final int x)
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		Program13 p1 = new Program13();
		Program13 p2 = new Program13(12);
		p1.show(13);
		Program13.show1(14);
	}

}
