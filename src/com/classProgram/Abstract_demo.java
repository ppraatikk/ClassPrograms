package com.classProgram;

abstract class Animal{
	int age;
	String name;
	Animal(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	abstract void makeSound();
	 String getName()
	{
		return name;
	}
	 int getAge()
	 {
		 return age;
	 }
}
class Dog extends Animal{
	Dog(String name,int age)
	{
		super(name,age);
	}
	void makeSound()
	{
		System.out.println("Bhaoo");
	}
}
class Cat extends Animal{
	Cat(String name,int age)
	{
		super(name,age);
	}
	void makeSound()
	{
		System.out.println("Meowww");	
	}
}

public class Abstract_demo {

	public static void main(String[] args) {
		
		Animal d = new Dog("Tommy",5);
		Animal c = new Cat("Siza",6);
		
		System.out.println(d.getName()+" "+d.getAge());
		System.out.println(c.getName()+" "+c.getAge());
	}

}
