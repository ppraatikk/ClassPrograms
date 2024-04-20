package com.array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Problem11 {
	public static void findDuplicte(int arr[])
	{
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(arr[i]==arr[k])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						flag++;
					}
				}
				if(count>1)
				{
					System.out.println(arr[i]);
				}
			}	
		}	
		System.out.println("COunt Of Duplicate Element is "+flag);
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
		System.out.println("///////////////////");
		Problem11.findDuplicte(arr);

	}

}
