package com.ArrayListDemo;
import java.util.*;

class Department{
	int did;
	String dname;
	String dLoaction;
	public Department(int did, String dname, String dLoaction) {
		
		this.did = did;
		this.dname = dname;
		this.dLoaction = dLoaction;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dLoaction=" + dLoaction + "]";
	}
	
}
class Employee{
	int eid;
	String ename;
	double esalary;
	Department dept;
	public Employee(int eid, String ename, double salary, Department dept) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + esalary + ", dept=" + dept + "]";
	}
	
}
class SalaryComparator implements Comparator<Employee>{
	 public int compare(Employee e1,Employee e2)
	 {
		 if(e1.esalary==e2.esalary)
		 {
			 if(e1.dept.dname.equals(e2.dept.dname))
			 {
				 return e1.eid-e2.eid;
			 }
			 else
			 {
				 return e1.dept.dname.compareTo(e2.dept.dname);
			 }
		 }
		 else
		 {
			 return (int)(e1.esalary-e2.esalary);
		 }
	 }
}


public class ComparatorUsingContainment {

	public static void main(String[] args) {
	
		
		LinkedList<Employee>list=new LinkedList<>();
		list.add(new Employee(101,"Yogesh",45000,new Department(1,"HR","3Floor")));
		list.add(new Employee(103,"Yash",61000,new Department(2,"Finance","5Floor")));
		list.add(new Employee(102,"Raj",61000,new Department(3,"Finance","1Floor")));
		list.add(new Employee(104,"Madhav",70000,new Department(4,"Social","9Floor")));
		list.add(new Employee(100,"Pranav",70000,new Department(5,"Sales","8Floor")));
		
		System.out.println(list);
		System.out.println("/////////////////////////////////////////////////////////////");
		
		Collections.sort(list,new SalaryComparator());
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
		
	}

}
