package com.Pratice;

import java.util.Scanner;

class Employeeinfo{
	int  eid;
	String ename;
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
}
class Deptinfo
{
	int id;
	String name;
	Employeeinfo e[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employeeinfo[] getE() {
		return e;
	}
	public void setE(Employeeinfo[] e) {
		this.e = e;
	}
	

}
public class Problem11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Deptinfo x[]=new Deptinfo[2];
		
		
		for(int i=0;i<x.length;i++)
		{
			Deptinfo d=new Deptinfo();
			System.out.println("Enter Dept id");
			d.setId(sc.nextInt());
			
			System.out.println("Enter Dept name");
			d.setName(sc.next());
			
			Employeeinfo y[]=new Employeeinfo[1];
			for(int j=0;j<y.length;j++)
			{
				Employeeinfo emp=new Employeeinfo();
				
				System.out.println("Enter Emp id");
				emp.setEid(sc.nextInt());
				
				System.out.println("Enter Ename");
				emp.setEname(sc.next());
				y[j]=emp;
			}
			d.setE(y);
			x[i]=d;
		}
		
		
		for(Deptinfo z:x)
		{
			
			System.out.print(z.getId()+" "+z.getName()+" ");
			
			Employeeinfo[] e=z.getE();
			for(Employeeinfo emp:e)
			{
				System.out.print(emp.getEid()+" "+emp.getEname());
			}
			
			System.out.println();
		}
		
	}

}
