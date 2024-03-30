package com.array_2D;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][]= { {1,2,3},{4,5,6},{7,8,9}};
		
		int b[][]=new int [3][2];
		b[0][0]=9;
		b[0][1]=8;
		b[1][0]=7;
		b[1][1]=6;
		b[2][0]=5;
		b[2][1]=4;
		
		int c[][]=new int [4][4];
		System.out.println("Enter Number ");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("////////////////////////");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("////////////////////////");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
