package com.containment_assignment;
class Departmenttt{
	private int id;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
}
class MyDate{
	private int date;
	private String month ;
	private int year;
	
	public void setDate(int date)
	{
		this.date=date;
	}
	public void setMonth(String month)
	{
		this.month = month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getDate()
	{
		return date;
	}
	public String getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
}
public class Employee {
	private int id;
	private String name;
	private int salary;
	private Departmenttt dept;
	private MyDate mydate;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public void setDepartmenttt(Departmenttt dept)
	{
		this.dept=dept;
	}
	public void setMyDate(MyDate mydate)
	{
		this.mydate=mydate;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public Departmenttt getDept()
	{
		return dept;
	}
	public MyDate getMydate()
	{
		return mydate;
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Pratik");
		emp.setSalary(4999);
		emp.setDepartmenttt(new Departmenttt());
		emp.setMyDate(new MyDate());
		
		Departmenttt dept =emp.getDept();
		MyDate mydate = emp.getMydate();
		
		dept.setId(12);
		dept.setName("Sham");
		
		mydate.setDate(31);
		mydate.setMonth("July");
		mydate.setYear(2002);
	    System.out.println("EMployee info is ");	
        System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSalary());
        System.out.println("department info is ");
        System.out.println(dept.getId()+" "+dept.getName());
        System.out.println("Date is ");
        System.out.println(mydate.getDate()+" "+mydate.getMonth()+" "+mydate.getYear());
	}

}
