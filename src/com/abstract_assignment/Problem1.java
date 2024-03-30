package com.abstract_assignment;

abstract class Machine{
	void rotate()
	{
		System.out.println("Machine Rotate");
	}
	abstract void crush();
}
class Juicer extends Machine{
	@Override
	void crush()
	{
		System.out.println("Crush");
	}
	void filter()
	{
		System.out.println("Filter");
	}
}
abstract class Mixer extends Machine{
	@Override
	void crush()
	{
		System.out.println("Crush.....");
	}
	void blend()
	{
		System.out.println("blend.....");
	}
	
}

public class Problem1 {

	public static void main(String[] args) {
		Juicer j = new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		
		Machine m = new Juicer();
		m.rotate();
		m.crush();
		//m.filter(); //Only filter method is not accessible 
		
		//Machine mx = new Mixer(); we can't able to create object of mixer class
//	  	 mx.blend();
//	  	 mx.crush();
//	  	 mx.rotate();
//				
	}

}
