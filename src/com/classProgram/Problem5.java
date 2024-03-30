package com.classProgram;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int digit=0;
		int sum=0;
//		for(int i=num;i>0;)
//		{
//			digit = i%10;                       
//			if(digit%2!=0)
//			{
//				sum=sum+digit;
//			}
//			
//			i=i/10;
//		}
//		System.out.println(sum);
		int i=num;                    
		while(i!=0)
		{
			digit=i%10;
			if(digit%2!=0)
			{
				sum=sum+digit;
			}
			i=i/10;
		}
		System.out.println(sum);
	}

}
