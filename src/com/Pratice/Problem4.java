package com.Pratice;

public class Problem4 {

	public static void main(String[] args) {
		String str="Shamshinde.1321@gmail.com";
		
		boolean ans1=str.contains("@");
		boolean ans2=str.contains(".");
		if(ans1 && ans2)
			System.out.println("Valid Mail Id");
		else
			System.out.println("Not Valid Mail Id");
		
		


	}

}
