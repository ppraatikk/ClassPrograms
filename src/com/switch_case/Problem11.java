package com.switch_case;
//program print total number of days in a month using switch case 

import java.util.Scanner;
public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month");
		int num =sc.nextInt();
		switch(num)
		{
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("31 days");
			break;
		case 2:System.out.println("28 or 29 days");
		       break;
		default:System.out.println("30 days");       
			
		}
	}

}
