package com.arrayDemo;

import java.util.Scanner; 
public class ArrayDemo5 {
	public void reverseArray(char ch [])
	{
		for(char c:ch)
		{
			System.out.println(c);
		}
		System.out.println(" reverse array");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of Charcter array");
		int size = sc.nextInt();
		char ch[] = new char[size];
		System.out.println("Enter Character array Element");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		ArrayDemo5 a = new ArrayDemo5();
		a.reverseArray(ch);
		
		

	}

}
