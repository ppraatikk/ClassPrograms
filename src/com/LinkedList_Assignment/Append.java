package com.LinkedList_Assignment;
import java.util.*;
public class Append {

	public static void append(LinkedList<Integer>list)
	{
		list.add(99);
		list.add(100);
		System.out.println(list);
	}
	
	
	
	
	public static void iterate(LinkedList<Integer>list)
	{
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	
	public static void specificPositionIterate(LinkedList<Integer>list)
	{
		ListIterator<Integer>itr=list.listIterator(2);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
	
	
	public static void reverse(LinkedList<Integer>list)
	{
		ListIterator<Integer>itr=list.listIterator();
		while(itr.hasNext())
			itr.next();
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		System.out.println("////////////////////////////////////");
		append(list);
		System.out.println("///////////////////////////////////");
		iterate(list);
		System.out.println("////////////////////////////////");
		specificPositionIterate(list);
		System.out.println("////////////////////////////////");
		reverse(list);
		
		
	}

}
