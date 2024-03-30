package com.method_assignment;
//9) Write java Program for arithmetic operation for each operation write separate Method using 
//parameter Passing

public class Airthmatic9 {
	
	public void add(float x,float y)
	{
		System.out.println("Addition is : "+(x+y));
	}
	public void sub(float x,float y)
	{
		System.out.println("Substraction is : "+(x-y));
	}
	public void mul(float x,float y)
	{
		System.out.println("Multiplication is : "+(x*y));
	}
	public void div(float x,float y)
	{
		System.out.println("Division is : "+(x/y));
	}

	public static void main(String[] args) {
		Airthmatic9 a1=new Airthmatic9();
		a1.add(34f,456f);
		a1.sub(45.9f,1.9f);
		a1.mul(20f,2f);
		a1.div(45f,9f);
	}

}

	

	


