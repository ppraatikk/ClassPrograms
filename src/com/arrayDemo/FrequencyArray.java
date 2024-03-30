package com.arrayDemo;

public class FrequencyArray {
	public static void findFrequency(char ch[])
	{
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
			 System.out.println(ch[i]+"    "+count);
			}
		}
	}

	public static void main(String[] args) {
		
		
		char ch[] = {'a','!','s','e','q','a','M','m','s','d','w','a','x','a'};
		
		FrequencyArray.findFrequency(ch);
		System.out.println(ch.length);

	}

}
