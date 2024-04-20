package com.stringAssignment;

public class OccurrenceOfWord {
	
	//Count Of words in String
	public static void countOfWord(String str)
	{
		String st[]=str.split(" ");
		System.out.println("Count Of Word : "+st.length);
	}
	
	//Print First Occurrence Words
	public static void FirstOccurrenceWord(String str)
	{
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
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
				if(count==1)
				{
					System.out.println(st[i]+" "+count);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		String str="hello Friends how are you and what are you doing";
		
		OccurrenceOfWord.countOfWord(str);
		System.out.println("/////////////////////");
		OccurrenceOfWord.FirstOccurrenceWord(str);
		

	}

}
