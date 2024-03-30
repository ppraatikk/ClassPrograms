package com.forloop;
//WA to print fibonacci series
//0,1,1,2,3,5,8,13,21,34
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int first=0;
		int second=1;
		System.out.println(first);
		System.out.println(second);
		for(int i=3;i<=num;i++)
		{
			int total=first+second;
			System.out.println(total);
			first=second;
			second=total;
		}
	}

}
