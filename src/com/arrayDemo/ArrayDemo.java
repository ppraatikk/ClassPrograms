package com.arrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Number");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Display ........");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Display ........");
		for(int x:arr)
		{
			System.out.println(x);
		}
		System.out.println("Display ........");
		System.out.println(Arrays.toString(arr));
	
	}

}
