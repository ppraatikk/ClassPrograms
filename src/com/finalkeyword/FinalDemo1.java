package com.finalkeyword;

public class FinalDemo1 {
	final int x=10; // Declaration and initialization of final variable
	final int y;    // declaration
	 FinalDemo1(int y)  
	 {
		 this.y=y;  // Initialize value using constructor
	 }
	final public void show()    //  final method overload 
	{
		System.out.println(x);
		System.out.println(y);
	}
	int z;
	final public void show(int z)  // final method overload
	{		this.z=z;
		System.out.println(x+" "+y+" "+z);
	}
	
	
	final static int a=1;   // final static variable declaration;
	final static int b;
	static {
		b=2;    // static block for declaration of final static variable
	}
	
	final public static void display()  // static method 
	{
		System.out.println(a+" "+b);
	}
	  int c;
	final public static void display(int c) {
	   
		System.out.println(a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		FinalDemo1 f = new FinalDemo1(11);
		f.show();
		f.show(12);
		FinalDemo1.display(); // call static method using class name 
		FinalDemo1.display(3);
	}

}
