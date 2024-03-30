package com.forloop;

public class Prime_Numbers_1_to_20 {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
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
				System.out.println(i);
			}
		}
	}

}
