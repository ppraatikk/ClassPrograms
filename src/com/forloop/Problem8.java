package com.forloop;
//WA to print sum of digit of given number
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=789;
		int sum=0;
		               
		for(int i=num;i!=0;)
		{
			 sum+=i%10;
			 i=i/10;
		    	 
		}
		System.out.println(sum);
	}

}
