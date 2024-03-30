package com.nested_for_loop;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)     //1
			{                         //11
				System.out.print(k);  //111
			}                         //1111  
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)             //1
			{                                 //10
				if(j%2!=0)                    //101 
					System.out.print("1");    //1010
				else                          //10101  
					System.out.print("0");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------");
		
		for(int i=1;i<=4;i++)
		{
		 if(i%2!=0)
		 {
			 for(int j=1;j<=4;j++)
			 {
				 
			 }
		 }
		 else
		 {
			 
		 }
		}
		
		
		
	
 }
}
