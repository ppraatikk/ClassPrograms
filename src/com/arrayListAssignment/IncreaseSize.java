package com.arrayListAssignment;
import java.util.*;

public class IncreaseSize {
	
	public static void increaseSize()
	{
        ArrayList<Integer>a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		
		System.out.println(a1.size());
		
		a1.add(11);
		a1.add(12);
		a1.add(13);
		
		System.out.println(a1.size());
	}
	public static void main(String[] args) {
		
		increaseSize();

	}

}
