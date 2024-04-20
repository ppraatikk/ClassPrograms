package com.labSession;
import java.util.*;

class Student{
	int id;
	String name;
	double per;
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}
public class ArraylistDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Student>list=new ArrayList<>();
		HashMap<String,String>map=new HashMap<>();
		
		list.add(new Student(1,"Rohan",87.54));
		list.add(new Student(2,"Yash",34.99));
		list.add(new Student(3,"Pranav",56.04));
		list.add(new Student(4,"Jay",67.76));
		list.add(new Student(5,"Param",23.00));
		
		Iterator<Student>itr=list.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			if(s.per>=35)
			{
				map.put(s.name,"Passed");
			}
			else
			{
				map.put(s.name,"Failed");                                       
			}
		}
		
		
		System.out.println(map);
	}

}
