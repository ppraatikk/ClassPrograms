package com.basic;



public class FIrstLetterCapital {
	public static void capitalFirstChar(String s)
	{
		String capital="";
		String st[]=s.split(" ");
		String word="";
		for(int i=0;i<st.length;i++)
		{
			word=st[i];
			char ch[]=word.toCharArray();
			
			for(int j=0;j<ch.length;j++)
			{
				if(j==0)
				{
					ch[j]=(char) (ch[j]-32);
					capital=capital+ch[j];
					
				}
				
				else
				{
					capital=capital+ch[j];
				}
			}
			
			capital=capital+" ";
		}
		System.out.println(capital);
	}

	

	public static void main(String[] args) {
		
		
		String s= "my name is pratekk";
		 FIrstLetterCapital.capitalFirstChar(s);

	}

}
