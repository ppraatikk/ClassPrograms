package com.final_static_assignment;

public class Additional_2 {
	  double balence;
	    Additional_2(double balence)
	    {
	    this.balence=balence;
	    }
	    void withdraw(double withdraw)
	    {
	    	if(withdraw<=balence)
	    	{
	    	balence=balence-withdraw;
	    	System.out.println("SucessFully Withdraw . Remaining Amount is : "+balence);
	    	}
	    	else 
	    	{
	    	System.out.println("InSufficient Balence");
	    	}
	    }
	    void debitcard(double debitcard)
	    {
	    	if(debitcard<=balence)
	    	{
	    	balence=balence-debitcard;
	    	System.out.println("Sucessfully Debited . Remaining Amount is : "+balence);
	    	}
	    	else
	    	{
	    	 System.out.println("Insufficient Balence");
	    	}
	    }
	    void netbanking(double netbanking)
	    {
	    	if(netbanking<=balence)
	    	{
	    	balence=balence-netbanking;
	    	System.out.println("Sucessfully Completed .Remaining Amount is : "+balence);
	    	}
	    	else
	    	{
	    	 System.out.println("Insufficient Balence");
	    	}
	    }

	public static void main(String[] args) {
		
		Additional_2 a = new Additional_2(2000);
		a.withdraw(300);
		a.debitcard(200);
		a.netbanking(100);
	}

}
