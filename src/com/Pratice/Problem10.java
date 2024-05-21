package com.Pratice;

import java.util.Arrays;
import java.util.Scanner;

class Date{
	int dd;
	String month;
	int year;
	public Date(int dd, String month, int year) {
		super();
		this.dd = dd;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", month=" + month + ", year=" + year + "]";
	}
	
}
class Employe{
	int id;
	String name;
	int salary;
	Date date[];
	public Employe(int id, String name, int salary, Date[] date) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + Arrays.toString(date) + "]";
	}
	
}
public class Problem10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Employe emp[]=new Employe[1];
	    Date dt[]=new Date[1];
	    dt[0]=new Date(12,"jan",2023);
	   emp[0]=new Employe(1,"Tj",3400,dt);
		
//		for(int i=0;i<emp.length;i++)
//		{
//			System.out.println("Enter EMp id");
//			int eid=sc.nextInt();
//			
//			System.out.println("Enter Emp name");
//			String ename=sc.next();
//			
//			System.out.println("ENter salary");
//			int esalary=sc.nextInt();
//			
//			
//			Date dt[]=new Date[1];
//			for(int j=0;j<dt.length;j++)
//			{
//			System.out.println("ENter Date");
//			int date=sc.nextInt();
//			
//			System.out.println("Enter Month");
//			String month=sc.next();
//			
//			System.out.println("ENter Year");
//			int year=sc.nextInt();
//			
//			Date d=new Date(date,month,year);
//			dt[j]=d;
//			}
//			Employe e=new Employe(eid,ename,esalary,dt);
//			emp[i]=e;
//			
//	     }
			
		
		
		System.out.println(Arrays.toString(emp));
}
}
