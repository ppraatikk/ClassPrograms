package com.acess_Modifier_Assignmemnt;

public class StudentInfo {

	public static void main(String[] args) {
		Student s = new Student();
	//System.out.println(s.rollno);  // Private not acessable in other class but same package
		System.out.println(s.admissionno); // protected 
		System.out.println(s.ageId);   	   // default 
		System.out.println(s.courseId);    // public
		
		//s.doPrivate();   // private not acessable in other class but same package
		s.doProtected(); //protected
		s.doDefault();   //default
		s.doPublic();   //public
		
	}

}
