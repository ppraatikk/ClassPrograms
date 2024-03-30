package com.array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
	public static void findDuplicte(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count>1)
			{
				System.out.println(arr[i]+"--"+count);
			}
			
		}	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Problem11.findDuplicte(arr);

	}

}
