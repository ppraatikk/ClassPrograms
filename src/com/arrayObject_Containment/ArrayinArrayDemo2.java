package com.arrayObject_Containment;

import java.util.Arrays;
import java.util.Scanner;

class EmployeeInfo{
	int id;
	String name;
	public EmployeeInfo(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
}
class DepartmentInfo{
	int id;
	String name;
	EmployeeInfo emp[];
	public DepartmentInfo(int id,String name,EmployeeInfo emp[])
	{
		this.id=id;
		this.name=name;
		this.emp=emp;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(emp);
	}
}
public class ArrayinArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentInfo d[] = new DepartmentInfo[2];
		System.out.println("Enter DepartmentInfo");
		for(int i=0;i<d.length;i++)
		{
			System.out.println("ENter Department id");
			int id =sc.nextInt();
			System.out.println("ENter Department Name");
			String name=sc.next();
			
			System.out.println("Enter Employe Number");
			int size =sc.nextInt();
			EmployeeInfo e[]=new EmployeeInfo[size];
			System.out.println("Enter Employee Info");
			for(int j=0;j<e.length;j++)
			{
				System.out.println("Enter Employe id");
				int eid=sc.nextInt();
				System.out.println("Employe Name");
				String ename=sc.next();
				e[j]=new EmployeeInfo(eid,ename);
			}
			d[i]=new DepartmentInfo(id,name,e);
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}

}
