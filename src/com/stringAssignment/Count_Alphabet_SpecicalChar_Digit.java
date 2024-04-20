package com.stringAssignment;

public class Count_Alphabet_SpecicalChar_Digit {
	
	public static void count(String str)
	{
		int digit=0; int character=0; int specialCharacter=0;
		String st[]=str.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			String s=st[i];
			char ch[]=s.toCharArray();
		
		    for(int j=0;j<ch.length;j++)
	     	{
			   if(ch[j]>='A' && ch[j]<='Z')
			   {
			   character++;
			   }
			   else if(ch[j]>='a' && ch[j]<='z')
		    	{
				character++;
			   }
			  else if (ch[j]>='0' && ch[j]<='9')
			  {
				digit++;
			  }
			  else
			  {
				specialCharacter++;
			  }
		 }
		}	    
		System.out.println("Character : "+character);	
		System.out.println("Digit : "+digit);
		System.out.println("SpecialCharacter : "+specialCharacter);
		
	}

	public static void main(String[] args) {
		
		String str="hello freinds My name is Pratik Pratik@1234hmail.com";
		count(str);
	}

}
