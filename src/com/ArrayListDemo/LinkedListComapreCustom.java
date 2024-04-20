package com.ArrayListDemo;
import java.util.*;


class Studentt implements Comparable<Studentt>{
	int id;
	String name;
	int marks;
	public Studentt(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public int compareTo(Studentt s)
	{
//		if(this.marks>s.marks)
//		{
//			//return -1;//Descending
//			  return 1; //Ascending 
//		}
//		else if(this.marks<s.marks)
//		{
//			//return 1; //Descending
//			  return -1; //Ascending
//		}
//		else
//		{
//			return 0;
//		}
		
		
		
		return this.marks-s.marks; //Ascending
		//return s.marks-this.marks;//Descending  
		
		
	}
	
}
public class LinkedListComapreCustom {

	public static void main(String[] args) {
		
		LinkedList<Studentt>list=new LinkedList<>();
		list.add(new Studentt(1,"SS",60));
		list.add(new Studentt(2,"Raj",89));
		list.add(new Studentt(3,"yash",33));
		
		System.out.println(list);
		System.out.println("////////////////////////////////////////////");
		Collections.sort(list);
		System.out.println(list);
		
	}

}
