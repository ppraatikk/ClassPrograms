package com.final_static_assignment;

public class Problem14 {
	 static final int z;
	  static {
		  z=11;
		  System.out.println(z);
	  }
	  Problem14()
	  {
		//z=1;
	  }
	  Problem14(final int z)
	  {
		// this. z=11;
		 // this.z=z;
	  }
	  void show()
	  {
		  System.out.println("instance mthod");
	  }
	  static void show1()
	  {
		  System.out.println("static method");
	  }

	public static void main(String[] args) {
		
		Problem14 p = new Problem14();
		p.show();
		p.show1();
	}

}
