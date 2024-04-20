package com.stringAssignment;

import java.util.Arrays;

public class CopySplitOccurance {
	
	//Copy String in New String
	public static void copyString(String st)
	{
		String s="";
		for(int i=0;i<st.length();i++)
		{
			s=s+st.charAt(i);
		}
		System.out.println(s);
	}
	
	//Split Of String
	public static void splitString(String st1)
	{
		String s[]=st1.split("\\$");
		System.out.println(Arrays.toString(s));
	}
	
	//Count Of Occurrence Of First Char
	public static void OccuranceOfFirstChar(String st2)
	{
		char ch = 0;
		for(int i=0;i<st2.length();i++)
		{
			if(i==0)
			{
				ch=st2.charAt(i);
				break;
			}
			
		}
		System.out.println(ch);
		
		int count=0;
		for(int i=0;i<st2.length();i++)
		{
			if(ch==st2.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String st="Coding";
		String st1="Hello$World";
		String st2="my name is moon";
		
		CopySplitOccurance.copyString(st);
		CopySplitOccurance.splitString(st1);
		CopySplitOccurance.OccuranceOfFirstChar(st2);
	}

}
