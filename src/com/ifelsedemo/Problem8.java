package com.ifelsedemo;
	//WA to find percentage of 5 subj out of 100 and find grade 
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int subj1=98;
		int subj2=87;
		int subj3=91;
		int subj4=76;
		int subj5=88;
		float per=(subj1+subj2+subj3+subj4+subj5)*100/500;
		if(per>=90)
			System.out.println("A grade");
		else if(per>=75 && per<90)
			System.out.println("B grade");
		else if(per>=50 && per<75)
			System.out.println("C is grade");
		else 
			System.out.println("F is grade");
	}

}
