package com.arrayDemo;

import java.util.Scanner;

public class SearchChar_From_CharArray {
	public static boolean checkChar(char ch[],char c)
	{
		boolean isPresent=false;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
			   isPresent = true;
				break;
			}
		}
		return isPresent;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch[] = {'a','b','X','d','E','G','q','e'};
		
		System.out.println("Enter Character To Check Present In ArraY Or Not");
		char c = sc.next().charAt(0);
		
		boolean result=SearchChar_From_CharArray.checkChar(ch,c);
		
		if(result)
			System.out.println("Character is Present");
		else
			System.out.println("Character Is Not Present");
		
	}

}
