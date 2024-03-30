package com.forloop;
//WA to check number is armstrong or not
public class Problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int digit=0;
		int sum=0;
		for(int i=num;i!=0;)
		{
			digit=i%10;
			sum=sum+digit*digit*digit;
			i=i/10;
			
		}
		
		if(num==sum)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
	}

}
