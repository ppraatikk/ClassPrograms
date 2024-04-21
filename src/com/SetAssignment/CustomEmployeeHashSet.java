package com.SetAssignment;
import java.util.*;

class Employee{
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
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object o)
	{
		Employee e =(Employee)o;
		if(this.id==e.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class CustomEmployeeHashSet {

	public static void main(String[] args) {
		
		HashSet<Employee>hs=new HashSet<>();
		
		hs.add(new Employee(1,"Prateek",15500));
		hs.add(new Employee(2,"Amit",9600));
		hs.add(new Employee(3,"Yash",24500));
		
		System.out.println(hs);
		
		hs.add(new Employee(3,"Yash",24700));
		System.out.println(hs);
		
		
	}

}
