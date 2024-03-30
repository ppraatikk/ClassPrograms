package com.arrayDemo;

import java.util.Arrays;

public class ReverseArray {
	
	public static char[] reverseArray(char ch[])
	{
		int j=ch.length-1;
		
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			j--;
		}
		return ch;
	}
	public static void main(String[] args) {
		
		char ch[] = {'q','a','e','r','d'};
		char chh[]=ReverseArray.reverseArray(ch);
		System.out.println(Arrays.toString(chh));
		}

}
