package com.forloop;
//WA to check number is prime or not take input from user
import java.util.Scanner;
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check number is prime or not");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("Number is prime");
		else
			System.out.println("number is not prime");
	}

}
