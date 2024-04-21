package com.SetAssignment;
import java.util.*;






class MyCom implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s2.compareTo(s1);
	}
}









public class HashSet_Operations {

	public static void main(String[] args) {
		
		//HashSet<Integer>hs2=new HashSet<>();
		ArrayList<Integer>list=new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(11);
		HashSet<Integer>hs2=new HashSet<>(list);
		System.out.println(hs2);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		
		HashSet hs=new HashSet<>();
		hs.add(12);
		hs.add(23);
		hs.add(98);
		hs.add(46);
		System.out.println(hs);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		HashSet<String>hs1=new HashSet<>();
		hs1.add("Pink");
		hs1.add("Yellow");
		hs1.add("White");
		hs1.add("Black");
		System.out.println(hs1);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		
		
		Iterator<String>itr=hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		
		
		System.out.println(hs1.size());
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		
		System.out.println(hs1.isEmpty());
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		
		TreeSet<String>ts=new TreeSet<>(hs1);
		System.out.println(ts);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		TreeSet<String>tm1=new TreeSet<>();
		tm1.add("Ram");
		tm1.add("Prateek");
		tm1.add("Lalla");
		System.out.println(tm1);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		
		
		
		TreeSet<String>tm2=new TreeSet<>(new MyCom());
		tm2.add("Ram");
		tm2.add("Prateek");
		tm2.add("Lalla");
		System.out.println(tm2);
		System.out.println("//////////////////////////////////////////");
		
		
		
		
		System.out.println(tm2.size());
		System.out.println("//////////////////////////////////////////");
		
		
		
		tm2.remove("Prateek");
		System.out.println(tm2);
		System.out.println("//////////////////////////////////////////");
		
		
		
		TreeSet<Integer>tm3=new TreeSet<>();
		tm3.add(90);
		tm3.add(124);
		tm3.add(101);
		tm3.add(24);
		tm3.add(75);
		tm3.add(199);
		System.out.println(tm3);
		Integer num=tm3.pollFirst();
		System.out.println(num);
		System.out.println(tm3);
		System.out.println("//////////////////////////////////////////");
		
		
		Integer num1=tm3.first();
		tm3.remove(num1);
		System.out.println(tm3);
		System.out.println("//////////////////////////////////////////");
		
		
	}

}
