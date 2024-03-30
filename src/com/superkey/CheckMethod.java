package com.superkey;

class Property{
	int price = 99999;
	void display()
	{
		System.out.println("Property Price : "+price);
	}
}
class House extends Property{
	String address = "Latur";
	void display()
	{
		super.display();
		System.out.println("House Address :"+address);
	}
	
}




public class CheckMethod {

	public static void main(String[] args) {
		
		House h = new House();
		h.display();
				
	}

}
