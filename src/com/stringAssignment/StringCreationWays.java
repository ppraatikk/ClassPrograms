package com.stringAssignment;

public class StringCreationWays {

	public static void main(String[] args) {
		
		String st="Hello";
		String st1="Hello";
		String st2="Pune";
		
		String str=new String("Latur");
		String str1=new String("Latur");
		String str2=new String("Pune");
		
		System.out.println(st);
		System.out.println(str);

		System.out.println(st==str);
		System.out.println(st==st1);
		System.out.println(str==str1);
		System.out.println(st2==str2);
	}

}
