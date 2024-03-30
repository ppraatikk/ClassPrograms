package com.method;
//WA to print fibonacci series 0,1,1,2,3,5,8,13,21,34
public class Problem6 {
	
	public void fibonacciSeries(int terms)
	{
		int fno=0;
		int sno=1;
		System.out.println(fno);
		System.out.println(sno);          
		
		int tno=0;
		for(int i=3;i<=terms;i++)
		{
			tno=fno+sno;
			System.out.println(tno);
			fno=sno;
			sno=tno;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem6 obj=new Problem6();
		obj.fibonacciSeries(10);
	}

}
