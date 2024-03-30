package com.method_assignment;
//7) Create class student and write a meaningful program with 3 methods (1 with return type 
//(calculating percentage), 1 without return
//type (displaying student data), 1 with parameter list).

public class Student7 {
	
	
	public float percentage(int subj1,int subj2,int subj3 )
	{
		float per=(subj1+subj2+subj3)*100/300;
		return per;
	}
	public void display(int rollno,String name,String address,float res)
	{
		System.out.println("Student Roll_NO : "+rollno);
		System.out.println("Student Name    : "+name);
		System.out.println("Student Address : "+address);
		System.out.println("Marks Obtained  : "+res);
	}
	

	public static void main(String[] args) {
		Student7 s1=new Student7();
		float res=s1.percentage(89,67,99); 
		s1.display(12,"PRATIK", "Latur", res);
	}

}

