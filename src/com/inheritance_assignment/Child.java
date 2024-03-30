package com.inheritance_assignment;

class Kid{
	
	String name;
	int quantity;
	public void readBook()
	{
		System.out.println("Parameter less method");
	}
	public void readBook(String name,int quantity)
	{
		this.name=name;
		this.quantity=quantity;
		System.out.println(name+" "+quantity+" Parameterised Method");
	}
}
class BigKid extends Kid{
	@Override
	public void readBook()
	{
		System.out.println("BigKid Class is Override");
	}
}
class Teenager extends Kid{
	@Override
	public void readBook()
	{
		System.out.println("Teenager Class is Override");
	}
}
public class Child {

	public static void main(String[] args) {
		Kid k = new Kid();
		k.readBook();
		k.readBook("Kite",12);
		
		BigKid b = new BigKid();
		b.readBook();
		
		Kid k1 = new BigKid();
		Kid k2 = new Teenager();	
		k1.readBook();
		k2.readBook();
	}

}
