package com.stringAssignment;

public class LengthConcatCompareLoweUpper {
	
	public static void findLength(String st)
	{
		System.out.println(st.length());
	}
	public static void concatenate(String st,String st1)
	{
		System.out.println(st.concat(st1));
		System.out.println(st+st1);	
	}
	public static void compare(String st,String st1)
	{
		System.out.println(st.compareTo(st1));
	}
	public static void lowerToUpper(String st)
	{
		System.out.println(st.toUpperCase());
	}
	public static void upperToLower(String st )
	{
		System.out.print(st.toLowerCase());
	}

	

	public static void main(String[] args) {
	

		String st= "How Are";
		String st1= "You";
		
		LengthConcatCompareLoweUpper.findLength(st);
		LengthConcatCompareLoweUpper.concatenate(st,st1);
		LengthConcatCompareLoweUpper.lowerToUpper(st);
		LengthConcatCompareLoweUpper.compare(st,st1);
		LengthConcatCompareLoweUpper.upperToLower(st);
	}

}
