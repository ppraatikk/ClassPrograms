package com.method_assignment;
//6) Create a class Account containing following methods :
//insert() to insert account data
//display() to display account information
//deposit() to deposit amount
//withdraw() to withdraw amount
//checkbalance() to check balance

import java.util.Scanner;
public class Account6 {
	 int acc_no;
	 String name;
	 float amount;
	
	 public void insert(int accno,String sname,float amountt)
	 {
		 acc_no=accno;
		 name=sname;
		 amount=amountt;
	 }
	 public void display()
	 {
		 System.out.println("A/C NO : "+acc_no);
		 System.out.println("NAME   : "+name);
		 System.out.println("BALENCE: "+amount);
	 }
	 public void deposit(float amt)
	 {
		 
		amount=amount+amt; 
		System.out.println("After Deposit :"+amount);
	 }
	 public void withdrwal(float with)
	 {
		 if(amount>2000)
		 {
			 amount=amount-with;
			 System.out.println("After Withdrwal : "+amount); 
		 }
		 else 
		 {
			 System.out.println("Amount is not sufficient to Withdrwal");
		 }
	 }	 
	 public void checkbalence()
	 {
		 System.out.println("Balence is : "+amount);
	 }
		
	 
	public static void main(String[] args) {
		String response =" ";
    do {
		Account6 a1=new Account6();
		a1.insert(203234322,"PRATIK",200);
		Scanner sc = new Scanner (System.in);
		 System.out.println("1.Display Account Information");
		 System.out.println("2.Deposit Amount");
		 System.out.println("3.Withdrwal Amount");
		 System.out.println("4.Check Balence");
		 System.out.println("5.STOP");
		 System.out.println("------------------");
		 System.out.println("Enter Your Choice");
		 int choice =sc.nextInt();
		
		 switch(choice)
		 {
		 case 1:System.out.println("Account Details-----");
			    a1.display();
		        break;
		 case 2://a1.deposit(3000);
			 
			 	System.out.println("Enter amount for deposite");
			 	float amount=sc.nextFloat();
			 	a1.deposit(amount);
		        break;
		 case 3://a1.withdrwal();
			     System.out.println("Enter Amount to Withdrwal");
			     float amt=sc.nextFloat();
			     a1.withdrwal(amt);
		 		break;
		 case 4:a1.checkbalence();
		 		break;
		 
		 }
		 System.out.println("Do you Want to continue....(yes/no)");
		 response = sc.next();
		 
    }while(response.equals("yes"));	
		
		
		
		
		
		

	}

}



	
