package com.final_static_assignment;
class Person{
	static String myname ="Pratik";
	public static void name()
	{
		System.out.println("Person");
	}
	static void print()
	{
		System.out.println("Print");
	}
}
class Student extends Person{
	static String myname = "Sham";
//	@Override
//	public static void name()
//	{
//		System.out.println("Student");
//	}
	public void show()  //static variable of parent class we can access
	{                   // in child class using super keyword before variable name
		System.out.println(myname+" "+super.myname);
		super.print();  // call static method of parent class 
		               // inherit static method in child class using super keyword
	}
}
public class Check6 {

	public static void main(String[] args) {
		Student s = new Student();
 //		s.name();                        cannot override static method 
		s.show();
		
				

	}

}
