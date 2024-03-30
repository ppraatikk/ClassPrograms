package com.class_object;

public class Student {
	
	int id;
	String name;
	int marks;
	String address;
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=134;
		s1.name="Pratik";
		s1.marks=89;
		s1.address="Latur";
		
		System.out.println(s1.id+" "+s1.name+" "+s1.marks+" "+s1.address);
	}

}
