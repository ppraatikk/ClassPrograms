package com.class_object;

public class Shopping {
	
	int id;
	String name;
	int price;
	int quantity;
	int bill;
	
	public void accept(int pid,String pname,int pprice,int pquantity)
	{
		id=pid;
		name=pname;
		price=pprice;
		quantity=pquantity;
	}
	public void calculate()
	{
		if(quantity>0)
		{
			bill=price*quantity;
			display();
		}
		else
		{
			System.out.println("Error");
		}
		
	}
	public void display()
	{
	System.out.println(id+" "+name+" "+price+" "+quantity+" "+bill);
	}

	public static void main(String[] args) {
		Shopping s1=new Shopping();
		s1.accept(102,"Fan",2000,3);
		s1.calculate();
		//s1.display();

	}

}
