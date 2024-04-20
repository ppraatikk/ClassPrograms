package com.ArrayListDemo;

import java.util.*;
public class EvenElementFromArrayList {
	public static void even(ArrayList<Integer>a1)
	{
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i)%2==0)
			{
				System.out.println(a1.get(i));
			}
		}
		
	}
	
	public static void sum(ArrayList<Integer>a1)
	{
		int sum=0;
		for(int i=0;i<a1.size();i++)
		{
			sum=sum+a1.get(i);
		}
		System.out.println("Sum is : "+sum);
	}
	public static void countOdd(ArrayList<Integer>a1)
	{
		int count=0;
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i)%2!=0)
			{
				count++;
			}
		}
		System.out.println("Count Of Odd Is : "+count);
		
	}

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(14);
		
		even(a1);
		sum(a1);
		countOdd(a1);
	}

}
