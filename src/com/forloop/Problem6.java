package com.forloop;
//WA to print factorial of number
public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fact=1;
		for(int i=num ; i>0 ; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
