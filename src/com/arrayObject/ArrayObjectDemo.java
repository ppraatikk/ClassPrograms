package com.arrayObject;

class Student{
	int id;
	String name;
	String Class;
	
	public Student(int id,String name,String Class)
	{
		this.id=id;
		this.name=name;
		this.Class=Class;
	}
	public String toString()
	{
		return id+" "+name+" "+Class;
	}
}

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
		Student s[] = new Student[3];
		s[0]=new Student(11,"Raj","10th");
		s[1]=new Student(13,"ASDF","9th");
		s[2]=new Student(122,"ZXCV","8th");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		for(Student x:s)
		{
			System.out.println(x);
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].id+" "+s[i].name+" "+s[i].Class);
		}
		
	}

}
