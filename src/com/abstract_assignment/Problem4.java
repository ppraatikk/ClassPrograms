package com.abstract_assignment;

 abstract class PublicTransport{
		int x=1;
//		abstract void show();
//		void show1()
//		{
//			System.out.println("Show1......"+x);
//		}
}
class Bus extends PublicTransport{
	int x=10;
	//@Override
	  void show()
	  {
		  System.out.println("Show...."+x+" "+super.x);
	  }
}

public class Problem4 {

	public static void main(String[] args) {
		PublicTransport p = new Bus();
//		p.show();
//		p.show1();
		
		Bus b = new Bus();
		b.show();
		
	}

}
