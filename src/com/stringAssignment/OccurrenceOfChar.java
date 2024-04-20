package com.stringAssignment;

public class OccurrenceOfChar{
	
	// Count Each Char Frequency
	public static void OccurenceCountOfEachChar(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(ch[i]==ch[k])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
				}
				System.out.println(ch[i]+" "+count);
			}
		}
	}
	
	//Print First Occurrence Char
	public static void FirstOccurrenceChar(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(ch[i]==ch[k])
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
					}
				}
				if(count==1)
				{
					System.out.println(ch[i]+" "+count);
				}
			}
		}
	}
	
	//Find Highest Frequency Character
		public static void highFrequencyChar(String str)
		{
			char c[]=str.toCharArray();
			int arr[]=new int[c.length]; char ch[]=new char[c.length];
			int x=0;
		    for(int i=0;i<c.length;i++)
		    {
			   int count=1;
			   boolean isVisited=false;
			   for(int k=i-1;k>=0;k--)
			   {
				   if(c[i]==c[k])
				   {
					   isVisited=true;
					   break;
				   }
			   }
				if(isVisited==false)
				 {
					   
					   for(int j=i+1;j<c.length;j++)
					   {
						   if(c[i]==c[j])
						   {
							   count++;
						   }
					   } 
					   if(count>0)
					      {
						   arr[x]=count;
						   ch[x]=c[i];
						   x++;
						  }   
				   }
		    }
		    int max=arr[0];
		   
			for(int i=0;i<x;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
					
				}
			}
			for(int i=0;i<x;i++)
			{
				if(arr[i]==max)
				{
					System.out.println(ch[i]+" "+arr[i]);
				}
			}
		    
		   
				   
		}
		
		//Find Lowest Frequency Character
		public static void lowFrequencychar(String str)
		{
			 
			char c[]=str.toCharArray();
			char ch[] = new char[c.length]; int arr[] = new int[c.length];
			int x=0;
			
			
			for(int i=0;i<c.length;i++)
			{
				boolean isVisited=false;
				int count=1;
				for(int k=i-1;k>=0;k--)
				{
					if(c[i]==c[k])
					{
						isVisited=true;
						break;
					}
				}
				if(isVisited==false)
				{
					for(int j=i+1;j<c.length;j++)
					{
						if(c[i]==c[j])
						{
							count++;
						}
					}
					if(count>0)
					{
						arr[x]=count;
						ch[x]=c[i];
						x++;
					}
				}	
			}
			int min=arr[0];
			char cc=ch[0];
			 for(int i=0;i<x;i++)
			 {
				 if(arr[i]<min)
				 {
					 min=arr[i];
					 cc=ch[i];
				 }
			 }
			 
			 for(int i=0;i<x;i++)
			 {
				 if(arr[i]==min)
				 {
					System.out.println(ch[i]+" "+arr[i]);
				 }
			 }
		}		 
			
						
	
	public static void main(String[]args) {
		
		String str="hello friendso how are you";
		OccurrenceOfChar.OccurenceCountOfEachChar(str);
		System.out.println("/////////////////////");
		OccurrenceOfChar.FirstOccurrenceChar(str);
		System.out.println("////////////////////////");
		OccurrenceOfChar.highFrequencyChar(str);
		System.out.println("///////////////////////");
		OccurrenceOfChar.lowFrequencychar(str);
		
	}
	
}
