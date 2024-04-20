package com.labSession;
import java.util.*;
class Department{
		int did;
		String dname;
		
		public Department(int did, String dname) {
			super();
			this.did = did;
			this.dname = dname;
		}

		@Override
		public String toString() {
			return "Department [did=" + did + ", dname=" + dname + "]";
		}
		
}
class Employee{
	int eid;
	String ename;
	double esalary;
	Department dept;
	public Employee(int eid, String ename, double esalary, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", dept=" + dept + "]";
	}
	
}
public class HashMapDemo2 {
	
	
	
	public static void listEmployee(ArrayList<Employee>a)
	{
		HashMap<String,ArrayList<String>>map=new HashMap<>();
		for(Employee e:a)
		{
			ArrayList<String>list=new ArrayList<>();
			if(map.containsKey(e.dept.dname))
			{
				list=map.get(e.dept.dname);
				list.add(e.ename);
			}
			else
			{
				list.add(e.ename);
			}
			map.put(e.dept.dname, list);
		}
		
		
		System.out.println(map);
	}
	
	
	
	
	public static void countSalary(ArrayList<Employee>a)
	{
		HashMap<String,Integer>map=new HashMap<>();
		for(Employee e:a)
		{
		   int total=0;
		   if(map.containsKey(e.dept.dname))
		   {
			 total=map.get(e.dept.dname);
			 total=(int)(total+e.esalary);
		   }
		   else
		   { 
			   total=(int) (total+e.esalary);
		   }
		   map.put(e.dept.dname,total);
		}
		
		System.out.println(map);
	}
	
	
	

	public static void main(String[] args) {
		
		ArrayList<Employee>a=new ArrayList<>();
		
		a.add(new Employee(1,"Sham",25000,new Department(101,"HR")));
		a.add(new Employee(2,"Raj",45000,new Department(109,"Sales")));
		a.add(new Employee(4,"Yash",57000,new Department(103,"Sales")));
		a.add(new Employee(3,"Rohan",41000,new Department(107,"HR")));
		
		
		
		listEmployee(a);
		countSalary(a);
		
		
		
	}

}
