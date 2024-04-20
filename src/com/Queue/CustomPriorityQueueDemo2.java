package com.Queue;
import java.util.*;

class Student{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
class Name implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s2.name.compareTo(s1.name);
	}
}

class Id implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s2.id-s1.id;
	}
}

class Mark implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return s2.marks-s1.marks;
	}
}
public class CustomPriorityQueueDemo2 {

	public static void main(String[] args) {
		
		PriorityQueue<Student>pq=new PriorityQueue<>(new Id());

		pq.add(new Student(1,"Prateek",79));
		pq.add(new Student(2,"Pranav",67));
		pq.add(new Student(3,"Rohan",84));
		pq.add(new Student(4,"Yash",99));
		pq.add(new Student(5,"Amit",93));
		pq.add(new Student(6,"Gajanan",54));
		
		for(Student s:pq)
		{
			System.out.println(s);
		}

		System.out.println("////////////////////////////////////////////////////");
		
		pq.poll();
		
		for(Student s:pq)
		{
			System.out.println(s);
		}
	}

}
