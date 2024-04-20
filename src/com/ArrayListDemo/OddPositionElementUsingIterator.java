package com.ArrayListDemo;

import java.util.*;
public class OddPositionElementUsingIterator {
	
	public static void oddPosition(ArrayList<String>a1)
	{
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext())
		{
			itr.next();
			if(itr.hasNext())
			{
				System.out.println(itr.next());
			}
	    }
    }
	
	public static void sortArrayList(ArrayList<Integer>a2)
	{
		for(int i=0;i<a2.size();i++)
		{
			for(int j=i+1;j<a2.size();j++)
			{
				if(a2.get(i)>a2.get(j))
				{
					int temp=a2.get(i);
					a2.set(i,a2.get(j));
					a2.set(j,temp);
				}
			}
		}
		System.out.println(a2);
	}
	public static void sortList(ArrayList<Integer>a2)
	{
		for(int i=0;i<a2.size();i++)
		{
			for(int j=i+1;j<a2.size();j++)
			{
				if(a2.get(i)<a2.get(j))
				{
					int temp=a2.get(i);
					a2.set(i,a2.get(j));
					a2.set(j,temp);
				}
			}
		}
		System.out.println(a2);
	}
	
	public static void main(String[] args) {

		ArrayList<String>a1=new ArrayList<>();
		a1.add("Pune"); //0
		a1.add("Latur"); //1
		a1.add("Mumbai"); //2
		a1.add("Nashik"); //3
		a1.add("Surat"); //4
		a1.add("Nagpur"); //5
		
		ArrayList<Integer>a2=new ArrayList<>();
		a2.add(12);
		a2.add(7);
		a2.add(18);
		a2.add(01);
		
		oddPosition(a1);
		sortArrayList(a2);	
		sortList(a2);
		}
		
	}


