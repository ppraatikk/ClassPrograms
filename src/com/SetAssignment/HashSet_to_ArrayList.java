package com.SetAssignment;
import java.util.*;

public class HashSet_to_ArrayList {

	public static void main(String[] args) {
		
		HashSet<Integer>hs=new HashSet<>();
		hs.add(2);
		hs.add(19);
		hs.add(54);
		hs.add(21);
		hs.add(98);
		ArrayList<Integer>a1=new ArrayList<>(hs);
		System.out.println(a1);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		hs.clear();
		System.out.println(hs);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		TreeSet<Integer>ts1=new TreeSet<>();
		ts1.add(19);
		ts1.add(7);
		ts1.add(14);
		ts1.add(2);
		ts1.add(9);
		TreeSet<Integer>ts2=new TreeSet<>();
		ts2.add(3);
		ts2.add(2);
		ts2.add(4);
		ts2.add(7);
		ts2.add(9);
		if(ts1.equals(ts2))
			System.out.println("Are Same");
		else
			System.out.println("Are Not Same");
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		//LessThan 7
		System.out.println(ts2);
		TreeSet<Integer>less=new TreeSet<>(ts2.headSet(7));
		System.out.println(less);
		System.out.println("//////////////////////////////////////////");
		
		
		//GreaterThan 7
		System.out.println(ts1);
		TreeSet<Integer>greater=new TreeSet<Integer>(ts1.tailSet(7,false));
		System.out.println(greater);
		System.out.println("//////////////////////////////////////////");
		
		
		//GreaterThan and Equal to Given Element
		System.out.println(ts2);
		TreeSet<Integer>greaterAndEqual=new TreeSet<>(ts2.tailSet(4));
		System.out.println(greaterAndEqual);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		//LessThan And Equal to Given Element
		System.out.println(ts2);
		TreeSet<Integer>lessAndEqual=new TreeSet<Integer>(ts2.headSet(4,true));
		System.out.println(lessAndEqual);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		
		System.out.println(ts2);
		Integer num=ts2.pollLast();
		System.out.println(num);
		System.out.println(ts2);
		System.out.println("//////////////////////////////////////////");
		
		System.out.println(ts2);
		Integer num1=ts2.last();
		System.out.println(num1);
		ts2.remove(num1);
		System.out.println(ts2);
		System.out.println("//////////////////////////////////////////");		
		
	}

}
