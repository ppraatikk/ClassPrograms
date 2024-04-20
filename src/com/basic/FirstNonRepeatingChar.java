package com.basic;

public class FirstNonRepeatingChar {
	
	public static void findchar(String s)
	{
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
				if(count==1)
				{
					System.out.println(s.charAt(i)+" "+count);
					
					
					break;
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		
		String s="my name is prateek";
		FirstNonRepeatingChar.findchar(s);

	}

}
