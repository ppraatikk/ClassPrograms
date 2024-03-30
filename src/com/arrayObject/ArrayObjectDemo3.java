package com.arrayObject;

class Employe{
	int id;
	String name;
	String address;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
}
public class ArrayObjectDemo3 {

	public static void main(String[] args) {
		
		Employe emp[] = new Employe[2];
		Employe e = new Employe();
		emp[0]=e;
		emp[0].setId(1);
		emp[0].setName("asdf");
		emp[0].setAddress("Latur");
		
		Employe e1 = new Employe();
		emp[1]=e1;
		emp[1].setId(2);
		emp[1].setName("ZXC");
		emp[1].setAddress("Pune");
		
System.out.println(emp[0].getId()+" "+emp[0].getName()+" "+emp[0].getAddress());
System.out.println(emp[1].getId()+" "+emp[1].getName()+" "+emp[1].getAddress());
}
}
