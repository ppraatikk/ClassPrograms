package com.constructor;

public class ThisUse {
	int id;
	String name;
	String address;
	
	public ThisUse()
	{
		this(12,"asdf","Pune");
		System.out.println("This is drfault constructor wihout parameter");
	}
	public ThisUse(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.display();
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+address);
	}

	public static void main(String[] args) {
		
		ThisUse t = new ThisUse();
		
	}

}
