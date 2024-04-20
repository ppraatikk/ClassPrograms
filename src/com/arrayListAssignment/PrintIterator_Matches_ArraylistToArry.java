package com.arrayListAssignment;

import java.util.*;

public class PrintIterator_Matches_ArraylistToArry {
	
	public static void print(ArrayList<Integer>a1)
	{
		Iterator<Integer>itr=a1.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}
	}
	public static void array(ArrayList<Integer>a1)
	{
		Integer arr[]=new Integer[a1.size()];
		
		for(int i=0;i<a1.size();i++)
		{
			arr[i]=a1.get(i);
		}
		
		for(Integer a:arr)
		{
			System.out.println(a);
		}
	}
	public static void check(ArrayList<Integer>a1,ArrayList<Integer>a2)
	{
		//Collections.sort(a2);
		if(a1.equals(a2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	public static void isEmpty(ArrayList<Integer>a1)
	{
		if(a1.isEmpty())
			System.out.println("a1 is Empty");
		else
			System.out.println("a1 is Not Empty");
	}
	public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		
		ArrayList<Integer>a2=new ArrayList<>();
//		a2.add(100);
//		a2.add(101);
//		a2.add(102);
		a2.add(11);
		a2.add(12);
		a2.add(14);
		a2.add(13);
		
		print(a1);
		System.out.println("/////////////////////////");
		array(a1);
		System.out.println("/////////////////////////");
		check(a1,a2);
		System.out.println("/////////////////////////");
		isEmpty(a1);
		
		
		
	}

}
