package com.ArrayListDemo;
import java.util.*;
class Student{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public static void display(LinkedList<Student>st)
	{
		Iterator<Student>itr=st.iterator();
		while(itr.hasNext())
		{
		
			Student s=itr.next();
			if(s.marks>60)
			{
				System.out.println(s);
			}
			 
			
		}
	}
	
	
}
public class LinkedListCustomDemo1 {
	
	public static void main(String[] args) {
		
		LinkedList<Student>st=new LinkedList<>();
		System.out.println("Enter Student Details");
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter studentId");
			int id=sc.nextInt();
			System.out.println("Enter StudentName");
			String name=sc.next();
			System.out.println("Enter Marks");
			int marks=sc.nextInt();
			
			st.add(new Student(id,name,marks));
			
//			Student s=new Student(id,name,marks);
//			st.add(s);
		}
		
		for(Student s:st)
		{
			System.out.println(s);
		}
		System.out.println("/////////////////////");
		Iterator<Student>itr=st.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s);
			
			//System.out.println(e.id+" "+e.name+" "+e.marks);
		}
		
		System.out.println("/////////////////////");
		Student.display(st);
		
	}

}
