package com.arrayListAssignment;
import java.util.*;

public class AddRemoveSearch {

	public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(11);
		a1.add(13);
		a1.add(14);
		System.out.println(a1);
		
		ArrayList<String>a2=new ArrayList<>();
		ArrayList<String>a4=new ArrayList<>();
		a2.add("Pink");
		a2.add("Yellow");
		a2.add("White");
		
		a4.add("Pune");
		a4.add("Mumbai");
		a4.add("Nashik");
		a4.add("Yellow");
		System.out.println(a2);
		System.out.println(a4);
		
		
		ArrayList<Integer>a3=new ArrayList<>();
		a3.add(21);
		a3.add(22);
//		a3.addAll(a1);
//		a1.addAll(a3);
//		System.out.println(a3);
//		System.out.println(a1);
		
		a1.remove(1);
		a3.remove(0);
		System.out.println(a1);
		System.out.println(a3);
		
//		a1.removeAll(a1);
//		System.out.println(a1);
		
		
//		a2.addAll(1, a4);  // Add Array list in first at that index
//		System.out.println(a2);	
		
//		a2.removeAll(a4);  //remove Common element from a2 which is present in a4 
//		System.out.println(a2); 
	
//		a2.retainAll(a4);
//		System.out.println(a2); // Print Common Element From a2 and a4
		
		
//		String s=a2.get(2);
//		System.out.println(s);
		
//		a2.addAll(a4);
//		boolean ans=a2.containsAll(a4);
//		System.out.println(ans);
		
		
		a1.add(1,101);
		System.out.println(a1);
		
   }

}
