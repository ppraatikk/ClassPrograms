package com.nested_for_loop;

//WA to print 1,8,9,64,25

import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter terms to print");
		int terms=sc.nextInt();
		for(int i=1;i<=terms;i++)
		{
			if(i%2==0)
			    System.out.println(i*i*i);
			
			else
				System.out.println(i*i);
			
		}
	}

}
