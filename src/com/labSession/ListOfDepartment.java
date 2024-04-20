package com.labSession;
import java.util.*;
class Emp{
	int eid;
	String ename;
	int esalary;
	public Emp(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}
class Depart{
	int did;
	String dname;
	ArrayList<Emp>l;
	public Depart(int did, String dname, ArrayList<Emp> l) {
		super();
		this.did = did;
		this.dname = dname;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", l=" + l + "]";
	}
	
	
}
public class ListOfDepartment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Depart>list=new ArrayList<>();
		System.out.println("Enter Department Details");
		System.out.println("Enter No Of Department");
		int deptno=sc.nextInt();
		
		for(int i=1;i<=deptno;i++)
		{
			System.out.println("Enter Dept id");
			int did=sc.nextInt();
			System.out.println("Enter dept name");
			String dname=sc.next();
			
			ArrayList<Emp>l=new ArrayList<>();
			System.out.println("Enter Emp Details");
			System.out.println("Enter No Of Employee");
			int empno=sc.nextInt();
			
			for(int j=1;j<=empno;j++)
			{
			 System.out.println("Enter Employee id");
			 int eid=sc.nextInt();
			 System.out.println("Enter Employee Name");
			 String ename=sc.next();
			 System.out.println("Enter Employee Salary");
			 int esalary=sc.nextInt();
			 l.add(new Emp(eid,ename,esalary));
			}
			list.add(new Depart(did,dname,l));
		}
		
		
		
		
		Iterator<Depart>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
