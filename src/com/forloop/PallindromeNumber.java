package com.forloop;
//Check Number is Pallindrome or not

import java.util.Scanner;
public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int rev=0;
		int digit=0;
		for(int i=num;i>0;i=i/10)
		{
			digit=i%10;
			rev=(rev*10)+digit;
		}
		if(rev==num)
			System.out.println("Number is Palliindrome ="+rev);
		else
			System.out.println("Number is Not Pallindrome ="+rev);
	}

}

