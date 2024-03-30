package com.forloop;
//WA to print answer when base and exponent are given 
public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base =2;
		int exp =3;
		int pow=1;
		for(int i=1;i<=exp;i++)
		{
			pow=pow*base;
		}
		System.out.println(pow);
	}

}
