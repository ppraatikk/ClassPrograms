package com.ArrayListDemo;

public class UnBoxingDemo {

public static void main(String[] args) {
		
		//Object-Primitive
		Integer obj1 = new Integer(12);
		int x=obj1.intValue(); 
		System.out.println(x);
		
		//Auto UnBoxing
		Integer obj2=new Integer(999);
		int y=obj2;
		System.out.println(y);
		
		
		
		//Parse Method
		String s="12345";
		int z=Integer.parseInt(s);
		System.out.println(z+" "+(z+2));
		
		
		//parse Method
		float f=Float.parseFloat(s);
		System.out.println(f+0.1f);
	}
}
