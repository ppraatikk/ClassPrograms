package com.hashMapAssignment;
import java.util.*;
class Student{
	int rollNo;
	String sname;
	public Student(int rollNo, String sname) {
		super();
		this.rollNo = rollNo;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sname=" + sname + "]";
	}
}
class Department{
	int id;
	String dname;
	LinkedList<Student>list;
	public Department(int id, String dname) {
		this.id = id;
		this.dname = dname;
		//this.list = list;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dname=" + dname + ", list=" + list + "]";
	}	
}

public class CustomMap_Additional {

	public static void main(String[] args) {
		
			HashMap<Department,Student>map=new HashMap<>();
			LinkedList<Student>list=new LinkedList();
		//	list.add(1,"SS");
		//	Department d1= new Department(101,"Physics",list);
	}

}
