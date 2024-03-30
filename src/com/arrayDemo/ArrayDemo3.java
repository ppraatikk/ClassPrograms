package com.arrayDemo;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		char ch[] = {'a','b','c','d','E'};
		float flt[] = {1.1f,2.2f,3.3f};
		
		System.out.println("Display ........");
		for(int x:arr)
		{
			System.out.println(x);
		}
		for(char c:ch)
		{
			System.out.println(c);
		}
		for(float f:flt)
		{
			System.out.println(f);
		}

	}

}
