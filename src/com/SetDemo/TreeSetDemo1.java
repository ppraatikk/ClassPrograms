package com.SetDemo;
import java.util.*;

class Employee{
	int id;
	String name ;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
class myCom implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return e1.id-e2.id;
	}
}
public class TreeSetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<Employee>ts=new TreeSet<>(new myCom());
		ts.add(new Employee(3,"Prateek",34567));
		ts.add(new Employee(4,"Ram",37700));
		ts.add(new Employee(1,"Sham",35600));
		ts.add(new Employee(2,"Yash",67000));
		
		System.out.println(ts);
		

	}

}
