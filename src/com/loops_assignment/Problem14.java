package com.loops_assignment;
//WAP to accept base and index from user and calculates power

import java.util.Scanner;
public class Problem14 {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Base");
	int base =sc.nextInt();
	
	System.out.println("Enter Exponent");
	int exp =sc.nextInt();
	
	int pow =1;
	for(int i=1;i<=exp;i++)
	{
	 	pow=pow*base;
	}
	System.out.println(pow);
	}

}
