package com.final_static_assignment;
class FinalDemo{
	   final int x=99;
         // cannot change value of x because of final keyword
       final void method2()
       {
	   System.out.println("Final type method in parent class");
      }
}
 class Child extends FinalDemo{  //class cannot extends because of final keyword
	   

//	   @Override
//	   void method2()
//	   {
//		                             //FinalDemoChild cannot override method2
//		                        //because of final      
//	   }
	 void show()
	 {
	 super.method2();  //final method can be inherit in child class method 
	                    // using super keyword  
	 }
}
   
public class FinalDemo10 {
	  
	public static void main(String[] args) {
		//FinalDeno fd = new FinalDemo();
		//fd.x=11;     cannot assign value again because of final keyword 
		Child c = new Child();
		c.show();
	}

}
