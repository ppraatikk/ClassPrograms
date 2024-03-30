package com.arrayObject_Assignment;

public class Employee {

	private int eid;
	private String ename;
	private double esal;
	
	public Employee(){
		
	}
	
	public Employee(int eid,String ename,double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	//getters and setter
	
	public String toString() {
		
		return "id:"+eid+" Name:"+ename+" salary:"+esal;
	}
	public void setSal(double esal) {
		this.esal=esal;
	}
	
	public double getSal() {
		return esal;
	}
}

