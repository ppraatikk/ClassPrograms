package com.stringAssignment;

public class VowelsAndConsonants {
	
	// Count Of Vowels And Consonants
	public static void countVowel_Consonant(String str)
	{
		String s=str.toLowerCase();    int vowel=0;
		String st[]=s.split(" ");       int consonant=0;

		for(int i=0;i<st.length;i++)
		{
			char ch[]=st[i].toCharArray();
			
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
			}
		
		}
		
		System.out.println("Vowels are : "+vowel);
		System.out.println("Consonants are : "+consonant);
		
	}

	public static void main(String[] args) {
		
		String str="India is My contry i love India";
		VowelsAndConsonants.countVowel_Consonant(str);
	}

}
