package com.final_static_assignment;

public class Sum {
	public int sum(int a,int b,int c,int d,int e)
	{
		return a+b+c+d+e;
	}

	public static void main(String[] args) {
		
		Sum s= new Sum();
		int res = s.sum(1, 2, 3, 4, 5);
		System.out.println(res);
	}

}
