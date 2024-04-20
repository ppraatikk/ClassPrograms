package com.customException;

class StringContainDigit extends Exception
{
	String msg;
	public StringContainDigit()
	{
		System.out.println("String Contain Digit");
	}
	public StringContainDigit(String msg)
	{
		super(msg);
	}
	
	
}
public class Demo2 {
	public static void check(String str) throws StringContainDigit
	{
		String temp="";
		boolean isPresent =false;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				isPresent=true;
				break;
			}
			else
				temp=temp+ch[i];
		}
		if(isPresent==true)
		{
			throw new StringContainDigit("String Contain digit");
		}
		else
		{
			
			System.out.println(temp.toUpperCase());
		}
	}

	public static void main(String[] args) {
		
		try {
		Demo2.check("Hello12 My name is Pratik");
		}
		catch(StringContainDigit e)
		{
			System.out.println(e);
		}
	}

}
