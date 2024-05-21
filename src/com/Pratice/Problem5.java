package com.Pratice;

public class Problem5 {

	public static void main(String[] args) {
		String str="Ishwari";
		String temp="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				temp=temp+(char)(str.charAt(i)+1);
			}
			else if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||
					str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				temp=temp+(char)(str.charAt(i)+1);
			}
			else
			{
				temp=temp+str.charAt(i);
			}
		}
		System.out.println(temp);
		

	}

}
