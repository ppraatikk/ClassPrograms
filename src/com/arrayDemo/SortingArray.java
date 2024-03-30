package com.arrayDemo;

import java.util.Arrays;

public class SortingArray {
	public static char[] sortAsscending(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				char temp = ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			}
		}
		return ch;
		//System.out.println(Arrays.toString(ch));
	}
	public static char[] sortDesscending(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char temp = ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		return ch;
		//System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {
		
		char ch[] = {'w','q','f','k','c'};
		char ch1[]=SortingArray.sortAsscending(ch);
	//	char ch2[]=SortingArray.sortDesscending(ch);
		System.out.println(Arrays.toString(ch1));
	//	System.out.println(Arrays.toString(ch2));
	}

}
