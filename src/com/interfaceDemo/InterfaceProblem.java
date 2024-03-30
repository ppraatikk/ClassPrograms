package com.interfaceDemo;

 interface Addable{
	 int x=10;
	void add();
}
abstract class Total {
	int y=20;
	public void add()
	{
		System.out.println(Addable.x+y);
	}	 
}
  class Child extends Total implements Addable{
	
	 void show()
	 {
		 System.out.println(x+y);
	 }
 }
public class InterfaceProblem {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.add();
		c.show();

	}

}
