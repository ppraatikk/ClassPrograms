package com.arrayDemo;

import java.util.Scanner;
public class ArrayDemo4 {
	public static int sumOfEven(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static int sumOfOdd(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array ");
		int size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=sumOfEven(arr);
		System.out.println("Sum of Even Number in Array "+x);
		int y = sumOfOdd(arr);
		System.out.println("Sum of Odd Number in Array "+y);
	}

}
