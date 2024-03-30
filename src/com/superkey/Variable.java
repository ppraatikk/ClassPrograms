package com.superkey;

class Flower{
	String colour="Pink";
}
class Rose extends Flower{
	String name = "Rose";
	String colour = "Red";
	
	void show()
	{
		System.out.println(name+" "+colour);
		System.out.println(name+" "+super.colour);
	}
}
public class Variable {

	public static void main(String[] args) {
		
		Rose r = new Rose();
		r.show();
	}

}
