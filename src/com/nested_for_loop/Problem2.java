package com.nested_for_loop;

//WA to print 1,3,7,15,31

import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms");
		int terms=sc.nextInt();
		int i=1;
		int ele=1;
		do
		{
			
			System.out.println(ele);
			ele=2*ele+1;
			i++;
		}while(i<=terms);
	}

}
