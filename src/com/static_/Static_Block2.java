package com.static_;

public class Static_Block2 {
	
	public Static_Block2()
	{
		System.out.println("This is Consrructor");
	}
	
	static
	{
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is intilizer block");
	}

	public static void main(String[] args) {
		
		Static_Block2 sb1= new Static_Block2();
		Static_Block2 sb2= new Static_Block2();
	}

}
