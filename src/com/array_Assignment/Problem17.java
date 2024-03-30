package com.array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Problem17 {
	public static void reverseArray(int arr[])
	{
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Element of Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Problem17.reverseArray(arr);
		
		
		
		
		
		

	}

}
