package com.whileloop;

//WA to print factorial 

import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to factoral");
		int num=sc.nextInt();
		int i=num;
		int fact=1;
		while(i>0)
		{
		fact=fact*i;
		i--;
		}
		System.out.println(fact);
	}

}
