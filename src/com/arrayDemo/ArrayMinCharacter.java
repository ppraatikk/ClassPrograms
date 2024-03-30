package com.arrayDemo;

import java.util.Scanner;
public class ArrayMinCharacter {
	public static void minCharacter(char ch[])
	{
		char min = ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(min>ch[i])
			{
				min=ch[i];
			}
		}
		System.out.println("Minimum Character "+min);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter Size Of Array");
		int size = sc.nextInt();
		char ch[]= new char[size];
		System.out.println("Enter Character for array");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		ArrayMinCharacter.minCharacter(ch);
	}

}
