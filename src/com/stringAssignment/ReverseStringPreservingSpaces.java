package com.stringAssignment;

public class ReverseStringPreservingSpaces {
	
	public static void reverseStringWithSpaces(String str)
	{
		String st[]=str.split(" ");
		String s="";
		for(int i=st.length-1;i>=0;i--)
		{
			s=s+st[i]+" ";
		}
		System.out.println(s);
	}
	public static void reverseString(String str)
	{
		String st[]=str.split(" ");
		int j=st.length-1;
		for(int i=0;i<st.length/2;i++)
		{
			String temp=st[i];
			st[i]=st[j];
			st[j]=temp;
			j--;
		}
		for(String s:st)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		String str="Hello how Are you my friends!";
		reverseStringWithSpaces(str);
		
		reverseString(str);
	}

}
