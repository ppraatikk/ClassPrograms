package com.stringDemo;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		String str = "Hello! World";
		String str1 = "hello! world";
		String str2 = "Hello! World";
		String str3 = new String("Hello! World");
		String str4 = new String("hello world");
		
		System.out.println("//////////////////////");
		//no of char from string;
		System.out.println(str.length());
		
		System.out.println("//////////////////////");
		//Retrieve char from any position
		System.out.println(str.charAt(5));
		
		System.out.println("//////////////////////");
		//find position of given char 
		System.out.println(str.indexOf('!'));
		System.out.println(str.indexOf('o'));
		
		System.out.println("//////////////////////");
		//Upper case
		System.out.println(str.toUpperCase());
		
		System.out.println("//////////////////////");
		//Lower Case
		System.out.println(str.toLowerCase());
		
		System.out.println("//////////////////////");
		//Convert into Char array
		char c[]=str.toCharArray();
		for(char ch:c)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
		System.out.println("//////////////////////");
		//Substring
		System.out.println(str.substring(5));
		System.out.println(str.substring(1,5));
		
		System.out.println("//////////////////////");
		//Split string
		String st[]=str.split(" ");
		System.out.println(Arrays.toString(st));
		
		System.out.println("//////////////////////");
		//equals
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str==str2);
		System.out.println(str==str3); 
		System.out.println(str1==str2);
		
		System.out.println("////////////////////");
		//equalsIgnoreCase
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equalsIgnoreCase(str4));
		
		System.out.println("//////////////////////");
		String s="Mumbai";
		String s1="mumbai";
		String s2=new String("Mumbai");
		String s3="City";
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s));
		System.out.println(s.compareTo(s2));
		
		System.out.println("//////////////////////");
		//concat
		System.out.println(s.concat(s3));
		
		System.out.println("//////////////////////");
		//contains
		String s4="pratik123@gmail.com";
		System.out.println(s4.contains("@"));
		System.out.println(s4.indexOf("123"));
		
		
	}

}
