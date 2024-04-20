package com.stringDemo;

public class Demo2 {
	public static void countChar(String str)
	{
		System.out.println("Count Of Charcter From String :"+str.length());
	}
	public static void countWord(String str)
	{
		String s[]=str.split(" ");
		System.out.println("Count Of Word is :"+s.length);
	}
	public static void reverseWord(String str)
	{
	 String s[] =str.split(" ");
	 String reverse=" ";
	 for(int i=0;i<s.length;i++)
	 {
		 if(i==0 || i==s.length-1)
		 {
			reverse=reverse+s[i];
		 }
		 else 
	     {
			 String word =s[i];
			 String revword=" ";
			 for(int j=word.length()-1;j>=0;j--)
			 {
				 revword=revword+word.charAt(j);
			 }
			 reverse=reverse+revword+" ";
		 }
	 }
	 System.out.println(reverse);

		
	}
	public static void countVowels(String str)
	{
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		
		}
		System.out.println("Vowels is : "+count);
		
	}

	public static void main(String[] args) {
		
		String str = "What are you doing";
		Demo2.countChar(str);
		Demo2.countWord(str);
		Demo2.countVowels(str);
		Demo2.reverseWord(str);
	}

}
