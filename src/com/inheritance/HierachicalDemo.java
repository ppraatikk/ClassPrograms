package com.inheritance;
class Food{
	String type;
}
class Veg extends Food{
	String name ;
	int price;
	void add()
	{
		name="Panner";
		price=270;
		type = "Veg";
	}
	void show()
	{
		System.out.println(name+" "+price+" "+type);
	}
}
class NonVeg extends Food{
	String name;
	int price;
	void insert()
	{
		name="Biryani";
		price =250;
		type="NonVeg";
	}
	void display()
	{
		System.out.println(name+" "+price+" "+type);
	}
}
public class HierachicalDemo {

	public static void main(String[] args) {
		
		Veg v = new Veg();
		NonVeg nv= new NonVeg();
		nv.insert();
		nv.display();
		
		v.add();
		v.show();
		
	}

}
