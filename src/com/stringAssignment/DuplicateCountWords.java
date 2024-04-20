package com.stringAssignment;

public class DuplicateCountWords {
	
	public static void duplicateWord(String str)
	{
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>0;k--)
			{
				if(st[i].equals(st[k]))
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<st.length;j++)
				{
					if(st[i].equals(st[j]))
					{
						count++;	
					}
				}
				if(count>1)
				{
					System.out.println(st[i]+" "+count);
				}
			}
		}
	}
	public static void countWord(String str)
	{
		String st[]=str.split(" ");
		System.out.println("Words "+st.length);
	}

	public static void main(String[] args) {
		String str="Hello World How Are You How Can I Help You Java Is Case Sensitive Language";
			
		DuplicateCountWords.duplicateWord(str);
		DuplicateCountWords.countWord(str);
	}

}
