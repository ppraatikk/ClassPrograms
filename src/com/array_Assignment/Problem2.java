package com.array_Assignment;

import java.util.Scanner;
//import java.util.Arrays;
public class Problem2 {
	int sum=0;
	public int sum(int arr[])
	{
		int sum=0;
		for(int x:arr)
		{
			sum=sum+x;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter Element of Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Problem2 p = new Problem2();
		int sum=p.sum(arr);
		float sum1 = (float)sum;
		
		System.out.println(" Average Of Sum "+sum1/size);

	}

}
