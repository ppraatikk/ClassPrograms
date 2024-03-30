package com.loops_assignment;
//6. Write a Java program to find sum of all even numbers between 1 to n.

public class Problem6 {

	public static void main(String[] args) {
		int n=10;
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum Of Even Number : "+sum);
	}

}
