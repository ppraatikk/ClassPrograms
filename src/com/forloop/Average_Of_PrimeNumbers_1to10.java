package com.forloop;

public class Average_Of_PrimeNumbers_1to10 {

	public static void main(String[] args) {
		float sum=0;
		int flag=0;
		
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
				flag++;
			}
			 
		}
		
		//System.out.println(flag);
		float avg=sum/flag;
		System.out.println(avg);
	}

}
