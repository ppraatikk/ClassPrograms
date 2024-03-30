package com.final_static_assignment;

class Personn{
	String name = "S S DESHMUKH";	
	int adhar;
	  void show()
	  {
		  System.out.println("Parent class method");
	  }
	  Personn(int adhar)
	  {
		  this.adhar=adhar;
		  System.out.println(adhar);
	  }
}
class Employ extends Personn{
	String name ="A P QWEAST";
	  
	       void print()
	       {
	    	   System.out.println(name+"  "+super.name);
	    	   super.show();
	       }
	       Employ()
	       {
	    	  super(1123456789); 
	       }
}

public class Problem7 {

	public static void main(String[] args) {
		Employ e = new Employ();
		e.print();
	}

}
