package com.stringAssignment;

public class LongestWord {
	
	public static void findLongestWord(String str)
	{
		String st[]=str.split(" ");  int max=0;
		for(int i=0;i<st.length;i++)
		{
			if(st[i].length()>max)
			{
				max=st[i].length();
			}
		}
		for(int i=0;i<st.length;i++)
		{
			if(st[i].length()==max)
			{
				System.out.println(st[i]+" "+max);
			}
		}
	}

	public static void main(String[] args) {
		
		String str="Hello how are you my Friends";
		LongestWord.findLongestWord(str);
		
	}

}
