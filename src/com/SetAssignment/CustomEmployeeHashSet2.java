package com.SetAssignment;
import java.util.*;
class Employe implements Comparable<Employe>{
	int id;
	String name;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode()
	{
		return name.hashCode();
	}
	@Override
	public boolean equals(Object o)
	{
		Employe e=(Employe)o;
		if(e.name.equals(this.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	@Override
	public int compareTo(Employe e)
	{
		return e.id-this.id;
	}
	
	
}
public class CustomEmployeeHashSet2 {

	public static void main(String[] args) {
		
		LinkedHashSet<Employe>hs=new LinkedHashSet<>();
		
		hs.add(new Employe(1,"Yash"));
		hs.add(new Employe(4,"Rohan"));
		hs.add(new Employe(3,"Pranav"));
		hs.add(new Employe(2,"Samir"));
		
		System.out.println(hs);
		System.out.println("/////////////////////////////////////////////////////////");
		
		hs.add(new Employe(5,"Rohan"));
		System.out.println(hs);
	}

}
