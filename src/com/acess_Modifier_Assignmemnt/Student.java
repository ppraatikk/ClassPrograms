package com.acess_Modifier_Assignmemnt;

public class Student {
	
	private int rollno=12;
	protected int admissionno=13;
	int ageId=14;
	public int courseId=15;
	
	 public void doPublic()
	{
		System.out.println("Public method");
	}
	 void doDefault()
	{
		System.out.println("Deafault Method");
	}
	 private void doPrivate()
	{
	  	System.out.println("Private Method");
	}
	protected void doProtected()
	{
		System.out.println("Proteced Method");
	}
	public static void main(String[] args) {
		

	}

}
