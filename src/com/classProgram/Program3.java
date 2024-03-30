package com.classProgram;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch = sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)
		{
			System.out.println(ch=(char) (ch+32));
		}
		else if (ch>=97 && ch<=122)
		{
			System.out.println(ch= (char) (ch-32));
		}
		
		else 
		{
			System.out.println("it is not Alphabet "+ch);
		}
	}

}
