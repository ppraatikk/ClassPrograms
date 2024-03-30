package com.containment_assignment;

class Address{
	String country;
	String state;
	String city;
	
	public Address(String country,String state,String city)
	{
		this.country=country;
		this.state=state;
		this.city=city;
	}
	/*public void show1()
	{
		System.out.println(country+" "+state+" "+city);
	}*/
	
	public String toString()
	{
		return country+" "+state+" "+city;
	}
}
public class Person {
	String name;
	String gender;
	  int age;
	 Address adr;
	 
	 public Person(String name,String gender,int age,Address adr)
	 {
		 this.name=name;
		 this.gender=gender;
		 this.age=age;
		 this.adr=adr;
	 }
	/* public void show2()
	 {
		 System.out.println(name+" "+gender+" "+age);
		 adr.show1();
	 }*/
	 
	 public String toString()
	 {
		 return name+" "+gender+" "+age+" "+adr;
	 }
	public static void main(String[] args) {
		//Address adr = new Address("India","Maharashtra","Latur");
		//Person p= new Person("Sham","Male",25,adr);
		//p.show2();
		
		Person p = new Person("sham","Male",25,new Address("India","Maharashtra","Latur"));
		System.out.println(p);
	}

}
