package com.stringAssignment;

import java.util.Arrays;

public class CheckAnagram {
	public static void checkAnagram(String str1,String str2)
	{
		str1=str1.replaceAll(" ","").toLowerCase();
		str2=str2.replaceAll(" ","").toLowerCase();
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		
		
		if(str1.length()==str2.length())
		{
			boolean isAnagram = true;
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					isAnagram=false;
					break;
				}
			}
			if(isAnagram==false)
			{
				System.out.println("String is Not Anagram");
			}
			else
			{
				System.out.println("Strin is Anagram");
			}
		}
		else
		{
			System.out.println("String is not anagram");
		}
		
		
		
		   
	
		   
		
		
		
	}

	public static void main(String[] args) {
		
		String str1="Hello How are you";
		String str2=" how he llo you are";
		 

		CheckAnagram.checkAnagram(str1, str2);
	}

}
