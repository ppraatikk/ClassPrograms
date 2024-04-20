package com.stringAssignment;

public class Vowel_replaceBy_nextCharacter {
	
	public static void replaceVowel(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=(char) (ch[i]+1);
			}
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				ch[i]=(char) (ch[i]+1);
			}
		}
		String s=new String(ch);
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		String str="Hello My Old Friend Name is Pratik ";
		Vowel_replaceBy_nextCharacter.replaceVowel(str);

	}

}
