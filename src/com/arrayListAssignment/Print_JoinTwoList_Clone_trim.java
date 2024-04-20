package com.arrayListAssignment;
import java.util.*;

public class Print_JoinTwoList_Clone_trim{
	public static void print(ArrayList<Integer>a1)
	{
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}
	public static void join(ArrayList<Integer>a1,ArrayList<Integer>a2)
	{
		ArrayList<Integer>a3=new ArrayList<>();
		a3.addAll(a1);
		a3.addAll(a2);
		System.out.println(a3);
	}
	public static void clone(ArrayList<Integer>a1)
	{
		ArrayList<Integer>a3=new ArrayList<>();
		
		System.out.println(a1);
	}
	public static void isEmpty()
	{
		ArrayList<Integer>a3=new ArrayList<>();
		
		if(a3.isEmpty())
			System.out.println("empty");
		else
			System.out.println("Non Empty");
		
	}
	public static void trim(ArrayList<Integer>a1)
	{
		System.out.println("Size Of list : "+a1.size());
		a1.trimToSize();
		System.out.println("After Tream Size : "+a1.size());
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.set(1,4);
		
		ArrayList<Integer>a2=new ArrayList<>();
		a2.add(11);
		a2.add(12);
		a2.add(13);
		
		print(a1);
		join(a1,a2);
		clone(a1);
		isEmpty();
		trim(a1);
		
	}

}
