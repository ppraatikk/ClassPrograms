package com.arrayObject_Assignment;

import java.util.Scanner;

class Student{
	int rollno;
	String name;
	int age;
	int mark;
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setMark(int mark)
	{
		this.mark=mark;
	}
	public int getRollno()
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getMark()
	{
		return mark;
	}
}
public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st[] = new Student[4];
		
		System.out.println("Enter ARray Details");
		for(int i=0;i<st.length;i++)
		{
			Student s = new Student();
			System.out.println("Enter RollNo");
			s.setRollno(sc.nextInt());
			System.out.println("Enter NAme");
			s.setName(sc.next());
			System.out.println("Enter Age");
			s.setAge(sc.nextInt());
			System.out.println("Enter MArks");
			s.setMark(sc.nextInt());
			st[i]=s;
		}
		System.out.println("Enter deatils Of Student");
		for(int i=0;i<st.length;i++)
		{
          System.out.println(st[i].getRollno()+" "+st[i].getName()+" "+st[i].getAge()+" "+st[i].getMark());
		}
		System.out.println("Info Of Student who's marks>60 and age<15");
		for(int i=0;i<st.length;i++)
		{
		 if(st[i].getAge()<15 && st[i].getMark()>60)
		 {
		  System.out.println(st[i].getRollno()+" "+st[i].getName()+" "+st[i].getAge()+" "+st[i].getMark());
		 }
		}
		

	}

}
