package com.customException;


class InValidBinaryNumber extends Exception
{
	String msg;
	public InValidBinaryNumber()
	{
		System.out.println("Number is not Binary");
	}
	public InValidBinaryNumber(String msg)
	{
		super(msg);
	}
}


public class Demo1 {
	
	public static void check(int num) throws InValidBinaryNumber
	{
		int digit=0;  
		boolean present=true;
		for(int i=num;i>0;)
		{
			digit=i%10;
			
			if(digit>1 || digit<0)
			{
				present=false;
				break;
			}
		
		i=i/10;
		}
		
		if(present==false) 
		{
			throw new InValidBinaryNumber("Number is not conatin 1 and 0");
		}
		else
		{
			
			System.out.println("Binary Number");
		}
		
	}

	public static void main(String[] args) {
		
		try
		{
		Demo1.check(1110341100);
		}
		catch(InValidBinaryNumber e)
		{
			System.out.println(e);
		}

	}

}
