 package com.array_Assignment;

import java.util.Scanner;

public class Problem3 {
	public static int check(int arr[],int num)
	{
		int temp=0;
		for(int i =0;i<=arr.length;i++)
		{
			if(arr[i]==num)
			{
				temp=i;
				break;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Element Of Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Number to check in array And Return Index");
		int num = sc.nextInt();
		
		int position = Problem3.check(arr,num);
		System.out.println("Position is "+position);
	}

}
