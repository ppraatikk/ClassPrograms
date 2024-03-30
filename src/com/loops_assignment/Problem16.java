package com.loops_assignment;
// check no is krishnamurthi or not
//153=1!+5!+3!=153

public class Problem16 {

	public static void main(String[] args) {
		int digit=0;  int sum=0;
		int num=153;  
		
		 for(int i=num;i>0;)
		 {
			digit=i%10;
			int fact=1;
			for(int j=digit;j>0;j--)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			i=i/10;
		 }
		 if(num==sum)
			 System.out.println("Number is krishnamurthy");
		 else
			 System.out.println("Number is Not krishnamurthy");
	}

}
