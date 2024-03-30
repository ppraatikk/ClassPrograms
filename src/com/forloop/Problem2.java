package com.forloop;
//WA to print number from 1 to 100 which is divisible by 2 and 3
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i);
			}
		}
	}

}
