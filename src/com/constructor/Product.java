package com.constructor;

public class Product {
	int id;
	String name;
	int price;
	
	public Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.display();
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+price);
	}
	

	public static void main(String[] args) {
		
		Product p1=new Product(12,"SADAM",5770);

	}

}
