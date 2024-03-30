package com.ifelsedemo;
	//WA to find Discounted amount from the sale
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale = 35000;
		int disc = 0;
		if(sale>20000 && sale<30000)
			System.out.println(disc=sale*10/100);
		else if(sale>=30000 && sale<40000)
			System.out.println(disc=sale*15/100);
		else if(sale>=40000 && sale<50000)
			System.out.println(disc=sale*18/100);
		else if(sale>=50000)
			System.out.println(disc=sale*25/100);
		
	}

}
