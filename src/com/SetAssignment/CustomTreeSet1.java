package com.SetAssignment;
import java.util.*;

class Employ implements Comparable<Employ>{
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
	@Override
	public int compareTo(Employ e)
	{
		return this.id-e.id;
	}
	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object o)
	{
		Employ e=(Employ)o;
		if(e.id==this.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class CustomTreeSet1 {

	public static void main(String[] args) {
		TreeSet<Employ>ts=new TreeSet<>();
		
		ts.add(new Employ(2,"Ajay",2300));
		ts.add(new Employ(1,"Ram",3450));
		ts.add(new Employ(3,"Pranav",1450));
		
		System.out.println(ts);
		
		
        ts.add(new Employ(3,"Yash",1450));
		System.out.println(ts);
	}

}
