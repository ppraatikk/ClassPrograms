package com.stringBuilderORBuffer;

public class Demo2 {
	public static void checkStringPallindrome(String st)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=st.length()-1;i>=0;i--)
		{
			sb.append(st.charAt(i));
		}
		String s=sb.toString();
		
		if(s.equals(st))
			System.out.println("String is pallindrome");
		else
			System.out.println("String is not Pallindrome");
		
	}
	public static void longestWord(String st1)
	{
		String s[]=st1.split(" ");
		int length=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>length)
			{
				length=s[i].length();
			}
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==length)
			{
				System.out.println(s[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		
		String st="axa";
		Demo2.checkStringPallindrome(st);
		
		String st1="How are you my friends! Java is coding language ";
		Demo2.longestWord(st1);
	}

}
