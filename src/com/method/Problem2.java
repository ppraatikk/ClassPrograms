package com.method;
//WA to print factorial
public class Problem2 {
	
	public int factorial(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
			  fact=fact*i;
			
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2 obj=new Problem2();
		int res=obj.factorial(5);
		System.out.println(res);
	}

}
