package com.arrayObject_Assignment;

import java.util.Scanner;

class MyDate{
	int date;
	String month;
	int year;
	public MyDate(int date,String month,int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
	}
	public String toString()
	{
		return date+" "+month+" "+year;
	}
}
class Dept{
	int did;
	String dname;
	public Dept(int id , String name )
	{
		this.did=id;
		this.dname=name;
	}
	public String toString()
	{
		return did+" "+dname;
	}
}
class Employ{
	int id;
	String name;
	double salary;
	MyDate mydate;
	Dept dept;
	public Employ(int id,String name,double salary,MyDate mydate,Dept dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.mydate=mydate;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" "+mydate+" "+dept;
	}
}
public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ emp[]=new Employ[3];
		System.out.println("Enter Array Info");
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter id");
			int id =sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter Salary");
			double salary =sc.nextDouble();
			System.out.println("Enter date");
			int date=sc.nextInt();
			System.out.println("enter month");
			String month = sc.next();
			System.out.println("Enter year");
			int year=sc.nextInt();
			System.out.println(" dept id");
			int did =sc.nextInt();
			System.out.println("dept name");
			String dname=sc.next();
			
			MyDate md=new MyDate(date,month,year);
			Dept dt=new Dept(did,dname);
			Employ e=new Employ(id,name,salary,md,dt);
			emp[i]=e;
		}
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
		System.out.println("Employee Belongs to Same dept name ");
		for(int i=0;i<emp.length;i++)
		{
			int count =0;
			for(int j=0;j<emp.length;j++)
			{
				if(emp[i].dept.dname.equals(emp[j].dept.dname))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(emp[i]);
			}
			
		}
				
		

	}

}
