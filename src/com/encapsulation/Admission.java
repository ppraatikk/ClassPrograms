package com.encapsulation;

public class Admission {

	public static void main(String[] args) {
		AdmissionInfo adm = new AdmissionInfo (); 
		adm.setId(11);
		adm.SetName("Pratik");
		adm.setMarks(60);
		
		
		if(adm.getMarks()>=60)
		{
			System.out.println("Student Is Eligible for Admission");
			System.out.println(adm.getId()+" "+adm.getName()+" "+adm.getMarks());
		}
		
	}

}
