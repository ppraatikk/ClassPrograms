package com.arrayListAssignment;
import java.util.*;

public class Even_Iterate {
	public static void even(ArrayList<Integer>a1) {
	
		Iterator<Integer>itr=a1.iterator();
		while(itr.hasNext())
		{
			int num=itr.next();
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
}
	public static void iterate(ArrayList<Integer>a1)
	{
		Iterator<Integer>itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
	
		
		ArrayList<Integer>a1=new ArrayList<>();
		for(int i=1;i<=50;i++)
		{
			
			a1.add(i);
		}
		
		System.out.println(a1);
		System.out.println("/////////////////////////////");
		even(a1);
		System.out.println("/////////////////////////////");
		iterate(a1);
		
	}

}
