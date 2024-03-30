package com.classProgram;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int digit=0;
		 int i=num;  int sum=0;
		
		while(i>0)
		{
			digit=i%10;
			int fact=1;
			for(int j=1;j<=digit;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			i=i/10;
		}
		System.out.println(sum);
		

	}

}
