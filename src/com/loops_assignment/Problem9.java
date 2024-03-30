package com.loops_assignment;
//9.Write a Java program to calculate product of digits of any number.

public class Problem9 {

	public static void main(String[] args) {
			int digit=0;
			int product=1;
			
			int num=1234;
			for(int i=num;i>0;)
			{
				digit=i%10;
				product=product*digit;
				i=i/10;
			}
			System.out.println("Product Of Digits In Number is : "+product);
	}

}
