package com.ArrayListDemo;

import java.util.*;
public class NonGenricDemo1 {

	public static void main(String[] args) {
		
		ArrayList a1= new ArrayList();
		
		a1.add(100);
		a1.add("Pune");
		a1.add(12.34);
		a1.add('a');
		
		System.out.println(a1);
		System.out.println("------------------------");
		
		
		
		System.out.println(a1.get(a1.size()-1));
		System.out.println(a1.get(1));
		System.out.println("------------------------");
		
		
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("------------------------");
		
		
		
		
		
		
		Iterator <Object> itr = a1.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
	}

}
