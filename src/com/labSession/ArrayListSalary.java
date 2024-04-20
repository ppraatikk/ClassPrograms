package com.labSession;
import java.util.*;

class Employ{
	int id;
	String name;
	int salary;
	public Employ(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
//	@Override
//	public int hashCode()
//	{
//		return id;
//	}
//	@Override
//	public boolean equals(Object o)
//	{
//		Employ e = (Employ) o;
//		
//	}
	
}
public class ArrayListSalary {

	public static void main(String[] args) {
		ArrayList<Employ>a=new ArrayList<>();
		a.add(new Employ(1,"Yash",20000));
		a.add(new Employ(5,"Rohan",25000));
		a.add(new Employ(3,"Rohan",15000));
		a.add(new Employ(2,"Rohan",10000));
		a.add(new Employ(4,"Rohan",5000));
		
		Iterator<Employ>itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).salary<25000)
			{
				int per=(a.get(i).salary*10)/100;
				int newsalary=a.get(i).salary+per;
				a.set(i,new Employ(a.get(i).id,a.get(i).name,newsalary));
			}
		}
		System.out.println("////////////////////////////////////////");
		Iterator<Employ>ity=a.iterator();
		while(ity.hasNext())
		{
			System.out.println(ity.next());
		}
	}

}
