package com.stringAssignment;

public class RemoveCharacter {
	public static void repeatedChar(String str)
	{
		String s="";
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
				if(count>1)
				{
					if(ch[i]!=' ')
					{
						ch[i]=' ';
					}
				}
			}
		}	
		StringBuilder result = new StringBuilder();
        for (char c : ch) {
            if (c != ' ') {
                result.append(c);
            }
        }
       System.out.println(result.toString());
    }
		
	public static void main(String[] args) {
		
		String str="hello my name is prateek";
		repeatedChar(str);
	}

}
