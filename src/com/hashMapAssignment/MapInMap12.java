package com.hashMapAssignment;
import java.util.*;


public class MapInMap12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		HashMap<String,HashMap<String,Integer>>map=new HashMap<>();
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter Cust Name");
			String custName=sc.next();
			
			            HashMap<String,Integer>hm=new HashMap<>();
			            for(int j=1;j<=1;j++)
			            {
			            	System.out.println("Enter Cust City");
			            	String custCity=sc.next();
			            	System.out.println("Enter Cust Pincode");
			            	int pincode=sc.nextInt();
			            	hm.put(custCity,pincode);
			            }
			 map.put(custName,hm);           
		}
		
		
		
		
		
		Set s=map.entrySet();
		Iterator<Map.Entry<String, HashMap<String,Integer>>>itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,HashMap<String,Integer>>m=itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}

		
		System.out.println("/////////////////////////////////////////////");
		
//		Set s1=map.entrySet();
//		Iterator<Map.Entry<String,HashMap<String,Integer>>>it=s1.iterator();
//		while(it.hasNext())
//		{
//			Map.Entry<String,HashMap<String,Integer>>m=it.next();
//			Iterator<Map.Entry<String,Integer>>itt=s1.iterator();
//			while(itt.hasNext())
//			{
//				Map.Entry<String,Integer>mm=itt.next();
//				System.out.println(itt.next());
//			}
//		}
		

}

}

