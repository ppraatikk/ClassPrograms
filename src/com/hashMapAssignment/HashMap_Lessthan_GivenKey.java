package com.hashMapAssignment;
import java.util.*;

public class HashMap_Lessthan_GivenKey {
	
	
	
	public static void printLess(HashMap<Integer,String>map)
	{
		int givenKey=3;
		for(Map.Entry<Integer,String>mm:map.entrySet())
		{
			if(mm.getKey()<givenKey)
			{
				System.out.println(mm.getKey()+" "+mm.getValue());
			}
		}
	}
	
	
	
	
	public static void printLessEqual(HashMap<Integer,String>map)
	{
		int givenKey=4;
		for(Map.Entry<Integer,String>mm:map.entrySet())
		{
			if(mm.getKey()<=givenKey)
			{
				System.out.println(mm.getKey()+" "+mm.getValue());
			}
		}
	}

	
	
	
	public static void main(String[] args) {
			  Scanner sc= new Scanner(System.in);	
              HashMap<Integer,String>map=new HashMap<>();
		
		      for(int i=1;i<=5;i++)
		      {
		 	      System.out.println("Enter key");
		 	      int key = sc.nextInt();
		 	      System.out.println("Enter values");
		 	      String value=sc.next();
		 	      map.put(key,value);
	          }
		      
		      System.out.println("-----HashMap Less than GivenKey---");
		      printLess(map);
		      System.out.println("---HashMap Less Than and Equal-to GivenKey----");
		      printLessEqual(map);
		      
	}

}
