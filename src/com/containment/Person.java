package com.containment;
class Address{
	String city;
	int pincode;
	
	public Address(String city,int pincode)
	{
		this.city=city;
		this.pincode=pincode;
	}
	public void showAddress()
	{
		System.out.println("City "+city+" "+"pincode "+pincode);
	}
}
public class Person {
	int id;
	String name;
	Address adr ;
	public Person(int id,String name ,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public void showPerson()
	{
		System.out.println("id "+id+" "+"name "+name);
		adr.showAddress();
	}

	public static void main(String[] args) {
		
		Person p = new Person(12,"SS",new Address("ltr",413512));
		p.showPerson();
	}

}
