package com.inheritance;
class Fruit{
	String colour;
	
}
class Mango extends Fruit{
	String name ;
	int price ;
	
	void display()
	{
		System.out.println("Fruit name "+name);
		System.out.println("Fruit colour " +colour);
		System.out.println("Fruit price "+price);
	}
	void insert()
	{
		colour="yellow";
		name="Mango";
		price = 90;
	}
}
public class SingleDemo {

	public static void main(String[] args) {
		Mango m=new Mango();
		m.insert();
		m.display();		
	}

}
