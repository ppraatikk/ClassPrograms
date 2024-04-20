package com.basic;



public class FreqOfChar{
	
	public static void frequency(String s)
	{
		int arr[] = new int[20]; int x=0;
		char ch[] = new char[20];
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
				//System.out.println(s.charAt(i)+" "+count);
				if(count>0)
				{
					arr[x]=count;
					ch[x]=s.charAt(i);
					x++;
				}
				
			}
		}
		//System.out.println(maxchar+" "+max);
		int maximum=arr[0];
		char c=ch[0];
		//System.out.println(c);
		for(int i=0;i<x;i++)
		{
			if(arr[i]>maximum)
			{
				maximum=arr[i];
				c=ch[i];
			}
		}
		//System.out.println(maximum+" "+c);
		for(int i=0;i<x;i++)
		{
			int flag=0;
			if(arr[i]==maximum)
			{
				flag++;
				maximum=arr[i];
				c=ch[i];
			}
			if(flag==1)
			{
				System.out.println(maximum+" "+c);
			}
		}
		
			
	}

	public static void main(String[] args) {
		
		String s="my name is mprateek";
		FreqOfChar.frequency(s);
	}

}
