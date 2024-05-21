package com.Pratice;

public class Problem3 {

	public static void main(String[] args) {
		String st1="lol";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=st1.length()-1;i>=0;i--)
		{
			sb.append(st1.charAt(i));
		}
		System.out.println(sb);

		if(st1.equals(sb.toString()))
			System.out.println("String Anagaram");
		else
			System.out.println("String is Not Anagaram");
	}

}
