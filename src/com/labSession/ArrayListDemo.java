package com.labSession;
import java.util.*;

public class ArrayListDemo {
	public static void showLength(ArrayList<String>a1)
	{
		
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).length()>3)
			{
				System.out.println(a1.get(i));
			}
		}
		
	}

	public static void main(String[] args) {

		ArrayList<String>a1=new ArrayList<>();
		a1.add("Pune");
		a1.add("Latur");
		a1.add("Goa");
		a1.add("Nagpur");
		
		showLength(a1);

	}

}
