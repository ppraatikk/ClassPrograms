package com.array_Assignment;

import java.util.Scanner;
public class Problem6 {
	
	public static int average(int arr[])
	{
		int sum=0;
		for(int x:arr)
		{
			sum=sum+x;
		}
		return sum;
	}
	
	public static double average(double ar[])
	{
		double sum=0;
		for(double x:ar)
		{
			sum=sum+x;
		}
		return sum;	
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Size of Int Type Array");
		int size1 = sc.nextInt();
		int arr[]=new int[size1];
		System.out.println("Enter Element Of Int Type Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		
		System.out.println("Enter Size Of Double type Of Array");
		int size2 = sc.nextInt();
		double ar[] = new double[size2];
		System.out.println("Enter Element of Double type Of Array");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextDouble();
		}
		
		int avg1=Problem6.average(arr);
		double avg2=Problem6.average(ar);
		
		System.out.println("Average Of Int Type Array : "+avg1/size1);
		System.out.println("Average Of Double Type Array : "+avg2/size2);
		

	}

}
