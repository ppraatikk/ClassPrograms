package com.forloop;
//WA to print max digit in given number
public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=78945;
		int digit=0;
		int max=0;
		for(int i=num;i!=0;)
		{
			digit=i%10;
			i=i/10;
			if(digit>max)
			{
				max=digit;
			}
			
		}
		System.out.println(max);
	}

}
