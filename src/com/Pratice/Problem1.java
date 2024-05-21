package com.Pratice;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		
	String str="Pratik Shinde";
	String temp="";
	
	
	str.toLowerCase();
	System.out.println(str);
	System.out.println("////////////////////////////////");
	
	
	
	str.toUpperCase();
	System.out.println(str);
	System.out.println("////////////////////////////////");
	
	
	
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)>='A' && str.charAt(i)<='Z')
		{
			temp=temp+(char) (str.charAt(i)+32);
		}
		else
		{
			temp=temp+str.charAt(i);
		}
	}
	System.out.println(temp);
	System.out.println("////////////////////////////////");
		
	
	String s="Hello$World";
	String[] arr=s.split("\\$");
	System.out.println(Arrays.toString(arr));
	for(String a:arr)
	{
		System.out.println(a);
	}
	
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		boolean isVisited=false;
		int count=1;
		for(int k=i-1;k>=0;k--)
		{
			if(ch[i]==ch[k])
			{
				isVisited=true;
				break;
			}
		}
		if(isVisited==false)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			System.out.println(ch[i]+" "+count);
		}
	}
	
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			count++;
		}
	}
	System.out.println(count);
	

	String temp1="";
	for(int i=str.length()-1;i>=0;i--)
	{
		temp1=temp1+str.charAt(i);
	}
	System.out.println(temp1);
	
	
	String [] arr1=str.split(" ");
	String temp4="";
	for(int i=0;i<arr1.length;i++)
	{
		String temp2=arr1[i];
		String temp3="";
		for(int j=temp2.length()-1;j>=0;j--)
		{
			
			temp3=temp3+temp2.charAt(j);
			
		}
		 temp4=temp4+temp3+" ";
	}
	System.out.println(temp4);
	
//	String temp4=new String(arr1.toString());
//	System.out.print(temp4);
//	System.out.println(Arrays.toString(arr1));
	
	
	
	
	}

}
