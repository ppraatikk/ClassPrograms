package com.classProgram;


interface Employee{
		void work();
		double calculateSalary();
}
class Manager implements Employee{
	    String name;
	    double salary;
	    Manager(String name,double salary)
	    {
	    	this.name=name;
	    	this.salary=salary;
	    }
 		public void work()
		{
			System.out.println("manager "+name);
		}
		public double calculateSalary()
		{
			return salary;
		}
	
}
class Devloper implements Employee{
	String name;
	double salary;
	Devloper(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public void work()
	{
		System.out.println("Devloper "+name);
	}
	public double calculateSalary()
	{
		return salary;
	}
	
}
public class Abstract_Interface_demo2 {

	public static void main(String[] args) {
		Devloper d = new Devloper("SS",123.567);
		d.work();
		System.out.println(d.calculateSalary());
		
		Manager m = new Manager("PP",33345.6674);
		m.work();
		System.out.println(m.calculateSalary());
		
		
		Employee dev = new Devloper("ZA",3422.3455);
		Employee mng = new Manager("MN",1298.789);
		dev.work();
		System.out.println(dev.calculateSalary());
		mng.work();
		System.out.println(mng.calculateSalary());
		
	}

}
