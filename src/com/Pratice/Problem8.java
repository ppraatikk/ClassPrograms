package com.Pratice;

public class Problem8 {

	public static void main(String[] args) {
		char ch[]= {'D','E','x','z','R'};
		
		char min=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]<min)
			{
				min=ch[i];
			}

		}
		System.out.println(min);

	}

}
