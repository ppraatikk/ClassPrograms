package com.arrayObject;

import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;
	String deptname;
	public Employee(int id,String name,double salary,String deptname)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.deptname=deptname;
	}
	public String toString()
	{
		return id+" "+name+" "+salary+" "+deptname;
	}
	public static void display(Employee emp[])
	{
		for(int i=0;i<emp.length;i++)
		{
			System.out.println(emp[i]);
		}
	}
	public static void salary(Employee emp[])
	{
		for(int i=0;i<emp.length;i++)
		{
			if(emp[i].salary>50000)
			{
				System.out.println(emp[i]);
			}
		}
	}
}
public class ArrayObjectDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[3];
		System.out.println("enter Array details");
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("Enter emp id");
			int id=sc.nextInt();
			System.out.println("Enter emp Name");
			String name=sc.next();
			System.out.println("Enter Salary");
			double salary = sc.nextDouble();
			System.out.println("enter deptname");
			String deptname=sc.next();
			
			Employee e = new Employee(id,name,salary,deptname);
			emp[i]=e;
		 }
		Employee.display(emp);
		System.out.println("Salary Greater Than 50K---------------");
		Employee.salary(emp);
	}

}
