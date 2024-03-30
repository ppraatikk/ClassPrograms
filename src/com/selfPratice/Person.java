package com.selfPratice;

public class Person {
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("name: "+name+"   "+"age: "+age);
	}

	public static void main(String[] args) {
		Person p1 = new Person("Gajanan",11);
		p1.display();

	}

}
