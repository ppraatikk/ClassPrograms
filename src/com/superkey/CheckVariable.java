package com.superkey;

class Person{
    String type="Male";
	
}
class Student extends Person{
	String type ="Female";
	void display()
	{
		System.out.println("Person : "+super.type);
		System.out.println("Student : "+type);
	}
}
public class CheckVariable {

	public static void main(String[] args) {
		Student s = new Student();
		s.display();
	}

}
