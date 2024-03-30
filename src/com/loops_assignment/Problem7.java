package com.loops_assignment;
//7. Write a Java program to find sum of all odd numbers between 1 to n.
public class Problem7 {

	public static void main(String[] args) {
		int n=10;
		int sum=0;
		
		int i=1;
		while(i<=n)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		i++;	
		}
		System.out.println("Sum Of Odd : "+sum);
		
		
	}

}
