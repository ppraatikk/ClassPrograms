package com.hashMapDemo;
import java.util.*;
public class HashmapGenericDemo1 {

	public static void main(String[] args) {
	
		HashMap<String,Float>mm=new HashMap<>();
		mm.put("Pen",9.5f);
		mm.put("NoteBook",12.5f);
		mm.put("Book",15.55f);
		
		System.out.println(mm);
		System.out.println("//////////////////////////////////////");
		
		
		
		for(Map.Entry<String,Float>m:mm.entrySet())
		{
			System.out.println(m.getKey()+m.getValue());
		}
		
		System.out.println("*********************************");
		
		
		
		
		Set s=mm.entrySet();
		Iterator<Map.Entry<String,Float>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Float>m=itr.next();
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("/////////////////////////////////////////");
		
		
		
		Set ss=mm.keySet();
		Iterator<String>it=ss.iterator();
		while(it.hasNext())
		{
		   	 String key=it.next();
			System.out.println(key+" "+mm.get(key));
		}
	
	}

}
