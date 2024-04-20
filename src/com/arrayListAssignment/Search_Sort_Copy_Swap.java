package com.arrayListAssignment;
import java.util.*;

public class Search_Sort_Copy_Swap {
	public static void sort(ArrayList<Integer>a1)
	{
		Collections.sort(a1);
		System.out.println(a1);
	}
	public static void search(ArrayList<Integer>a1)
	{
		if(a1.contains(11))
		{
			System.out.println("Element is present");
		}
		else
			System.out.println("Element is Not present");
	}
	public static void copy(ArrayList<Integer>a1)
	{
		ArrayList<Integer>a2=new ArrayList<>();
		a2.addAll(a1);
		System.out.println(a2);
	}
	public static void shuffle(ArrayList<Integer>a1)
	{
		Collections.shuffle(a1);
		System.out.println(a1);
	}
	public static void reverse(ArrayList<Integer>a1)
	{
	   ListIterator<Integer>itr=a1.listIterator();
	   while(itr.hasNext())
	   {
		itr.next();   
	   }
	   while(itr.hasPrevious())
	   {
		   System.out.println(itr.previous());
	   }
	}
	public static void swap(ArrayList<Integer>a1)
	{
		int a=a1.get(0);
		int b=a1.get(1);
		a1.set(0,b);
		a1.set(1,a);
		System.out.println(a1);
	}
	public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<>();
				a1.add(11);
				a1.add(7);
				a1.add(299);
				a1.add(40);
				a1.add(58);
				
				sort(a1);
				System.out.println("///////////////////////");
				search(a1);
				System.out.println("///////////////////////");
				copy(a1);
				System.out.println("///////////////////////");
				shuffle(a1);
				System.out.println("///////////////////////");
				reverse(a1);
				System.out.println("///////////////////////");
				swap(a1);
				
	}

}
