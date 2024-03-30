package com.final_static_assignment;

class Game{
	 final int x;
	 Game(int x)  // Final initialize once
	 {
		 this.x=x;
		 System.out.println(x);   //final assign value using constructor
	 }
	 final public void show()
	 {
		 System.out.println("Show method is final");
	 }
}
class Pubg extends Game{   // cannot make parent class final because we cannot extendit it
	Pubg()
	{
	super(2);	
	}
//	@Override          // cannot override final method
//	public void show()
//	{
//		System.out.println("show method in child class");
//	}
	
}
public class Problem8 {

	public static void main(String[] args) {
			Pubg p = new Pubg();
			p.show();

	}

}                                                                                                                                                                                                                             
