package com.containment_assignment;

 class Employe{
	int id;
	String name;
	int salary;
	 
	public Employe(int id,String name,int salary)
	{
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	}
	
	/*public void showEmploye() 
	{
		System.out.println(id+" "+name+" "+salary);
	}*/
	
	public String toString()
	{
		return id+" "+name+" "+salary;
	}
}

public class Department {
	int dept_id;
	String dept_name;
	String dept_location;
	Employe emp;
	
	public Department(int dept_id,String dept_name,String dept_location,Employe emp)
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
		this.dept_location=dept_location;
		this.emp=emp;
	}
	/*public void showDepartment()
	{
		System.out.println(dept_id+" "+dept_name+" "+dept_location);
		emp.showEmploye();
	}*/
	
	public String toString()
	{
		return dept_id+" "+dept_name+" "+dept_location+" "+emp;
	}

	public static void main(String[] args) {
		
		Department d= new Department(12,"Physics","1stFloor",new Employe(123,"Ram",34000));
		//Employe  e= new Employe(12,"Ram",30000); 
		//Department d= new Department(11,"physics","1st floor",e);
		//d.showDepartment();
		System.out.println(d);
	}

}
