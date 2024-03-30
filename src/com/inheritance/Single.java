package com.inheritance;
class Computer{ 
	String bname;
	void insert1()
	{
		bname="asus";
	}
}
class Asus extends Computer{
	int modelno;
	String colour;
	int price;
	void insert2()
	{
		modelno=12312;
		colour="white";
		price= 45000;
	}
	void display()
	{
		System.out.println(modelno);
		System.out.println(colour);
		System.out.println(price);
		System.out.println(bname);
	}
}

public class Single {

	public static void main(String[] args) {
		
    Asus a = new Asus();
    a.insert1();
    a.insert2();
    a.display();
	}

}
