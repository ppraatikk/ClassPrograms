package com.labSession;


class NumberNotAllowed extends Exception
{
	String msg;
	public NumberNotAllowed()
	{
		System.out.println("NumberNotAllowed");
	}
	public NumberNotAllowed(String msg)
	{
		super(msg);
	}
}

public class ExceptionDemo {
	
	public static void show(String str) throws NumberNotAllowed
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				throw new NumberNotAllowed("NumberNotAllowed");
				
			}
			else
			{
				s=s+str.charAt(i);
			}
				
		}
		System.out.println(s);
		
	}

	public static void main(String[] args) {
		
		String str="Sachin Scores 80 runs in ODI";
		try {
			show(str);
		}
		catch(NumberNotAllowed e)
		{
			System.out.println(e);
		}
	}

}
