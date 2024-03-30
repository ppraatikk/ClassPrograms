package com.arrayObject_Assignment;

import java.util.Scanner;

class Date{
	int date;
	String month;
	int year;
	public void setDate(int date)
	{
		this.date=date;
	}
	public void setMonth(String month)
	{
		this.month=month;
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
	public int getyear()
	{
		return year;
	}
}
class Employe{
	int id;
	String name;
	double salary;
	Date date;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setDate(Date date)
	{
		this.date=date;
	}
	public int getid()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public Date getDate()
	{
		return date;
	}
}
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employe emp[] = new Employe[4];
		System.out.println("Enter Array DEtails");
		
		for(int i=0;i<emp.length;i++)
		{
			Employe e = new Employe(); 
			System.out.println("Enter id");
			e.setId(sc.nextInt());
			System.out.println("Enter name");
			e.setName(sc.next());
			System.out.println("Enter Salary");
			e.setSalary(sc.nextDouble());
			System.out.println("Enter MYdate Details");
			e.setDate(new Date());
			Date dt = e.getDate();
			System.out.println("Enter Date");
			dt.setDate(sc.nextInt());
			System.out.println("Enter month");
			dt.setMonth(sc.next());
			System.out.println("Enter Year");
			dt.setYear(sc.nextInt());
			emp[i]=e;
		  }
		for(int i=0;i<emp.length;i++)
		{
			System.out.print(emp[i].getid()+" "+emp[i].getName()+" "+emp[i].getSalary()+" ");
			Date dt=emp[i].getDate();
			System.out.println(dt.getDate()+" "+dt.getMonth()+" "+dt.getyear());
		}
		System.out.println("////////////////////");
		for(int i=0;i<emp.length;i++)
		{
			int count=0;
			for(int j=0;j<emp.length;j++)
			{
			 if(emp[i].getDate().date==emp[j].getDate().date && emp[i].getDate().year==emp[j].getDate().year)
			 {
				count++;	
			 }
			}
			if(count>1)
			{
				System.out.print(emp[i].getid()+" "+emp[i].getName()+" "+emp[i].getSalary()+" ");
				Date dt=emp[i].getDate();
				System.out.println(dt.getDate()+" "+dt.getMonth()+" "+dt.getyear());
			}
		}
	}

}
