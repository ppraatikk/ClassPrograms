package com.Pratice;

class Electronics{
	int price;
	
	Electronics(int price)
	{
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("Electronics "+price);
	}
	
}
class Computer extends Electronics{
	int price;
	
	Computer(int price)
	{
		super(999);
		this.price=price;
	}
	public void show()
	{
		super.display();
		System.out.println("Computer "+price);
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		
		Computer comp=new Computer(89);
		comp.show();
		comp.display();
	}

}
