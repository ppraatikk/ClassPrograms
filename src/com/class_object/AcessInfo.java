package com.class_object;

public class AcessInfo {

	public static void main(String[] args) {
		AcessModifier am =new AcessModifier();
		//System.out.println(am.x);  private acessmodifier
		System.out.println(am.y);
		System.out.println(am.a);
		System.out.println(am.b);
		am.show1();
		//am.show2();  private acessmethod
		am.show3();
		am.show4();
	}

}
