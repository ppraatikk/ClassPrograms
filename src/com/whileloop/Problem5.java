package com.whileloop;

//WA to print sum of digit of number

import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		int i=num;
		while(i!=0)
		{
			int digit=i%10;
			sum=sum+digit;
			i=i/10;
			
		}
		System.out.println(sum);
	}

}
