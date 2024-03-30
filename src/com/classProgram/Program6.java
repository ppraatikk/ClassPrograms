package com.classProgram;

import java.util.Scanner;

public class Program6 {
				public static void isPrime(int num)
				{
					int digit=0;
					for(int i=num;i>0;)
					{
					  digit=i%10; int count=0;
					  for(int j=1;j<=digit;j++)
					  {
						 if(digit%j==0)
						 {
							 count++;
						 }
					  }
					  if(count<=2)
					  {
						  System.out.println(digit);
					  }
					  i=i/10;
					}
					
				}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		Program6.isPrime(num);
			
//		int i=num; int digit=0;
//		while(i>0)
//		{
//		 digit = i%10;
//	     int count =0;
//		 for(int j=1;j<=digit;j++)
//		 {
//            if(digit%j==0)
//			{
//			 count++; 
//			}
//		 }
//		 if(count==2)
//		 {
//		 System.out.println(digit+" ");
//		 }
//		 i=i/10;
//		}
		
		

	}

}
