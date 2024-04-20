package com.labSession;
import java.util.*;

class Stud{
	int id;
	String name;
	LinkedList<Integer>l;
	public Stud(int id, String name, LinkedList<Integer> l) {
		super();
		this.id = id;
		this.name = name;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", l=" + l + "]";
	}
	
}
public class LinkedList_inside_List {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		LinkedList<Stud>list = new LinkedList<>();
		System.out.println("Enter Student Details");
		
		for(int j=1;j<=3;j++)
		{
			System.out.println("Enter Student id");
			int id=sc.nextInt();
			System.out.println("Enter Student Name");
			String name=sc.next();
		System.out.println("Enter 5 Subj Marks");
		LinkedList<Integer>l=new LinkedList<>();
		for(int i=1;i<=5;i++) {
			System.out.println("Enter SUbj "+i);
			int mark =sc.nextInt();
			l.add(mark);
		}
		list.add(new Stud(id,name,l));
		
		}
		
		
		Iterator<Stud>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
