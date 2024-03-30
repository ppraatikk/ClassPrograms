package com.switch_case;
//WA to perform area,circumference,perimeter,triangle
import java.util.Scanner;
public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Which Operration We Want To Perform");
		System.out.println("                              ");
		System.out.println("1.Area Of Circle");
		System.out.println("2.Area Of Square");
		System.out.println("3.Area Of Rectangle");
		System.out.println("4.Circumference Of Circle");
		System.out.println("5.Perimerter Of Rectangle");
		System.out.println("6.Area Of Right Angled Triangle");
		System.out.println("                              ");
		System.out.println("Enter Number to perform Operation");
		int operations=sc.nextInt();
		switch(operations)
		{
		case 1:
			   System.out.println("Area Of Circle");
			   System.out.println("Enter Radius");
			   float r=sc.nextFloat();
			   float res=(float) (3.14*r*r);
			   System.out.println("Area is "+res);
			   break;  				
			  
		case 2:
			   
			   System.out.println("Area Of Square");
			   System.out.println("Enter Side");
			   int side=sc.nextInt();
			   System.out.println("Area is "+side*side);
			   break; 
		case 3:		   
			  
			   System.out.println("Area Of Rectangle ");
			   System.out.println("Enter Length");
			   int l=sc.nextInt();
			   System.out.println("Enter Breadth");
			   int b=sc.nextInt();
			   System.out.println("Area is "+l*b);
			   break;  						   	
		case 4: 
			   
			   System.out.println("Circumference Of Circle");
			   System.out.println("Enter radius");
			   float rad= sc.nextFloat();
			   float ress= (float)(3.14*2*rad);
			   System.out.println("Circumference is "+ress);
			   break;  
			  
		case 5: 
			 
			   System.out.println("Perimeter Of Rectangle");
			   System.out.println("Enter length");
			   int length= sc.nextInt();
			   System.out.println("Enter Breadth");
			   int breadth=sc.nextInt();
			   int ans=2*(length+breadth);
			   System.out.println("Perimeter is "+ans);
			   break;  					 		   
		
		}
		
	}

}
