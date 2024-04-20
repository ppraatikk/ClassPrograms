package com.stringAssignment;

public class CheckMail_id {

	public static boolean validMail(String str)
	{
		if(str.contains("@") && str.contains("."))
		   return true;
		else
		   return false;
	}
	public static void main(String[] args) {
		
		String str="xyz123@gmail.com";
		boolean result=CheckMail_id.validMail(str);
		
		if(result)
			System.out.println("Valid Email Id");
		else
			System.out.println("Not Valid Emaild Id");

	}

}
