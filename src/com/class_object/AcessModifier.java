package com.class_object;

public class AcessModifier {
	
	private int x=10;
	 int y=20;
	 protected int a=30;
	 public int b=40;
	 
	 public void show1()
	 {
		 System.out.println("This is Public Method");
	 }
	 private void show2()
	 {
		 System.out.println("This is Private Method");
	 }
	 protected void show3()
	 {
		 System.out.println("This is Protected method");
	 }
	 void show4()
	 {
		 System.out.println("this is default method");
	 }
	 

	public static void main(String[] args) {
		
		AcessModifier am= new AcessModifier();
		System.out.println(am.x);
		System.out.println(am.y);
		System.out.println(am.a);
		System.out.println(am.b);
		am.show1();
	    am.show2();
	    am.show3();
	    am.show4();
		
	}

}
