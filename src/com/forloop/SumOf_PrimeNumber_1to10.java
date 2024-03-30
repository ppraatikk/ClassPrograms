package com.forloop;
//Sum of prime Number 1-10

public class SumOf_PrimeNumber_1to10 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int count=0;
			for(int num=1;num<=i;num++)
			{
				if(i%num==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
