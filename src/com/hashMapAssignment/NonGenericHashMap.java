package com.hashMapAssignment;
import java.util.*;
import java.util.Map.Entry;
public class NonGenericHashMap {

	public static void main(String[] args) {
		
		HashMap hm1=new HashMap();
		hm1.put(1,"Yash");
		hm1.put(2,"Rohan");
		hm1.put(3,"Pranav");
		
		System.out.println("-----Non generic--------");
		System.out.println(hm1);
		System.out.println("                                                         ");
		
		HashMap hm2=new HashMap();
		hm2.put("Pranav",1);
		hm2.put("Yash",2);
		hm2.put("RJJ",3);
		
		System.out.println("------Non genric-------");
		System.out.println(hm2);
		System.out.println("                                                         ");
		
		HashMap hm3 = new HashMap();
		hm3.put("Sidhu",11);
		hm3.put(12,"Omii");
		
		System.out.println("---Random Non gneric---");
		System.out.println(hm3);
		System.out.println("                                                         ");
		
		HashMap<Integer,String>hm4=new HashMap<>();
		hm4.put(1,"Latur");
		hm4.put(2,"Pune");
		hm4.put(3,"Mumbai");
		hm4.put(4,"Nashik");
		
		System.out.println("-----------gneric------------------");
		System.out.println(hm4);
		System.out.println("                                                         ");
		
		System.out.println("-----------Sizeee--------------------");
		System.out.println(hm4.size());
		System.out.println("                                                         ");
		
		
		System.out.println("----------Using for-each loop---------------");
        for (Map.Entry<Integer, String> m : hm4.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("                                                         ");
        
        System.out.println("----------Using Iterator---------------");
		Set s=hm4.entrySet();
		Iterator<Map.Entry<Integer, String>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String>m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("                                                         ");
		
		
		System.out.println("------------Print Only Keys");
		for(Map.Entry<Integer,String> m:hm4.entrySet())
		{
			System.out.println(m.getKey());
		}
		System.out.println("                                                         ");
		
		System.out.println("---------Print Only Values");
		for(Map.Entry<Integer,String>m:hm4.entrySet())
		{
			System.out.println(m.getValue());
		}
		System.out.println("                                                         ");

	}

}
