package com.classProgram;

import java.util.Scanner;
public class Program2 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character ");
		char ch =sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)
		{
			System.out.println("It is Capitial Character");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("It is Small character");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("it is digit");
		}
		else 
		{
			System.out.println("it is character");
		}
		
	}

}
