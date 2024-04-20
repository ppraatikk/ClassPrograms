package com.stringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
	
	public static void avgOfDigit(String str)
	{
		int count=0;
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				sum=sum+Character.getNumericValue(str.charAt(i));
				count++;
			}
		}
		double avg=(double)sum/count;
		System.out.println("Average Of Digit : "+avg);
	}
	public static void sumOfEven(String str)
	{
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				if(Character.getNumericValue(str.charAt(i))%2==0)
				{
					sum=sum+Character.getNumericValue(str.charAt(i));
				}
			}
		}
		System.out.println("Sum Of Even Number : "+sum);
	}
	public static void sortDescending(String str1)
	{
		String st[]=str1.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].length()<st[j].length())
				{
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(st));
	}
	public static void  sortDescendingAscii(String str2)
	{
		String stt[]=str2.split(" ");
		
		for(int i=0;i<stt.length;i++)
		{
			for(int j=i+1;j<stt.length;j++)
			{
				if(stt[i].length()<stt[j].length())
				{
					String temp=stt[i];
					stt[i]=stt[j];
					stt[j]=temp;
				}
				else if(stt[i].length()==stt[j].length())
				{
					
						if(stt[i].compareTo(stt[j])<0)
						{
							String temp=stt[i];
							stt[i]=stt[j];
							stt[j]=temp;
						}
							
				}
			  }
			}
		System.out.println(Arrays.toString(stt));
		}
		
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		Demo3.avgOfDigit(str);
		Demo3.sumOfEven(str);
		
		String str1=new String("Hello Coding how aaa going");
		Demo3.sortDescending(str1);
		String str2="Hello Coding how aaa going";
		Demo3.sortDescendingAscii(str2);

	}

}
