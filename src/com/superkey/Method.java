package com.superkey;

class Iphone{
	void getPrice()
	{
		System.out.println("Iphone price : "+999);
	}
}
class Apple extends Iphone {
	
	void getPrice()
	{
		super.getPrice();
		System.out.println("Apple price : "+9999);
	}
}




public class Method {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.getPrice();

	}

}
