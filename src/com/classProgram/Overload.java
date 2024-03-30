package com.classProgram;
// Can it is Possible to Override the Overloaded Method

class Pen{
	void print(int price)
	{
		System.out.println("P pen "+price);
	}
	void print(float price)
	{
		System.out.println("P pen "+price);
	}
	
}
class GelPen extends Pen{
	@Override
	void print(int price)
	{
		System.out.println("C GelPen "+price);
	}
	void print(double price)
	{
		System.out.println("c GelPen "+price);
	}
	
}





public class Overload {

	public static void main(String[] args) {
		GelPen g = new GelPen();
		g.print(1.23f);
		g.print(999);

	}

}
