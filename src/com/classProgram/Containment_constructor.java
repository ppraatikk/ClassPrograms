package com.classProgram;

class District{
	 String name;
	District(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
}
class Address{
	 int pincode;
	 District dist;
	   Address(int pincode,District dist)
	   {
		   this.pincode=pincode;
		   this.dist=dist;
	   }
	   public String toString()
	   {
		   return pincode+"  "+dist;
	   }
	
}
public class Containment_constructor {
	 int id;
	 String name;
	 Address adr;
	Containment_constructor(int id,String name,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public String toString()
	{
		return id+" "+name+" "+adr;
	}
			

	public static void main(String[] args) {
		
		District d = new District("Latur");
		Address a = new Address(413512,d);
		Containment_constructor cc = new Containment_constructor(11,"ASD",a);
		System.out.println(cc);
	}

}
