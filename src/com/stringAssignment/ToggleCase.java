package com.stringAssignment;



public class ToggleCase {
	public static void toggleCase(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 && ch[i]<=90)
			{
				ch[i]=(char) (ch[i]+32);
			}
			else if(ch[i]==' ')
			{
			ch[i]=ch[i];
			}
			else
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		String s=new String(ch);
		System.out.println(s);
	}
	public static void toggle(String str)
	{
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++)
		{
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<st[i].length();j++)
			{
				char ch=st[i].charAt(j);
				if(ch>='a' && ch<='z' )
				{
					sb.append((char)(ch-32));
				}
				else if(ch>='A' && ch<='Z')
				{
					sb.append((char)(ch+32));
				}
				else
				{
					sb.append(ch);
				}
			}
			st[i]=sb.toString();
		}
		
		for(String s:st)
		{
			System.out.print(s+" ");
			
		}
		
	}

	public static void main(String[] args) {
		
		
		String str="My Name Is PratiK";
		ToggleCase.toggleCase(str);
		
		ToggleCase.toggle(str);
	}

}
