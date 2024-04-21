package com.SetAssignment;
import java.util.*;

public class HashSet_to_List {

	public static void main(String[] args) {
		
		HashSet<Integer>hs1=new HashSet<>();
		hs1.add(19);
		hs1.add(13);
		hs1.add(37);
		hs1.add(9);
		
		List<Integer>list=new ArrayList<>(hs1);
		System.out.println(list);
		System.out.println("//////////////////////////////////////");
		
		
		HashSet<Integer>hs2=new HashSet<>();
		hs2.add(9);
		hs2.add(37);
		hs2.add(19);
		hs2.add(13);
		
		if(hs1.equals(hs2))
		{
			System.out.println("HashSet Are Same");
		}
		else
		{
			System.out.println("HashSet Are Diff");
		}
		System.out.println("//////////////////////////////////////");
		
		
		HashSet<Integer>hs3=new HashSet<>();
		hs3.add(11);
		hs3.add(23);
		hs3.add(39);
		hs3.add(41);
		HashSet<Integer>hs4=new HashSet<>();
		hs4.add(39);
		hs4.add(49);
		hs4.add(22);
		hs4.add(23);
		
		hs3.retainAll(hs4);
		System.out.println(hs3);
		System.out.println("//////////////////////////////////////");
		
		
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(19);
		ts.add(13);
		ts.add(29);
		ts.add(21);
		
		TreeSet<Integer>ts1=new TreeSet<>(ts);
		System.out.println(ts1);
		
		
		
	} 

}
