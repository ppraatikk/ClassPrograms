package com.encapsulation;

public class Student {

	public static void main(String[] args) {
		StudentInfo s=new StudentInfo();
		
		s.setId(10);
		s.setName("Pratik");
		s.setMarks(90);
		s.setPlace(true);
		
		System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks()+" "+s.getPlace());
		
	}

}
