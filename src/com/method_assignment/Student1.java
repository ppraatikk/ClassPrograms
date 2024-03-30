package com.method_assignment;
//add method displayData inside Student class change
//values of id name in that method & also print the changed
//values in same method. Call displayData method from
//main method and see the output. Observe displayData can
//only be called by creating object of Student

public class Student1 {
	int id;
	String name;
	public void displayData()
	{
		
		System.out.println("ID : "+id+" "+"Name : "+name);
	}
	public void insertData(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
public static void main(String[] args) {
		
		Student1 s =new Student1();
		s.insertData(2,"Pratik");
		s.displayData();
	}

}



	