package com.forloop;
//Check number is krushnaMurthy

import java.util.Scanner;
public class KrishnaMurthyNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int digit=0;
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
		  digit=i%10;
		  int fact=1;
		  for(int j=digit;j>0;j--)
		  {
			fact=fact*j; 
		  }
		  sum=sum+fact;
		}
		if(sum==num)
			System.out.println("Number is krishnaMurthy ="+sum);
		else
			System.out.println("Number is Not KrishnaMurthy ="+sum);
	}

}
