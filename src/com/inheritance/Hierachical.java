package com.inheritance;
class Fruitt{
	String categery;
}
class Mangoo extends Fruitt {
	int price;
	String colour;
	void add()
	{
		price =90 ;
		colour="yellow";
		categery="Fruit";
	}
	void show()
	{
	System.out.println(price+" "+colour+" "+categery);
	}
}
class Orange extends Fruitt {
	int price;
	String colour;
	void insert()
	{
		price = 80;
		colour="orange";
		categery="Fruit";
	}
	void display()
	{
		System.out.println(price+" "+colour+" "+categery);
	}
}
public class Hierachical {

	public static void main(String[] args) {
		
		Orange o = new Orange();
		o.insert();
		o.display();
		
		Mangoo mg = new Mangoo();
		mg.add();
		mg.show();
	}

}
