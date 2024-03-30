package com.arrayDemo;

import java.util.Arrays;

public class PrintAlternateChar_fromCharArray {
	public static void alternateCharArray(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='X')
			{
				ch[i]= (char)(ch[i]+2);
			}
			else if(ch[i]>='a' && ch[i]<='x')
			{
				ch[i]= (char)(ch[i]+2);
			}
			else if(ch[i]>='Y' || ch[i]<='Z')
			{
				ch[i]= (char)(ch[i]-24);
			}
			else if(ch[i]>='y' || ch[i]<='z')
			{
				ch[i]= (char)(ch[i]-24);
			}
//			else if(ch[i]>='Y' || ch[i]<='Z')
//			{
//    			ch[i]= (char)(ch[i]+8);	        }
//			else if(ch[i]>='y' || ch[i]<='z')
//			{
//				ch[i]= (char)(ch[i]+71);
//			}
		}
		System.out.println(Arrays.toString(ch));
	}

	public static void main(String[] args) {

		
		
		char ch[] = {'r','v','A','t','c','y','Z'};
		
		PrintAlternateChar_fromCharArray.alternateCharArray(ch);
		
	}

}
