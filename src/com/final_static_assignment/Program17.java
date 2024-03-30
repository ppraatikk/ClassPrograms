package com.final_static_assignment;
class Result{
	 public static void show()
	 {
		 System.out.println("parent class method");
	 }
}
class Marks extends Result{
	//@Override   static method are not Override its hidden or shadowed
//	public static void show()
//	{
//		System.out.println("child class method");
//	}
//	
}
public class Program17 {

	public static void main(String[] args) {
		// m = new Marks();
		Marks.show();

	}

}
