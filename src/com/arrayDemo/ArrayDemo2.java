package com.arrayDemo;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f[]= new float[3];
		System.out.println("Enter Number in float ");
		for(int i=0;i<f.length;i++)
		{
			f[i]=sc.nextFloat();
		}
		System.out.println("Display ........");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		System.out.println("Display ........");
		for(float x:f)
		{
			System.out.println(x);
		}
		System.out.println("Display ........");
		System.out.println(Arrays.toString(f));
		
	}

}
