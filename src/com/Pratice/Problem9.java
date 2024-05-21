package com.Pratice;

import java.util.Arrays;
import java.util.Scanner;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e)
	{
		return this.id-e.id;
	}
	
}
public class Problem9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp[] = new Employee[5];
		
//		emp[0]=new Employee(1,"Ram",56000);
//		emp[1]=new Employee(2,"Sham",48000);
//		emp[2]=new Employee(4,"Pratik",57000);
//		emp[3]=new Employee(5,"Rohan",56000);
//		emp[4]=new Employee(3,"Amit",56000);
		
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("ENter id");
			int id=sc.nextInt();
			
			System.out.println("ENter NAme");
			String name=sc.next();
			
			System.out.println("Enter Salary");
			int salary=sc.nextInt();
			
			Employee e=new Employee(id,name,salary);
			emp[i]=e;
			
			//emp[i]=new Employee(id,name,salary);
		}
		
		
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));
		
		
		
		
		
		
		for(int i=0;i<emp.length;i++)
		{
			int count=0;
			for(int j=0;j<emp.length;j++)
			{
			  if(emp[i].salary==emp[j].salary)
			   {
				//System.out.println(emp[i]);
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
