package com.method;
//WA to print sum of digit in number
public class Problem4 {

	public int sumOfNumber(int num)
	{
		int sum=0;
		
		for(int i=num;i!=0;)
		{
			int digit=i%10;
			sum+=digit;
			i=i/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem4 obj=new Problem4();
		int res=obj.sumOfNumber(149);
		System.out.println(res);
	}

}
