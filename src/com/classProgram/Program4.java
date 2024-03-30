package com.classProgram;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check even/Odd");
		int num=sc.nextInt();
		
		switch(num%2)
		{		 
		case 0 : System.out.println("Number IS Even");
				 break;
		default : System.out.println("Number Is Odd");		 
		}
		

	}

}
