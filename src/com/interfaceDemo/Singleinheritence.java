package com.interfaceDemo;

class Colour {
	static {
		System.out.println("Parent Static Block");
	}
	Colour()
	{
		System.out.println("Parent Constructor");
	}
	 
	{
		System.out.println("Parent Initializer");
	}
	
}
class Red extends Colour{
	static {
		System.out.println("child Static Block");
	}
	Red()
	{
		System.out.println("child Constructor");
	}
	 
	{
		System.out.println("child Initializer");
	}
}

public class Singleinheritence {

	public static void main(String[] args) {

		Red r = new Red();
		
	}

}
