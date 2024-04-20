package com.treeMap_Demo;
import java.util.*;

class Student{
	int id;
	String name;
	int marks;
	public Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		
		ArrayList<Student>a1=new ArrayList<>();
		a1.add(new Student(1,"Java",50));
		a1.add(new Student(2,"C",40));
		a1.add(new Student(1,"C",35));
		a1.add(new Student(3,"Python",30));
		a1.add(new Student(1,"C++",50));
		a1.add(new Student(2,"Java",40));
		
		TreeMap<Integer,Integer>tm=new TreeMap<>();
		
		for(Student s:a1)
		{
			int total=0;
			if(tm.containsKey(s.id))
			{
				total=total+tm.get(s.marks);
			}
		}
		
	}

}
