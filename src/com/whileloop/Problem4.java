package com.whileloop;

//WA to check prime number

import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int count=0;
		int i=1;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
		 i++;	
		}
		if(count==2)
			System.out.println(num+"is prime number");
		else
			System.out.println(num+"is not prime");
	}

}
