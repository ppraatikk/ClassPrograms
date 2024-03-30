package com.loops_assignment;
// s=1!+2!+3!.........+n! find s
public class Problem15 {

	public static void main(String[] args) {
		
     int n=5;
     int sum=0;
     for(int i=1;i<=n;i++)
     {
    	 int fact =1;
    	 for(int j=1;j<=i;j++)
    	 {
    		 fact=fact*j;
    	 }
    	 sum=sum+fact;
     }
     System.out.println(sum);
	}

}
