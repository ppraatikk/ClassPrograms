package com.SetAssignment;
import java.util.*;
public class HashSet_to_TreeSet {

	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<>();
		
		hs.add(78);
		hs.add(92);
		hs.add(19);
		hs.add(34);
		
		System.out.println(hs);
		System.out.println("//////////////");
		
		
		//Question  9
		TreeSet<Integer>ts=new TreeSet<>(hs);
		
		
		//Question 11
		Iterator<Integer>itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		//Question 12
		System.out.println("/////////////////////////////");
		System.out.println(ts.last());
		System.out.println("//////////////////////////////////");
		System.out.println(ts.first());
		
		
		//Question 14
		System.out.println("///////////////////////////////////");
		System.out.println(ts.descendingSet());
		
		
		
		
		}

}
