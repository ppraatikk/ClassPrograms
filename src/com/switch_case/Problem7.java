package com.switch_case;
//WA program to input any alphabet and check whether it is vowel or consonant

import java.util.Scanner;
public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Charcter");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case'a': System.out.println("a is vowel");
				 break;
		case'e': System.out.println("e is vowel");
				 break;	
		case'i': System.out.println("i is vowel");
				 break;
		case'o': System.out.println("o is vowel");
				 break;
		case'u': System.out.println("u is vowel");
				 break;
		default: System.out.println("it is consonent");		 
		
		}
	}

}
