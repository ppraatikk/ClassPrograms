package com.forloop;
//Check number is Armstrong or Not

import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count=0;
		int digit=0;
		int sum=0;		
		for(int i=num;i>0;)
		{
			i=i/10;
			count++;
		}
		
		for(int i=num;i>0;i=i/10)
		{
		  digit=i%10;
		  int pow=1;
		  for(int j=1;j<=count;j++)
		   {
			 pow=pow*digit; 
		   }
		  sum=sum+pow;
		}
		if(sum==num)
			System.out.println("Number is Armstrong ="+sum);
		else
			System.out.println("Number is Not Armstrong ="+sum);
	}

}
