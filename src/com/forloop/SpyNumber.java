package com.forloop;
//Check Number is spy or not

import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;int mul=1;int digit=0;
		
		for(int i=num;i>0;i=i/10)
		{
			digit=i%10;
				mul=mul*digit;
				sum=sum+digit;
		}
		if(mul==sum)
			System.out.println("Number Is Spy");
		else
			System.out.println("Number Is Not Spy");
		
		
	}

}
