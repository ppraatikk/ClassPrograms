package com.Pratice;

public class Problem2 {

	public static void main(String[] args) {
		String str="Sham Playing Cricket in Stadium at Pune";
		
		String st[] = str.split(" ");
		String temp="";
		
		for(int i=0;i<st.length;i++)
		{
			
			String s1="";
			if(i==0 || i==st.length-1)
			{
				s1=st[i];
			}
			else
			{
				String s2=st[i];
				for(int j=s2.length()-1;j>=0;j--)
				{
					s1=s1+s2.charAt(j);
				}
			}
			
		 temp=temp+s1+" ";
		}
		
		System.out.println(temp);
		
		
	}

}
