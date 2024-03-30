package com.arrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 char ch[] = new char[3];
		 System.out.println("Enter character");
		 for(int i=0;i<ch.length;i++)
		 {
			 ch[i]=sc.next().charAt(0);
		 }
		 System.out.println("Display ........");
		 for(int i=0;i<ch.length;i++)
		 {
			System.out.println(ch[i]); 
		 }
		 System.out.println("Display ........");
		 for(char c:ch)
		 {
			 System.out.println(c);
		 }
		 System.out.println("Display ........");
		 System.out.println(Arrays.toString(ch));

	}

}
