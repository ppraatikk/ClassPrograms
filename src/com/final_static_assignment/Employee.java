package com.final_static_assignment;
class Employe{
	int emp_id;
	String name;
	int salary;
	static int noOfEmploye=0;
	
	 Employe(int emp_id,String name,int salary)
	 {
		 this.emp_id=emp_id;
		 this.name=name;
		 this.salary=salary;
	 }
	  void display()
	 {
		 System.out.println(emp_id+" "+name+" "+salary);
		 System.out.println("-----------------------------------------------------");
		 noOfEmploye++;
	 }
	  static int totalemp()
	  {
		  return noOfEmploye;
	  }
	 
	 
}
public class Employee {

	public static void main(String[] args) {
		System.out.println("Employe INfO");
		Employe emp1 = new Employe(1,"SS",199);
		Employe emp2 = new Employe(2,"qw",299);
		Employe emp3 = new Employe(3,"rs",399);
		Employe emp4 = new Employe(4,"pp",499);
		
		emp1.display();
		emp2.display();
		emp3.display();
		emp4.display();
		int res = Employe.totalemp();
		System.out.println("Total Employee "+res);
		
	}

}
