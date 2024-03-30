package com.nested_for_loop;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i='A';i<='D';i++)
		{
			for(char j='A';j<='D';j++)   //AAAA
			{                            //BBBB
				System.out.print(j);     //CCCC
			}                            //DDDD
			System.out.println("");
		}
		
		System.out.println("-----------------");
		
		for(char i='A';i<='D';i++)
		{                                  //A
			for(char j='A';j<=i;j++)       //AB
			{                              //ABC
				System.out.print(j);       //ABCD
			}
			System.out.println("");
		}
		
		System.out.println("---------------------");
		
		for(char i='A';i<='D';i++)             
		{                                      //ABCD
			char ch='A';                       //ABC
			for(char j=i;j<='D';j++)           //AB
			{                                  //A
				System.out.print(ch);
				ch++;
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------");
		
		for(char i='A';i<='D';i++)
		{                                   //DCBA
			for(char j='D';j>=i;j--)        //DCB
			{                               //DC  
				System.out.print(j);        //D
			}
			System.out.println("");
		}
	}

}
