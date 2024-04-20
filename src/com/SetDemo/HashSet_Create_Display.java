package com.SetDemo;
import java.util.*;
public class HashSet_Create_Display {

	public static void main(String[] args) {
	
		HashSet<Integer>hs=new HashSet<>();

		hs.add(12);
		hs.add(11);
		hs.add(101);
		
		System.out.println(hs);
		
		System.out.println("////////////////////////////////");
		
		Iterator<Integer>itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("///////////////////////////////////////");
		
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
	}

}
