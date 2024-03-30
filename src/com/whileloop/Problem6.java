package com.whileloop;
//WA to check number is armstrong
import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int digit=0;
		int sum=0;
		int i=num;
		while(i!=0)
		{
		 digit=i%10;
		 sum=sum+digit*digit*digit;
		 i=i/10;
		}
		if(num==sum)
			System.out.println("number is armstrong");
		else
			System.out.println("number is not armstrong");
		
	}

}
