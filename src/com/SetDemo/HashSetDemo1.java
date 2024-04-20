package com.SetDemo;
import java.util.*;
class Employe{
	int id;
	String name;
	double salary;
	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode()
	{
		return (int) salary;
	}
	@Override
	public boolean equals(Object o)
	{
		Employe e=(Employe)o;
		if(this.id==e.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
}
public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<Employe>hs=new HashSet<>();
		hs.add(new Employe(1,"Sham",20500));
		hs.add(new Employe(2,"Prateek",24500));
		hs.add(new Employe(3,"Yash",12500));
		
		
		System.out.println(hs);
		hs.add(new Employe(3,"Raj",13500));
		
		System.out.println("///////////////////");
		System.out.println(hs);
		
		
	}

}
