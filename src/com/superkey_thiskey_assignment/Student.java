package com.superkey_thiskey_assignment;

public class Student {
	private int id ;
	private String name;
	
	public void setId(int id)
	{
		this.id=id;                     // if we remove this it gives null value or zero
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}

	public static void main(String[] args) {
		 
		Student s1 = new Student ();
		Student s2 = new Student ();      // this is not use in main method 
										  // because of static	
	   s1.setId(11);			// Cannot make a static reference to the non-static field id	
	   s2.setId(21);
	   System.out.println("student1: "+s1.getId()+" "+"Student2: "+s2.getId());
	   
	  
	  
	   
	   
	}

}
