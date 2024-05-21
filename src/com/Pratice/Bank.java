package com.Pratice;


public class Bank {

	public static void main(String[] args) {
		BankAccount ac=new BankAccount();
		
		ac.setAccno(20325759);
		ac.setBalence(2000);
		
		 
		System.out.println(ac.getAccno()+"  "+ac.getBalence());
		
		ac.deposit(2000);
		ac.withdraw(4002);
	}

}
