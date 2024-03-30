package com.method;
//WA to check number is armstrong or not
public class Problem5 {
	
	public boolean armstrong(int num)
	{
		int sum=0;
		for(int i=num;i!=0;)
		{
			int digit=i%10;
			sum=sum+digit*digit*digit;
			i=i/10;
		}
		if(sum==num) 
			return true;
		else
			return false;

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem5 obj = new Problem5();
		boolean res=obj.armstrong(153);
		System.out.println(res);
	}

}
