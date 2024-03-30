package com.array_Assignment;

import java.util.Arrays;
import java.util.Scanner;
public class Problem5 {
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
	public static void alternateArray(int arr[])
	{
		for(int i=arr.length-1;i>=0;i=i-2)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
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
		System.out.println("Display reverse Array");
		Problem5.reverseArray(arr);
		System.out.println("Display Reverse Array with Alternate Element");
		Problem5.alternateArray(arr);

	}

}
