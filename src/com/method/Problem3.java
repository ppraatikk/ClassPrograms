package com.method;
//WA to print check number is prime or not
public class Problem3 {
	
	public boolean isprimeNumber(int num)
	{
		
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}	
		if(count==2)
		{
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem3 obj=new Problem3();
		boolean res=obj.isprimeNumber(37);
		System.out.println(res);
	}

}
