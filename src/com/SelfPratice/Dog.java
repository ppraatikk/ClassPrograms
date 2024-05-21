package com.SelfPratice;

public class Dog {
	private String name;
	private String bread;
	 public Dog(String name,String bread)
	 {
	 	 this.name=name;
	 	 this.bread=bread;
	 }
	 public void display()
	 {
		 System.out.println(name+"  "+bread);
		
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public void setBread(String bread)
	 {
		 this.bread=bread;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public String getBread()
	 {
		 return bread;
	 }

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Tommy","Lab");
		Dog d2 = new Dog("Turbo","Jerman");
		d1.display();
	    d2.display();
		
		//Dog d = new Dog();
		d1.setName("Bhai");
		d1.setBread("Hybrid");
		System.out.println(d1.getName()+"  "+d1.getBread());
	
		
				
		
		
		
	}

}
