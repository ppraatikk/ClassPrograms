package com.arrayObject_Assignment;

class Department{
	private int deptid;
	private String deptname;
	public Department(int deptid,String deptname)
	{
		this.deptid=deptid;
		this.deptname=deptname;
	}
	public String toString()
	{
		return deptid+" "+deptname;
	}
}
public class Employs{
	private int empno;
	private String empname;
	private Department dept;
	
	public Employs(int empno,String empname,Department dept)
	{
		this.empno=empno;
		this.empname=empname;
		this.dept=dept;
	}
	public String toString()
	{
		return empno+" "+empname+" "+dept;
	}
}
