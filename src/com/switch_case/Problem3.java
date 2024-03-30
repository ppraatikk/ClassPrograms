package com.switch_case;
//WA to print vowels
import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
				System.out.println("a");
				break;
		case 'e':
				System.out.println("e");
				break;
		case 'i':
				System.out.println("i");
				break;
		case 'o':
				System.out.println("o");
				break;
		case 'u':
				System.out.println("u");
				break;
		default :
				System.out.println("not vowel");
		}
	}
}
