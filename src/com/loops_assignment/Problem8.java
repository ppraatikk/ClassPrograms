package com.loops_assignment;
//8.Write a Java program to count number of digits in any number

public class Problem8 {

	public static void main(String[] args) {
		int num=123456789;
		int count=0;
		
		for(int i=num;i>0;)
		{
			i=i/10;
			count++;
		}
		System.out.println("Digits in Number are : "+count);
	}

}
