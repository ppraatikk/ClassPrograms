package com.hashMapAssignment;
import java.util.*;

public class CustClass10 {

	public static void main(String[] args) {

		HashMap<String,ArrayList<Integer>>map=new HashMap<>();
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(11);
		a1.add(12);
		a1.add(13);
		map.put("Math",a1);
		
		Set s=map.entrySet();
		Iterator<Map.Entry<String,ArrayList<Integer>>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,ArrayList<Integer>>m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
			
		System.out.println("///////////////////////////////////");
		
		
		Iterator<Integer>it=a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
