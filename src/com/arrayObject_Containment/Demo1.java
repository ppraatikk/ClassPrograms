package com.arrayObject_Containment;

import java.util.Scanner;

class Address{
	int pincode;
	String district;
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public void setDistrict(String district)
	{
		this.district=district;
	}
	public int getPincode()
	{
		return pincode;
	}
	public String getDistrict()
	{
		return district;
	}
}
class Person{
	int id;
	String name;
	Address adr;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAdr(Address adr)
	{
		this.adr=adr;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Address getAdr()
	{
		return adr;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p [] = new Person[4];
		System.out.println("Enter Details Of person");
		for(int i=0;i<p.length;i++)
		{
			Person pp = new Person();
			System.out.println("Enter Person id");
			pp.setId(sc.nextInt());
			System.out.println("Enter Person name");
			pp.setName(sc.next());
			
			System.out.println("ENter Address Details");
			pp.setAdr(new Address());
			Address a=pp.getAdr();
			
			System.out.println("Enter Pincode");
			a.setPincode(sc.nextInt());
			System.out.println("enter District");
			a.setDistrict(sc.next());
			
			
			p[i]=pp;
		}
		for(Person x:p)
		{
			System.out.print(x.getId()+" "+x.getName()+" ");
			Address aa=x.getAdr();
			System.out.println(aa.getPincode()+" "+aa.getDistrict());
		}
//		for(int i=0;i<p.length;i++)
//		{
//			System.out.print(p[i].getId()+" "+p[i].getName()+" ");
//			Address aa = p[i].getAdr();
//			System.out.print(aa.getPincode()+" "+aa.getDistrict());
//		}
	}

}
