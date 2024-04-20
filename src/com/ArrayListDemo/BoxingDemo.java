package com.ArrayListDemo;

public class BoxingDemo {

	public static void main(String[] args) {
		
		//Boxing Primitive-Object
		int y=100;
		Integer obj = new Integer(y);
		System.out.println(obj);
		
		//Auto Boxing
		int z=22;
		Integer obj1 = z;
		System.out.println(obj1);
		
		
		Integer obj2=new Integer("123");
		System.out.println(obj2);
		
//		No Format Exception
//		Integer obj3=new Integer("123ab");
//		System.out.println(obj3);
		
		char c='a';
		Character obj4=new Character(c);
		System.out.println(c);
		
		Character obj3=new Character('b');
		System.out.println(obj3);
		
		char ch='q';
		Character obj5=ch;
		System.out.println(obj5);
		
		
//		The constructor Character(String) is undefined
//		Character obj6=new Character("Z");
//		System.out.println(obj6);
		
		
		Boolean obj7=new Boolean(true);
		System.out.println(obj7);	
		
		boolean yes=false;
		Boolean obj8=yes;
		System.out.println(obj8);
		
		Boolean obj9=new Boolean("TrUE");
		System.out.println(obj9);
		
		float f=21.2f;
		Float obj10=f;
		System.out.println(obj10);
		
		Float obj11=new Float("12.34f");
		System.out.println(obj11);

		Float obj12=new Float("67.12");
		System.out.println(obj12);
	}



		
	

}
