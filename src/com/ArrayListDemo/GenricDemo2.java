package com.ArrayListDemo;
import java.util.*;

public class GenricDemo2 {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
//		a1.add("Pune");
//		a1.add("mumbai");
//		a1.add("Hyd");
		
		
		System.out.println("Enter String ");
		for(int i=0;i<4;i++)
		{
			//String st=sc.next();
			a1.add(sc.next());
		}
		
		
		
		for(String s:a1)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("-----------------------");
		
		
		
		
		
		
		Iterator<String> i= a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("-----------------------");
		
		
		
		
		
		ListIterator<String> it=a1.listIterator();
		while(it.hasNext())
		{
			it.next();
		}
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		System.out.println("-----------------------");
		
		
		
		ListIterator<String> itr=a1.listIterator(a1.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
