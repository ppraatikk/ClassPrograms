package com.basic;

import com.class_object.*;

public class AcsMod extends AcessModifier {

	public static void main(String[] args) {
		
		AcessModifier am = new AcessModifier();
		//System.out.println(am.x); private 
		//System.out.println(am.y);  default
		//System.out.println(am.a); protected
		System.out.println(am.b);
		
		am.show1();
		//am.show2(); private 
		//am.show3(); protected 
 		//am.show4(); default
		
		AcsMod acs = new AcsMod();
		//System.out.println(acs.x); //private 
		//System.out.println(acs.y);  //default
		System.out.println(acs.a); //protected
		System.out.println(acs.b);
				
				acs.show1();
			//	acs.show2(); //private 
				acs.show3(); //protected 
		 	//  acs.show4(); //default
		
		
	}

}
