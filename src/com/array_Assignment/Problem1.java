package com.array_Assignment;

import java.util.Arrays;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Element For Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
//		for(int x:arr)
//		{
//			System.out.println(x);
//		}
		System.out.println(Arrays.toString(arr));
	}

}
